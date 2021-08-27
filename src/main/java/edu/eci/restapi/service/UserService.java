package edu.eci.restapi.service;

import edu.eci.restapi.data.User;

import java.util.List;

public interface UserService
{
    User create(User user );

    User findById( String id );

    List<User> all();

    boolean deleteById( String id );

    User update( User user, String userId );
}
