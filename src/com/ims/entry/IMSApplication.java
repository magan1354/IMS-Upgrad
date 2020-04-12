package com.ims.entry;

import java.util.Scanner;

import com.ims.actor.*;

class IMSApplication {

    public static void main(String[] args) {

        System.out.println("Welcome to Inventory Management System!");
        System.out.println("Please Press ");
        System.out.println("1 for Admin");
        System.out.println("2 for Supplier");
        System.out.println("3 for Inventory Manager");
        java.util.Scanner scanner = new Scanner(System.in);

        int userSelection = checkUserSelection(scanner);
        SystemUser user = null;
        switch (userSelection) {
            case 1:
                Address adminAddress = new Address("1303", "Laurence Street", "Delhi", 110007);
                user = new Admin("Admin", adminAddress);
                break;
            case 2:
                Address supplierAddress = new Address("1304", "Laurence Street", "Delhi", 110007);
                user = new Supplier("Supplier", supplierAddress);
                break;
            case 3:
                Address imAddress = new Address("1305", "Laurence Street", "Delhi", 110007);
                user = new InventoryManager("Inventory Manager", imAddress);
                break;
            default:
        }
        showLoginScreen(user,scanner);
    }

    private static void showLoginScreen(SystemUser user,Scanner scanner) {
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.println("UserName: ");
            String userName = scanner.next();
            System.out.println("Password: ");
            String password = scanner.next();
            loggedIn = user.login(userName, password);
            if (loggedIn == false) {
                System.out.println("Invalid Username/password, please try again");
            }
        }
        System.out.println(user.getName()+" logged in successfully");
    }

    private static int checkUserSelection(Scanner scanner) {
        // 1 = Admin, 2=Supplier, 3= Inventory Manager
        int systemUserType = scanner.nextInt();
        while (systemUserType < 1 || systemUserType > 3) {
            System.out.println("You pressed an incorrect Key, please try again !");
            systemUserType = scanner.nextInt();
        }
        return systemUserType;
    }
}