package Services.Login;
import Services.*;
import Services.Adding.AddAdmin;

import java.io.*;
import java.util.*;

public class AdminLogin {



    public static void adminLogin(int id, String name , String passWord){


        // File file = new File("DB//admin_db.txt" );
        File file = new File("DB/admin_db.txt" );



       if(!file.exists()){
        try{
            file.createNewFile();
        }catch(Exception e){
          
            System.out.println(e);
        }
       }

      
    //    the below code will load all the data in the file 

       try(FileReader fileReader = new FileReader(file);
          BufferedReader bufferedReader = new BufferedReader(fileReader); ){

        String line = bufferedReader.readLine();

        while(line != null){

            // /the below code is for checking is there any empty line
            if(line.trim().isEmpty()){
                line = bufferedReader.readLine();
                continue;
            }

          String[] arr = line.split(" ");

            
          Services.admins.add(new Admin( arr[1] ,Integer.parseInt(arr[0]),arr[2] ) );
          line = bufferedReader.readLine();


        }

       }catch(Exception e){

        System.out.println(e);

       }

       boolean isAdmin = false;

       for (int i = 0; i < Services.admins.size(); i++) {
           
            if(Services.admins.get(i).getId() == id &&
             Services.admins.get(i).getName().equals(name)  &&
             Services.admins.get(i).getPassWord().equals(passWord)
             )

            {
                isAdmin = true;
            }
       }

       if(!isAdmin){
        System.out.println("Wrong Admin details");
        return;
       }


       System.out.println("---------------->Admin Login Succesfully<----------------------");

       while(true){

        System.out.println("Enter 1 to add new Customer\nEnter 2 to display the accounts .\nEnter 3 to remove the acc." + 
        "Enter 4 to add new Admin\n Enter 5 to display the remove.\n Enter 6 to remove the exit");
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
            case 4:
            Services.addAdmin(); 
            break;
            case 5:
            // Services.removeAdmin();   
            break;
            case 6 :
            return;
        
        
        }
      

        }

    







    }


    // public static void main(String[] args) {
    //     AdminLogin.adminLogin();
    // }









}
