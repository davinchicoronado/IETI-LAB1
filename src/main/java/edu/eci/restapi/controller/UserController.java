package edu.eci.restapi.controller;

import edu.eci.restapi.data.User;
import edu.eci.restapi.dto.UserDto;
import edu.eci.restapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/v1/user" )
public class UserController {

    private final UserService userService;

    public UserController(@Autowired UserService userService )
    {
        this.userService = userService;
    }
    @GetMapping
    public ResponseEntity<List<User>> all()
    {
        return new ResponseEntity<>(userService.all(), HttpStatus.ACCEPTED);
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<User> findById( @PathVariable String id )
    {
        return new ResponseEntity<>(userService.findById(id),HttpStatus.ACCEPTED);
    }


    @PostMapping
    public ResponseEntity<User> create( @RequestBody UserDto userDto )
    {
        User user = new User(userDto);
        return new ResponseEntity<>(userService.create(user),HttpStatus.CREATED);
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<User> update( @RequestBody UserDto userDto, @PathVariable String id )
    {
        User user = new User(userDto);
        return new ResponseEntity<>(userService.update(user,id),HttpStatus.ACCEPTED);
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id )
    {
        return new ResponseEntity<>(userService.deleteById(id),HttpStatus.ACCEPTED);
    }

}
