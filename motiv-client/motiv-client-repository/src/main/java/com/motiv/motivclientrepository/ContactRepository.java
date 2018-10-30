package com.motiv.motivclientrepository;

import com.motiv.motivclientinterfaces.IContactContext;
import com.motiv.motivclientinterfaces.IContactRepository;
import com.motiv.motivclientmodels.Contact;

import java.util.List;

public class ContactRepository implements IContactRepository {

    private IContactContext contactContext;

    public ContactRepository(IContactContext contactContext) {
        this.contactContext = contactContext;
    }

    public List<Contact> readAll() {
        return this.contactContext.readAll();
    }

    public void create(Contact contact) {
        this.contactContext.create(contact);
    }

    public Contact read(int id) {
        return this.contactContext.read(id);
    }

    public void update(Contact contact) {
        this.contactContext.update(contact);
    }

    public void delete(int id) {
        this.contactContext.delete(id);
    }
}
