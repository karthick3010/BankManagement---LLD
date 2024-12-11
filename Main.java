import java.security.Provider.Service;
import java.util.Scanner;
import Services.*;

public class Main {


    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Enter 1 for Admin Login\nEnter 2 to Customer Login.\nEnter 3  Exit.");
            int in = input.nextInt();

            switch (in) {
                case 1: 
                
                Services.adminLogin();
                    
                 break;
                case 2:{
    
                }
           
                  break;
              
                case 3:
                  return;
            
            
            }

        }
    }
}
