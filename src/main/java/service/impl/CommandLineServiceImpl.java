package service.impl;

import dao.impl.ContactDaoImpl;
import service.CommandLineService;

import java.util.Scanner;

public class CommandLineServiceImpl implements CommandLineService {

    private static final Scanner scanner = new Scanner(System.in);

    private static final ContactServiceImpl service = new ContactServiceImpl(new ContactDaoImpl());

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

                    break;
                }
                case 3: {

                    break;
                }
                case 4: {

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
