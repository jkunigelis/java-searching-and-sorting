import java.util.Scanner;

public class SearchAndSort {
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		System.out.println("What algorithm would you like to execute?");
		System.out.println();
		System.out.println("Please enter one of the following:\n "
				+ "'bubble' 'selection' 'insertion' 'merge'\n "
				+ "'linear' 'binary' or 'quit' to quit.");
		Scanner in = new Scanner(System.in);
		
		
		
		String choice1 = in.nextLine();
		
		switch (choice1) {
		case "bubble":
			break;
		case "selection":
			break;
		case "insertion":
			break;
		case "merge":
			break;
		case "linear":
			break;
		case "binary":
			break;
		case "quit":
			break;
		}
		
		System.out.println("What type of data?");
		System.out.println();
		System.out.println("Please enter one of the following:\n "
				+ "'integers' 'strings' or 'quit' to quit.");
		
		String choice2 = in.nextLine();
		
		switch (choice2) {
		case "integers":
			break;
		case "strings":
			break;
		case "quit":
			break;
		}
		
		System.out.println("How is it stored?");
		System.out.println();
		System.out.println("Please enter one of the following:\n "
				+ "'array' 'list' or 'quit' to quit.");
		
		String choice3 = in.nextLine();
		
		switch (choice3) {
		case "array":
			break;
		case "list":
			break;
		case "quit":
			break;
		}
		
		System.out.println("What type of data?");
		System.out.println();
		System.out.println("Please enter one of the following:\n "
				+ "'integers' 'strings' or 'quit' to quit.");
		
		String choice4 = in.nextLine();
		
		switch (choice4) {
		case "integers":
			break;
		case "strings":
			break;
		case "quit":
			break;
		}
		
		System.out.println("Enter data separated by commas.");
		System.out.println();
		System.out.println("Example:\n "
				+ "'1,2,3,4,5' or type 'quit' to quit.");
		
		in.close();
	}
}