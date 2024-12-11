package Services.Adding;

import java.io.*;

import Services.Admin;
import Services.Services;

public class AddAdmin {
    
    public static void addAdmin(int id , String name , String password){

        try(FileWriter fileWriter = new FileWriter(new File("../../DB/admin_db.txt ") , true); 
        BufferedWriter writer = new BufferedWriter(fileWriter );
        ){
            Services.admins.add(new Admin(name, id, password));

            String a = id + " "+name+" "+ password;
            writer.append(a);
            writer.newLine();
            System.out.println("----------->Added new Admin");

        }catch(Exception e){
         System.out.println("--------->Failed to add the admin");
        }
    }
}
