package service.impl;

import dao.ContactDao;

import entity.Contact;
import service.ContactService;

import java.util.Scanner;

public class ContactServiceImpl implements ContactService {

    private ContactDao contactDao;


    public ContactServiceImpl(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    public void addContact(Scanner scanner) {
        Contact contact = new Contact();

        System.out.println("Please enter name:");
        String name = scanner.next();
        contact.setName(name);

        System.out.println("Please enter surname:");
        String surname = scanner.next();
        contact.setSurName(surname);

        System.out.println("Please enter phone number:");
        String phoneNumber = scanner.next().replaceAll("[^0-9+]", "");
        contact.setPhoneNumber(phoneNumber);

        contactDao.saveContact(contact);
        System.out.println("Thank you. Contact saved.");
        System.out.println();
    }

}

