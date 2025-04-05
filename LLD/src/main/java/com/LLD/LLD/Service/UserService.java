package com.LLD.LLD.Service;

import com.LLD.LLD.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService implements IUserService{
    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User updateUser(Integer userID, User user) {
        return null;
    }

    @Override
    public void deleteUser(Integer userID) {

    }

    @Override
    public User getUser(Integer userID) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return List.of();
    }
}
