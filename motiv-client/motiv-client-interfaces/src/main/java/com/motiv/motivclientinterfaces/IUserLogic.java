package com.motiv.motivclientinterfaces;

import com.motiv.motivclientmodels.Contact;

public interface IUserLogic {
    void addUser(Contact contact);
    Contact getUser(int id);
    void modifyUser(Contact contact);
    void removeUser(int id);
}
