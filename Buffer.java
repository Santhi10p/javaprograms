package day9;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Buffer {
    public static void main(String[] args) {
        try {
            // Create BufferedReader wrapped around InputStreamReader
            // br = new BufferedReader(new InputStreamReader(System.in));
        	InputStreamReader in=new InputStreamReader((System.in));
        	BufferedReader br=new BufferedReader(in);
            // Prompt user for input
            System.out.print("Enter your name: ");
            String name = br.readLine();  // Reads an entire line

            // Display the input
            System.out.println("Hello, " + name);

            // Close BufferedReader
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
