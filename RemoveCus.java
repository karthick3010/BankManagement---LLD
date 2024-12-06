import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RemoveCus {
    public static void remove(int id) {
        File file = new File("bank_db.txt");
        ArrayList<String> lines = new ArrayList<>();

        // Step 1: Read all lines from the file, excluding the one with the given ID
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                // If the line doesn't start with the given ID, add it to the list
                if (!currentLine.startsWith(String.valueOf(id))) {
                    lines.add(currentLine);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Step 2: Overwrite the file with the remaining lines
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
            // Debugging: Check if lines are collected
            System.out.println("Lines to be written back to the file:");
            for (String line : lines) {
                System.out.println(line); // Output to console for debugging
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 3: Remove the customer from Services.customers (iterate backwards to avoid skipping)
        for (int i = Services.customers.size() - 1; i >= 0; i--) {
            if (Services.customers.get(i).getCustomerId() == id) {
                Services.customers.remove(i);
                break; 
            }
        }

        // Debugging: Ensure that the file is written
        System.out.println("File successfully updated.");
    }
}
