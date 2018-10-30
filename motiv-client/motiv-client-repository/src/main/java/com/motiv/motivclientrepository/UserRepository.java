package com.motiv.motivclientrepository;

import com.motiv.motivclientinterfaces.IUserContext;
import com.motiv.motivclientinterfaces.IUserRepository;
import com.motiv.motivclientmodels.User;

public class UserRepository implements IUserRepository {
    private static IUserContext userContext;

    public UserRepository(IUserContext userContext) {
        this.userContext = userContext;
    }

    public void create(User user) {

    }

    public void remove(int id) {

    }

    public void update(User user) {

    }

    public void delete(int id) {

    }
}
