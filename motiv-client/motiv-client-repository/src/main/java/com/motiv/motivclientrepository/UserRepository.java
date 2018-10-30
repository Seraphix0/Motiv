package com.motiv.motivclientrepository;

import com.motiv.motivclientinterfaces.IUserContext;
import com.motiv.motivclientinterfaces.IUserRepository;
import com.motiv.motivclientmodels.User;

import java.util.List;

public class UserRepository implements IUserRepository {
    private  IUserContext userContext;

    public UserRepository(IUserContext userContext) {
        this.userContext = userContext;
    }

    public List<User> readAll() {
        return this.userContext.readAll();
    }

    public void create(User user) {
        this.userContext.create(user);
    }

    public User read(int id) {
        return this.userContext.read(id);
    }

    public void update(User user) {
        this.userContext.update(user);
    }

    public void delete(int id) {
        this.userContext.delete(id);
    }
}
