package com.motiv.motivclient;

import com.motiv.motivclientlogic.ContactLogic;

public class ContactController {
    private static ContactLogic contactLogic;

    public ContactController(ContactLogic contactLogic) {
        this.contactLogic = contactLogic;
    }
}
