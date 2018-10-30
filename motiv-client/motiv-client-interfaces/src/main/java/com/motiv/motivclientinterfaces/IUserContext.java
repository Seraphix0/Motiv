package com.motiv.motivclientinterfaces;

import com.motiv.motivclientmodels.User;

import java.util.List;

public interface IUserContext {
    List<User> readAll();
    void create(User contact);
    User read(int id);
    void update(User contact);
    void delete(int id);
}
