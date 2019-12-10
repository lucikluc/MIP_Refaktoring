import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nWelcome in Tulko! Before making any decision, please enter your age:\t");
		while (scanner.hasNextInt()==false) {
		      System.out.println("Input is not a number. Please, try again :\t");
		      scanner.nextLine();
		    }
		    int birth = scanner.nextInt();
		  
			if(birth>=18) {  
				scanner.nextLine();
				System.out.println("Do you want to adopt an animal,donate Tulko some money or leave? :\t");

			}
			else {
				scanner.nextLine();
				System.out.println("Sorry, but you can not adopt an animal if you are not an adult. \nBut you can helps us!Do you want to walk some of our dogs? :\t");
				
			}	

}
}
