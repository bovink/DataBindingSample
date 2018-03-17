package com.bovink.databindingsample.model;

/**
 * @author bovink
 * @since 2018/3/17
 */

public class JavaBeansUser {

    private final String firstName;
    private final String lastName;

    public JavaBeansUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
