package service;

import dao.ContactDao;
import entity.Contact;

import java.util.Scanner;

public class ContactService {

    ContactDao contactDao = new ContactDao();

    public void addContact(Scanner scanner) {
        Contact contact = new Contact();

        System.out.println("Please enter name:");
        String name = scanner.next();
        contact.setName(name);

        System.out.println("Please enter surname:");
        String surname = scanner.next();
        contact.setSurName(surname);

        System.out.println("Please enter phone number:");
        String phoneNumber = scanner.next().replaceAll("[^0-9+]","");
        contact.setPhoneNumber(phoneNumber);

        contactDao.saveContact(contact);
        System.out.println("Thank you. Contact saved.");
    }
}
