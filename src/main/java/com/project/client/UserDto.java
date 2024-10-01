package com.project.client;

public class UserDto {
    private String firstName;
    private String lastName;
    private String middleName;
    private String identityDocument;

    public UserDto(String firstName, String lastName, String middleName, String identityDocument) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.identityDocument = identityDocument;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getIdentityDocument() {
        return identityDocument;
    }
}
