package edu.eci.restapi.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class UserDto {

    private String name;
    private String lastName;
    private String email;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date created;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Date getCreated() {
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

    public void setCreated(Date created) {
        this.created = created;
    }
}
