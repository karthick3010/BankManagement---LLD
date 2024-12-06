import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        LoadEx.loadExistingCustomer();


        while(true){
            System.out.println("Enter 1 to add new Customer\nEnter 2 to display the acc.\nEnter 3 to remove the acc.");
            int in = input.nextInt();

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
}
