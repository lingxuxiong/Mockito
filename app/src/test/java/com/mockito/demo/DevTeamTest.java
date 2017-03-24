package com.mockito.demo;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

/**
 * Created by nling on 3/16/2017.
 */
public class DevTeamTest {

    @Test
    public void testAddDevelopers() throws Exception {

    }

    @Test
    public void testAddDeveloper() throws Exception {
        DevTeam team = new DevTeam();
        String name = "Neil";
        Developer developer = new Developer(name, 20, Developer.Role.ANDROID);
        team.addDeveloper(developer);
        List<Developer> devsShareSameName = team.getDeveloperByName(name);
        for (Developer dev : devsShareSameName) {
            assertEquals(name, dev.getName());
        }
    }

    @Test
    public void testGetDevelopersNumber() throws Exception {
        // TDD style test.
        // arrange
        DevTeam team = Mockito.mock(DevTeam.class);
        System.out.println("team num:" + team.getDevelopersNumber());
        when(team.getDevelopersNumber()).thenReturn(4);

        // act
        int num = team.getDevelopersNumber();

        // assert
        assertEquals(num, 4);
    }

    @Test
    public void testGetDevelopersSize() throws Exception {
        // BDD style test.
        // given
        DevTeam team = Mockito.mock(DevTeam.class);
        System.out.println("team size:" + team.getDevelopersSize());
        given(team.getDevelopersSize()).willReturn(4);

        // when
        int size = team.getDevelopersSize();

        // then
        assertEquals(size, 4);
    }
}