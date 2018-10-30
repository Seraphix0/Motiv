package com.motiv.motivfactory;

import com.motiv.motivclientdal.context.ContactContext;
import com.motiv.motivclientdal.context.UserContext;
import com.motiv.motivclientlogic.ContactLogic;
import com.motiv.motivclientlogic.UserLogic;
import com.motiv.motivclientrepository.ContactRepository;
import com.motiv.motivclientrepository.UserRepository;

public class Factory {
    private static Factory instance = new Factory();

    private Factory() {}

    public static Factory getInstance() {
        return instance;
    }

    public UserLogic getUserLogic() {
        return new UserLogic(new UserRepository(new UserContext()));
    }

    public ContactLogic getContactLogic() {
        return new ContactLogic(new ContactRepository(new ContactContext()));
    }
}