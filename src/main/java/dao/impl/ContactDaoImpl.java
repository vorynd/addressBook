package dao.impl;

import dao.ContactDao;
import entity.Contact;

public class ContactDaoImpl implements ContactDao {

    public static int generator = 0;

    private Contact[] store = new Contact[10];

    public void saveContact(Contact contact) {
//        for (Contact contactFromStore : getStore()) {
//            if (contact != null && contact.getName().equals(contactFromStore.getName())&&contact
//            .getSurName().equals(contactFromStore.getSurName())&&contact.getPhoneNumber().equals(contactFromStore.getPhoneNumber())){
//
//            }
//        }

        for (int argument = 0; argument < store.length; argument++) {
            if (store[argument] == null) {
                generator = argument;
                contact.setId(++generator);
                store[argument] = contact;
                System.out.println("Contact was added to your contact book");
                System.out.println(contact.toString());
                break;
            }
        }
    }

    public Contact[] getStore() {
        return store;
    }

    public Contact findContactById(int id) {
        for (int index = 0; index < store.length; index++) {
            if (store[index] != null && store[index].getId() == id) {
                return store[index];
            }
        }
        return null;
    }

    public void showAllContacts() {
        for (Contact contact : store) {
            if (contact != null) {
                System.out.println(contact);
            }
        }
        System.out.println();
    }

    public void deleteContactById(int id) {
        for (int index = 0; index < store.length; index++) {
            if (store[index] != null && store[index].getId() == id) {
                store[index] = null;
                break;
            }
        }
    }

    public void editContact(Contact contact) {
        for (int index = 0; index < store.length; index++) {
            if (store[index] != null && store[index].getId() == contact.getId()) {
                store[index] = contact;
                System.out.println("Contact edited");
                System.out.println(contact.toString());
                break;
            }

        }
    }

    public void deleteContact(Contact contact) {
        for (int index = 0; index < store.length; index++) {
            if (store[index] != null && store[index].getId() == contact.getId()) {
                store[index] = null;
                break;
            }
        }
    }


    public void findContactByName(String name) {
        boolean found = false;
        for (int index = 0; index < store.length; index++) {
            if (store[index] != null && store[index].getName().equals(name)) {
                found = true;
                System.out.println(store[index].toString());
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
        System.out.println();
    }
}






