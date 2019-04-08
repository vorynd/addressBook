package service;

import java.util.Scanner;

public interface CommandLineService {

    /**
     * shows main menu
     */
    static void showMenu() {
        System.out.println("1.Add contact.");
        System.out.println("2.Update contact.");
        System.out.println("3.Delete contact.");
        System.out.println("4.Show all contacts.");
        System.out.println("5.Find contact.");
        System.out.println("0.Exit.");


    }


    /**
     * application starts work, shows menu
     * @param scanner expected input of menu items numbers
     * @param service instance of ContactService
     */
    static void run(Scanner scanner, ContactService service) {
        boolean exit = false;
        do {
            System.out.println("Please chose menu item.");
            showMenu();
            int numberOfMenu = scanner.nextInt();
            switch (numberOfMenu) {
                case 1: {
                    service.addContact(scanner);
                    break;
                }
                case 2: {
                    service.editContact(scanner);
                    break;
                }
                case 3: {
                    service.deleteContact(scanner);
                    break;
                }
                case 4: {
                    service.showAllContacts();
                    break;
                }
                case 5: {
                    service.findByName(scanner);
                    break;
                }
                case 0: {
                    System.out.println("Thank you for using our app!");
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("Sorry, wrong input.");
                }
            }
        } while (!exit);

    }
}


