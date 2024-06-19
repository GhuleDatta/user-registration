package com.makersharks.user_registration.controller;

import com.makersharks.user_registration.entity.User;
import com.makersharks.user_registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserRestController {

    // injecting user service //
    private UserService userService;

    // injecting in the bean factory //
    @Autowired
    UserRestController(UserService userService)
    {
        this.userService=userService;
    }

    @GetMapping("/fetch")
    public List<User> getAllUsers()
    {
        return userService.fetchAllUsers();
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@RequestBody User theUser)
    {
        //theUser.setUser(null);
        return userService.saveUser(theUser);
    }

    @DeleteMapping("{id}")
    public String deleteUserById(@PathVariable int id)
    {
        User theUser=userService.fetchUserById(id);

        if(theUser==null)
        {
            throw new RuntimeException("User Not Found With Id: "+id);
        }

        userService.deleteById(id);
        return "Deleted User With ID: "+id;
    }

    @PutMapping("/update-user")
    public User updateUser(@RequestBody User theUser)
    {
        return userService.saveUser(theUser);
    }

    @GetMapping("/fetch/{userName}")
    public User findUserByUserName(@PathVariable String userName)
    {
        return userService.findUserByUserName(userName);
    }
}
