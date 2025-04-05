package com.LLD.LLD.Service;

import com.LLD.LLD.Model.Hotel;
import com.LLD.LLD.Model.User;

import java.util.List;

public interface IUserService {
    User addUser(User user);
    User updateUser(Integer userID, User user);
    void deleteUser(Integer userID);
    User getUser(Integer userID);
    List<User> getUsers();
}
