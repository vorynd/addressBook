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

    public void showAllContacts() {
        contactDao.showAllContacts();
    }

    public void deleteContact(Scanner scanner) {
        System.out.println("Please enter id of contact you want to delete:");
        int temp = scanner.nextInt();
        if (contactDao.findContactById(temp) != null) {
            System.out.println("Are you sure you want to delete this contact (y/n)?");
            System.out.println(contactDao.findContactById(temp));
            if (scanner.next().equals("y")) {
                contactDao.deleteContact(contactDao.findContactById(temp));
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
        Contact contact = contactDao.findContactById(scanner.nextInt());
        if (contact != null) {
            System.out.println("You are now editing:");
            System.out.println(contact);
            System.out.println();
            System.out.println("Please chose, what field you want to edit:");
            System.out.println("1.Name.");
            System.out.println("2.Surname.");
            System.out.println("3.Phone number.");
            int numberOfMenu = scanner.nextInt();
            switch (numberOfMenu) {
                case 1: {
                    System.out.println("Please enter name:");
                    String name = scanner.next();
                    contact.setName(name);
                    break;
                }
                case 2: {
                    System.out.println("Please enter surname:");
                    String surname = scanner.next();
                    contact.setSurName(surname);
                    break;
                }
                case 3: {
                    System.out.println("Please enter phone number:");
                    String phoneNumber = scanner.next().replaceAll("[^0-9+]", "");
                    contact.setPhoneNumber(phoneNumber);
                    break;
                }
                default: {
                    System.out.println("Sorry, wrong input.");
                }
                contactDao.editContact(contact);
                System.out.println("Thank you. Contact saved.");
                System.out.println();
            }
        } else {
            System.out.println("Contact does not exist");
            System.out.println();
        }
    }

    public void findByName(Scanner scanner) {
        System.out.println("Please enter the name of contact you want to find:");
        contactDao.findContactByName(scanner.next());
    }

}


