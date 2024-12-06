import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;


public class LoadEx {

    public static void loadExistingCustomer() {
 
        try{
            
            FileReader fileReader = new FileReader(new File("bank_db.txt"));
            BufferedReader reader = new BufferedReader(fileReader);
            String input = reader.readLine();

            while(input != null ){
               
                if (input.trim().isEmpty()) {
                    input = reader.readLine();
                    continue; 
                }
               
                List<String> list = Arrays.asList(input.split(" "));
              
                Services.customers.add( new Customer(list.get(2),
                Integer.parseInt(list.get(0)), 
                Integer.parseInt(list.get(1)), 
                Integer.parseInt(list.get(3)),
                 list.get(4)));

                 
            input = reader.readLine();
            };
            
            reader.close();
            fileReader.close();


        }catch(Exception e){
            System.out.println(e);
        }finally{
            
        }
    }
}
