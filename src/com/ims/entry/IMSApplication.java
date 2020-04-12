package com.ims.entry;

import java.util.Scanner;

import com.ims.actor.*;
import com.ims.data.SystemUserHolder;
import com.ims.entity.Order;

class IMSApplication {

    public static void main(String[] args) {

        Address adminAddress = new Address("1303", "Laurence Street", "Delhi", 110007);
        SystemUser admin = new Admin("Admin", adminAddress);
        SystemUserHolder.save(admin);

        Address supplierAddress = new Address("1304", "Laurence Street", "Delhi", 110007);
        SystemUser supplier = new Supplier("Supplier", supplierAddress);
        SystemUserHolder.save(supplier);

        Address imAddress = new Address("1305", "Laurence Street", "Delhi", 110007);
        SystemUser inventoryManager = new InventoryManager("Inventory Manager", imAddress);

        System.out.println("Welcome to Inventory Management System!");
        System.out.println("Please Press ");
        System.out.println("1 for Admin");
        System.out.println("2 for Supplier");
        System.out.println("3 for Inventory Manager");
        java.util.Scanner scanner = new Scanner(System.in);

        int userSelection = checkUserSelection(scanner);
        SystemUser user = null;
        String role = "";
        switch (userSelection) {
            case 1:
                user = admin;
                role = "admin";
                break;
            case 2:
                user = supplier;
                role = "Supplier";
                break;
            case 3:
                user = inventoryManager;
                role = "InventoryManager";
                break;
            default:
        }
        showLoginScreen(user,scanner);
        while(true) {
            showProfileDashboard(user,role,scanner);
        }
    }

    private static void showProfileDashboard(SystemUser user, String role, Scanner scanner) {
        user.checkProfileDashboard();
        int userProfileDashboardSelection = scanner.nextInt();
        switch (userProfileDashboardSelection) {
            case 4:
                user.logout();
                System.exit(1);
                break;
            case 6:
                if (!role.equalsIgnoreCase("InventoryManager")) {
                    System.out.println("Invalid input for " + role);
                    System.exit(1);
                }
                System.out.println("ProductId:");
                Integer prodId = scanner.nextInt();
                System.out.println("Quantity:");
                Integer quantity = scanner.nextInt();
                System.out.println("OverallPrice:" + 100 * quantity);
                System.out.println("Supplier id:");
                Integer supplierId = scanner.nextInt();
                Order order = ((InventoryManager) user).placeOrder(prodId, quantity, (Supplier) SystemUserHolder.fetchById(supplierId));
                System.out.println("Order created with id:" + order.getId() + " and status:" + order.getStatus());
                break;
        }
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