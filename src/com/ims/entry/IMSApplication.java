package com.ims.entry;

import java.util.Scanner;

import com.ims.actor.*;
import com.ims.data.SystemUserHolder;
import com.ims.entity.Notification;
import com.ims.entity.Order;
import com.ims.service.EmailNotificationService;

class IMSApplication {

    private static SystemUser admin;
    private static SystemUser supplier;
    private static SystemUser inventoryManager;
    private static Scanner scanner;
    static {
        Address adminAddress = new Address("1303", "Laurence Street", "Delhi", 110007);
        admin = new Admin("Admin", adminAddress);
        SystemUserHolder.save(admin);

        Address supplierAddress = new Address("1304", "Laurence Street", "Delhi", 110007);
        supplier = new Supplier("Supplier", supplierAddress);
        SystemUserHolder.save(supplier);

        Address imAddress = new Address("1305", "Laurence Street", "Delhi", 110007);
        inventoryManager = new InventoryManager("Inventory Manager", imAddress);
        SystemUserHolder.save(inventoryManager);
        ((InventoryManager) inventoryManager).setNotificationService(new EmailNotificationService());

        scanner = new Scanner(System.in);
    }


    public static void main(String[] args) {
        showLoginOption();
    }
    private static void showLoginOption() {
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
                showLoginOption();
                break;
            case 5:
                Notification[] notifications = user.getNotifications();
                System.out.println("Notifications :");
                for(int i=0; i<notifications.length;i++) {
                    Notification n = notifications[i];
                    if(n!=null) {
                        System.out.println("From: "+ n.getFromUserId() + " to: "+n.getToUserId()+" message: "+n.getMessage());
                    } else
                        break;
                }
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