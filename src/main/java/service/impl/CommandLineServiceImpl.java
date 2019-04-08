package service.impl;

import dao.impl.ContactDaoImpl;
import service.CommandLineService;

import java.util.Scanner;

public class CommandLineServiceImpl implements CommandLineService {

    private static final Scanner scanner = new Scanner(System.in);

    private static final ContactServiceImpl service = new ContactServiceImpl(new ContactDaoImpl());

    public static void start() {
        CommandLineService.run(scanner, service);
    }


}
