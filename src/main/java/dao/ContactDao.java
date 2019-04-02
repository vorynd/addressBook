package dao;

import entity.Contact;

public class ContactDao {

    public static int generator = 1;

    Contact[] store = new Contact[10];

    public void saveContact(Contact contact) {
        for (int argument = 1; argument <= store.length; argument++) {
            if (store[argument] == null) {
                generator = argument;
                contact.setId(generator);
                store[argument] = contact;
                System.out.println("This contact was added in your contact book");
                break;
            }
        }
    }

    public Contact[] getStore() {
        return store;
    }
}



