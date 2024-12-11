package Services;
import java.io.*;
import java.util.*;

import Services.Adding.AddAdmin;
import Services.Adding.AddCus;
import Services.Login.AdminLogin;
import Services.Removing.RemoveCus;



public class Services {
    
    public static Scanner input = new Scanner(System.in);


    public static List<Customer> customers = new ArrayList<>();
    public static List<Admin> admins = new ArrayList<>();

    public static void userLogin(){
        while(true){

            System.out.println("Enter 1 to add new Customer\nEnter 2 to display the acc.\nEnter 3 to remove the acc.");
            int in = Services.input.nextInt();

            switch (in) {
                case 1:
                Services.addAcc();
                    
                break;
                case 2:
                Services.displayAccount();
                    
                break;
                case 3:
                Services.removeAccount();
                    
                break;
            
            
            }

        }
    }

    public static void adminLogin(){
        System.out.println("Enter the Admin Id");
        int id = input.nextInt();
        System.out.println("Enter the admin's name ");
        String name = input.next();
        System.out.println("Enter the password");
        String password = input.next();

        AdminLogin.adminLogin(id , name , password);

    }

    public static void addAdmin(){
        
        
        System.out.println("Enter the admin's name ");
        String name = input.next();
        System.out.println("Enter the password");
        String password = input.next();
        AddAdmin.addAdmin(Services.admins.get(Services.admins.size() - 1).getId() + 1 , name , password);

        
    }

    public static void removeAdmin(){
        
    }

    public static void addAcc(){
        AddCus.addCustomer();
    }
    public static void displayAccount(){
        DisplayAcc.display();
    }
    public static void removeAccount() {
        System.out.println("Enter the AccountNumber to delete");
        int in = input.nextInt();
        RemoveCus.remove(in);
    }

    
}
