package task1_project;
import java.util.Scanner;
public class helloWorld {
    
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer:");
		int number = input.nextInt();
		System.out.println("You entered " + number);
		
		input.close();
	}
}
