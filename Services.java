import java.io.*;
import java.util.*;
public class Services {

    public static List<Customer> customers = new ArrayList<>();
    public static void addAcc(){
        AddCus.addCustomer();
    }
    public static void displayAccount(){
        DisplayAcc.display();
    }
    public static void removeAccount() {
        System.out.println("Enter the AccountNumber to delete");
        int in = Main.input.nextInt();
        RemoveCus.remove(in);
    }
    
}
