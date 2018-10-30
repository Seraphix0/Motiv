package com.motiv.motivclientinterfaces;

import com.motiv.motivclientmodels.Contact;

import java.util.List;

public interface IContactRepository {
    List<Contact> readAll();
    void create(Contact contact);
    Contact read(int id);
    void update(Contact contact);
    void delete(int id);
}
