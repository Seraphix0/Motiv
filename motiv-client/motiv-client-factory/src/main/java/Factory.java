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