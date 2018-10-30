package com.motiv.motivclientrepository;

import com.motiv.motivclientinterfaces.IContactContext;
import com.motiv.motivclientinterfaces.IContactRepository;
import com.motiv.motivclientmodels.Contact;

public class ContactRepository implements IContactRepository {

    private static IContactContext contactContext;

    public ContactRepository(IContactContext contactContext) {
        this.contactContext = contactContext;
    }

    public void create(Contact contact) {

    }

    public void remove(int id) {

    }

    public void update(Contact contact) {

    }

    public void delete(int id) {

    }
}
