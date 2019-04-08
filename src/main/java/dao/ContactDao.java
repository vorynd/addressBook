package dao;

import entity.Contact;

public interface ContactDao {

    /**
     * saves new contact
     * @param contact entity to save
     */
    void saveContact(Contact contact);

    /**
     * finds contact by it's id
     * @param id of contact to find
     * @return entity of found contact
     */
    Contact findContactById(int id);

    /**
     * saves edited contact
     * @param contact entity to save as edited contact
     */
    void editContact(Contact contact);

    /**
     * deletes contact by id
     * @param id of contact to delete
     */
    void deleteContactById(int id);

    /**
     * shows all saved contacts
     */
    void showAllContacts();

    /**
     * deletes contact by entity
     * @param contact entity to delete
     */
    void deleteContact(Contact contact);

    /**
     * finds and shows all saved contacts with the name you are looking for
     * @param name of contacts to find
     */
    void findContactByName(String name);


}
