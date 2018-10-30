package com.motiv.motivclientinterfaces;

import com.motiv.motivclientmodels.Contact;

public interface IContactRepository {
    void create(Contact contact);
    void remove(int id);
    void update(Contact contact);
    void delete(int id);
}
