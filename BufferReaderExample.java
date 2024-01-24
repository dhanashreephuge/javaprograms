package inputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read input from the user
        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());
            
            System.out.print("Enter your marks: ");
            Double marks = Double.parseDouble(reader.readLine());

            // Display the input
            System.out.println("Hello, " + name + "! I am " + age + " years old. I have"+ marks +"% of marks." );
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
