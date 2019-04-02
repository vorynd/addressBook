package service;

import java.util.Scanner;

public class CommandLineService {
    private static final Scanner scanner = new Scanner(System.in);
    ContactService service = new ContactService();


    public void showMenu() {
        System.out.println("1.Add contact.");
        System.out.println("2.Update contact.");
        System.out.println("3.Delete contact.");
        System.out.println("4.Show all contacts.");
        System.out.println("0.Exit.");

    }

    public void run() {
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
                    System.out.println("Thank you for using our app.");
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
