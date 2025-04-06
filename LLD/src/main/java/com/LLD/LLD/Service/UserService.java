package com.LLD.LLD.Service;

import com.LLD.LLD.Model.User;
import com.LLD.LLD.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService implements IUserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Integer userID, User user) {
        User userObject = userRepository.findById(userID).get();
        userObject.setName(user.getName());
        userObject.setEmail(user.getEmail());
        userObject.setPhone(user.getPhone());
        userObject.setRole(user.getRole());
        userObject.setPasswordHash(user.getPasswordHash());
        return userRepository.save(userObject);
    }

    @Override
    public void deleteUser(Integer userID) {
        userRepository.deleteById(userID);
    }

    @Override
    public User getUser(Integer userID) {
        return userRepository.findById(userID).get();
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
