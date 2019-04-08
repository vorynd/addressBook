package dao;

import entity.Contact;

public interface ContactDao {

    void saveContact(Contact contact);

    Contact findContactById(int id);

    void editContact(Contact contact);

    void deleteContactById(int id);

    void showAllContacts();

    void deleteContact(Contact contact);


}
