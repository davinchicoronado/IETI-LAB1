package edu.eci.restapi.dto;

import java.util.Date;

public class UserDto {

    private String name;
    private String lastName;
    private String email;
    private String created;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCreated() {
        return created;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
