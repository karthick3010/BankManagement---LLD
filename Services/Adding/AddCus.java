
package Services.Adding;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Services.Customer;
import Services.Services;




public class AddCus {
    public static void addCustomer(){
        Scanner input = Services.input;

        System.out.print("Enter Customers Name: ");
        String name = input.next();
        System.out.print("\nset password for your Account: ");
        String password = input.next();


       while(!checkPassWord(password)){
        System.out.println("The password is not valid.Enter another Password");
        password = input.next();
       }



        System.out.print("\nReEnter the password: ");
        String rePassword = input.next();

        while(!password.equals(rePassword)){
            
            System.out.println("the password you reEnter was incorrect press 1 to reEnter passWord and 2 to exit the process");
            int in = input.nextInt();
            if(in ==1){
                System.out.println("ReEnter the password correctly: ");
                rePassword = input.next();

            }else{
                return;

            }

        }

        Customer obj =null;
       
        // rePassword = encyrpt(rePassword);
    
        
        if(Services.customers.size() > 0){
             obj = new Customer(name,
             1 +Services.customers.get(Services.customers.size()-1).getCustomerId()  ,
             1 + Services.customers.get(Services.customers.size()-1).getAccNo() ,
            1000,
            rePassword);
        }else{
            obj = new Customer(name, 
            1, 
            1000,
             1000, rePassword);
        }

        Services.customers.add(obj);
      

        writeFile(obj);


        

    }

    public static boolean checkPassWord(String a){

        for(char ch: a.toCharArray()){
            if(ch > 'a' && ch < 'Z'){
                return false;
            }
        }

        return true;
    }


    public static String encyrpt(String s){

        String a ="";

        for(char ch : s.toCharArray()){
           
            if(ch == 'z'){
                a+= 'a';
            }else if(ch == 'Z'){
                a+='Z';
            }else{
                a += (char) (ch + 1 ) ;
            }
        }

        return a;
    }



    public static void writeFile(Customer obj) {
           File file = new File("../../DB/customer_db.txt");

        try (FileWriter fileWriter = new FileWriter(file,true);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {

            
         writer.write(obj.getCustomerId() +" " +
          obj.getAccNo()+" "+obj.getName()+" "+
          obj.getBalance() + " "
         +obj.getPassword());

        writer.newLine();
      

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
