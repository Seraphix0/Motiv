package com.motiv.motivclientinterfaces;

import com.motiv.motivclientmodels.User;

public interface IUserRepository {
    void create(User user);
    void remove(int id);
    void update(User user);
    void delete(int id);
}
