package com.motiv.motivclientlogic;

import com.motiv.motivclientinterfaces.IUserRepository;
import com.motiv.motivclientmodels.User;

public class UserLogic {

    private static IUserRepository userRepository;

    public UserLogic(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    void addUser(User user) {

    }

    User getUser(int id) {
        return null;
    }

    void modifyUser(User user) {

    }

    void removeUser(int id) {

    }
}
