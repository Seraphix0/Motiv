package com.motiv.motivclientlogic;

import com.motiv.motivclientinterfaces.IContactLogic;
import com.motiv.motivclientinterfaces.IContactRepository;
import com.motiv.motivclientmodels.Contact;

public class ContactLogic implements IContactLogic {

    private static IContactRepository contactRepository;

    public ContactLogic(IContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public void addContact(Contact contact) {

    }

    public Contact getContact(int id) {
        return null;
    }

    public void modifyContact(Contact contact){

    }

    public void removeContact(int id) {

    }

    public void callContact() {

    }

    public void messageContact() {

    }

    public void pokeContact() {

    }
}
