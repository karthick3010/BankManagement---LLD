package Services;

public class DisplayAcc {
   public static void display(){

    for (int i = 0; i < Services.customers.size(); i++) {
        System.out.println(Services.customers.get(i));
       }
    }
}
