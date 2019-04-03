package service;

import dao.ContactDao;

import java.util.Scanner;

public class CommandLineService {

    private static final Scanner scanner = new Scanner(System.in);

    private static final ContactService service = new ContactService(new ContactDao());

    public static void showMenu() {
        System.out.println("1.Add contact.");
        System.out.println("2.Update contact.");
        System.out.println("3.Delete contact.");
        System.out.println("4.Show all contacts.");
        System.out.println("0.Exit.");

    }

    public static void run() {
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
                    service.delete(scanner);
                    break;
                }
                case 4: {
                    service.showAll();
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
