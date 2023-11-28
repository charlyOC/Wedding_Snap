package com.wedding.snap.Controller;

import com.wedding.snap.DAO.User;
import com.wedding.snap.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/createUser")
public class CreateUserController {
    private final UserService userService;

    @Autowired
    public CreateUserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return  userService.createUser(user);
    }
}
