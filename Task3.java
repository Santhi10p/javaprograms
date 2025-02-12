package day9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
	public static void main(String[] args) throws IOException {
		int age;
		String name;
		// 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ener name");
		name = br.readLine();
		System.out.println("Enter age");
		age = Integer.parseInt(br.readLine());
		System.out.println("Name= "+ name);
		System.out.println("Age= " + age);
	}

}

