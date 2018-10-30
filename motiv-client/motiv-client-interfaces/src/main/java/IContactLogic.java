public interface IContactLogic {
    void addContact(Contact contact);
    Contact getContact(int id);
    void modifyContact(Contact contact);
    void removeContact(int id);

    void callContact();
    void messageContact();
    void pokeContact();
}
