package service;

import entity.Contact;

import java.util.Scanner;

/**
 *
 */
public interface ContactService {

    /**
     * allows to add contact
     *
     * @param scanner expected input of name, surname and phone number
     */
    void addContact(Scanner scanner);

    /**
     * shows all saved contacts
     */
    void showAllContacts();

    /**
     * allows to delete contact by id
     *
     * @param scanner expected input of contact id to delete
     */
    void deleteContact(Scanner scanner);

    /**
     * allows to edit contact information by id
     *
     * @param scanner expected input of contact id to edit and name, surname and phone number
     */
    void editContact(Scanner scanner);

    /**
     * edit contact information
     *
     * @param contact entity of contact to edit
     * @param scanner expected input of menu items
     * @return new edited entity of contact
     */
    Contact editContactFields(Contact contact, Scanner scanner);

    /**
     * allows to find contact by name
     *
     * @param scanner expexted input of contact id to find
     */
    void findByName(Scanner scanner);

}
