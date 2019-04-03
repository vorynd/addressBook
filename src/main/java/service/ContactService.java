package service;

import dao.ContactDao;
import entity.Contact;

import java.util.Scanner;

public class ContactService {

    private ContactDao contactDao;


    public ContactService(ContactDao contactDao) {
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

    public void showContact(Scanner scanner) {
        System.out.println(contactDao.findContact(scanner.nextInt()));
    }

    public void showAll() {
        contactDao.showAllContacts();
    }

    public void delete(Scanner scanner) {
        System.out.println("Please enter id of contact you want to delete:");
        int temp = scanner.nextInt();
        if (contactDao.findContact(temp) != null) {
            System.out.println("Are you sure you want to delete this contact (y/n)?");
            System.out.println(contactDao.findContact(temp));
            if (scanner.next().equals("y")) {
                contactDao.deleteContact(contactDao.findContact(temp));
                System.out.println("Contact deleted");
                System.out.println();
            } else {
                System.out.println("Changes canceled.");
                System.out.println();
            }
        } else {
            System.out.println("Contact does not exist");
            System.out.println();
        }
    }

    public void editContact(Scanner scanner) {
        System.out.println("Please enter id of contact you want to edit:");
        Contact contact = contactDao.findContact(scanner.nextInt());
        if (contact != null) {
            System.out.println("You are now editing:");
            System.out.println(contact);

            System.out.println("Please enter name:");
            String name = scanner.next();
            contact.setName(name);

            System.out.println("Please enter surname:");
            String surname = scanner.next();
            contact.setSurName(surname);

            System.out.println("Please enter phone number:");
            String phoneNumber = scanner.next().replaceAll("[^0-9+]", "");
            contact.setPhoneNumber(phoneNumber);

            contactDao.editContact(contact);
            System.out.println("Thank you. Contact saved.");
            System.out.println();
        } else {
            System.out.println("Contact does not exist");
            System.out.println();
        }
    }
}


