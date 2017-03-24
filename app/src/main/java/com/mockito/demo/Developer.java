package com.mockito.demo;

/**
 * Created by nling on 3/16/2017.
 */
public class Developer {

    enum Role {
        ANDROID,
        IOS,
        FRONTEND,
        BACKEND,
        WINDOWS
    }

    String name;
    Role role;
    int age;

    public Developer(String name, int age, Role role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
