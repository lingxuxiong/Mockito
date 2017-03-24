package com.mockito.demo;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void mockList() {
        List mockList = Mockito.mock(List.class);
        mockList.add("one");
        mockList.clear();

        verify(mockList).add("one");
        verify(mockList).clear();

    }

    @Test
    public void mockLinkedList() {
        LinkedList<String> mockList = mock(LinkedList.class);
        when(mockList.get(0)).thenReturn("Hello Mockto");

        System.out.println(mockList.get(0));

        System.out.println(mockList.get(1));
    }

}