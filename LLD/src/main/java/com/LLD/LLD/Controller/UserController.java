package com.LLD.LLD.Controller;

import com.LLD.LLD.Model.User;
import com.LLD.LLD.Service.IUserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    final Log LOGGER = LogFactory.getLog(UserController.class);

    @PostMapping("/save")
    public ResponseEntity<?> addUser(@RequestBody User user) {
        User newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping("/get/{userID}")
    public ResponseEntity<?> getUserByID(@PathVariable Integer userID) {
        User user = userService.getUser(userID);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<?> getUsers() {
        List<User> users = userService.getUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PutMapping("/update/{userID}")
    public ResponseEntity<?> updateUser(@PathVariable Integer userID, @RequestBody User updatedUser) {

        User user = userService.updateUser(userID, updatedUser);
        LOGGER.info(updatedUser);
        return new ResponseEntity<>(user, HttpStatus.FOUND);
    }

    @DeleteMapping("/delete/{userID}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer userID) {
        userService.deleteUser(userID);
        return new ResponseEntity<>("User Deleted Successfully", HttpStatus.OK);
    }
}
