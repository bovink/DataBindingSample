package com.bovink.databindingsample.model;

/**
 * @author fox
 * @since 2018/04/10
 */

public class User {

    private String firstName;
    private String lastName;
    private boolean isAdult;

    public User(String firstName, String lastName, boolean isAdult) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdult = isAdult;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }
}
