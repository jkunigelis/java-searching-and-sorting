import java.util.ArrayList;
import java.util.List;
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
		
		String algorithm = in.nextLine();
		
		switch (algorithm) {
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
		
		String data = in.nextLine();
		
		switch (data) {
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
		
		String stored = in.nextLine();
		
		switch (stored) {
		case "array":
			break;
		case "list":
			break;
		case "quit":
			break;
		}
		
		System.out.println("Enter data separated by commas.");
		System.out.println();
		System.out.println("Example:\n "
				+ "'1,2,3,4,5' or type 'quit' to quit.");
		
		String input = in.nextLine();
		int count = 1;
		for (int i = 0; i < input.length(); i++) {
			if (input.substring(i).equals(",")) {
				count++;
			}
		}
		//try {
			if (stored.equals("array")) {
				if (data.equals("integers")) {
					int[] stuff = new int[count];
					int j = 0;
					for (int i = 0; j < input.length() - 1; i++) {
						stuff[i] = Integer.parseInt(input.substring(j, (j + 1)));
						j+=2;
					}
					switch (algorithm) {
					case "bubble":
						System.out.println(bubbleSort(stuff));
						break;
					case "selection":
						System.out.println(selectionSort(stuff));
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
				}
				else {
					String[] stuff = new String[count];
					int j = 0;
					for (int i = 0; j < input.length() - 1; i++) {
						stuff[i] = input.substring(j, (j + 1));
						j+=2;
					}
					switch (algorithm) {
					case "bubble":
						System.out.println(bubbleSort(stuff));
						break;
					case "selection":
						System.out.println(selectionSort(stuff));
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
				}
			}
			else if (stored.equals("list")) {
				if (data.equals("integers")) {
					ArrayList<Integer> stuff = new ArrayList<Integer>();
					int j = 0;
					for (int i = 0; j < input.length() - 1; i++) {
						stuff.add(Integer.parseInt(input.substring(j, (j + 1))));
						j+=2;
					}
					switch (algorithm) {
					case "bubble":
						System.out.println(bubbleSort(stuff));
						break;
					case "selection":
						System.out.println(selectionSort(stuff));
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
				}
				else {
					ArrayList<String> stuff = new ArrayList<String>();
					int j = 0;
					for (int i = 0; j < input.length() - 1; i++) {
						stuff.add(input.substring(j, (j + 1)));
						j+=2;
					}
					switch (algorithm) {
					case "bubble":
						System.out.println(bubbleSort(stuff));
						break;
					case "selection":
						System.out.println(selectionSort(stuff));
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
				}
			}
		//}
		/*catch (Exception e) {
			System.err.println();
		} */
		
		
		in.close();
	}
	public static int[] bubbleSort (int[] bubble) {
		int n = bubble.length;
		for (int i = 0; i < n-1; i++) {
		for (int j = 0; j < n-i-1; j++) {
			if (bubble[j] > bubble[j+1]) 
                	{	 
                    		int temp = bubble[j]; 
                    		bubble[j] = bubble[j+1]; 
                    		bubble[j+1] = temp; 
                		} 
			}
		}
		return bubble;
	}
	public static ArrayList<Integer> bubbleSort (ArrayList<Integer> bubble) {
		int n = bubble.size();
		for (int i = 0; i < n-1; i++) {
		for (int j = 0; j < n-i-1; j++) {
			if (bubble.get(j) > bubble.get(j + 1)) 
                	{	 
                    		int temp = bubble.get(j); 
                    		bubble.set(j, bubble.get(j+1)); 
                    		bubble.set(j+1, temp); 
                		} 
			}
		}
		return bubble;
	}
	public static List<String> bubbleSort (List<String> bubble) {
		int n = bubble.size();
		for (int i = 0; i < n-1; i++) {
		for (int j = 0; j < n-i-1; j++) {
			if (Integer.parseInt(bubble.get(j)) > Integer.parseInt(bubble.get(j + 1))) 
                	{	 
                    		int temp = Integer.parseInt(bubble.get(j)); 
                    		bubble.set(j, bubble.get(j+1)); 
                    		bubble.set(j+1, String.valueOf(temp)); 
                		} 
			}
		}
		return bubble;
	}
	public static String[] bubbleSort (String[] strlist) {
		int n = strlist.length;
		for (int i = 0; i < n-1; i++) {
		for (int j = 0; j < n-i-1; j++) {
			if (Integer.parseInt(strlist[j]) > Integer.parseInt(strlist[j+1])) 
                	{	 
                    		int temp = Integer.parseInt(strlist[j]); 
                    		strlist[j] = strlist[j+1]; 
                    		strlist[j+1] = String.valueOf(temp); 
                		} 
			}
		}
		return strlist;
	}
	public static int[] selectionSort (int[] intselect) {
		int n = intselect.length; 
		for (int i = 0; i < n-1; i++) 
		{ 
		    int min_idx = i; 
		    for (int j = i+1; j < n; j++) {
		    	if (intselect[j] < intselect[min_idx]) {
				min_idx = j; 
			}
		    }
		int temp = intselect[min_idx]; 
	    	intselect[min_idx] = intselect[i]; 
	    	intselect[i] = temp; 
		} 
		return intselect;
	}
	public static ArrayList<Integer> selectionSort (ArrayList<Integer> intselect) {
		int n = intselect.size(); 
		for (int i = 0; i < n-1; i++) 
		{ 
		    int min_idx = i; 
		    for (int j = i+1; j < n; j++) {
		    	if (intselect.get(j) < intselect.get(min_idx)) {
				min_idx = j; 
			}
		    }
		int temp = intselect.get(min_idx); 
	    	intselect.set(min_idx, intselect.get(i)); 
	    	intselect.set(i, temp); 
		} 
		return intselect;
	}
	public static List<String> selectionSort (List<String> intselect) {
		int n = intselect.size(); 
		for (int i = 0; i < n-1; i++) 
		{ 
		    int min_idx = i; 
		    for (int j = i+1; j < n; j++) {
		    	if (Integer.parseInt(intselect.get(j)) < Integer.parseInt(intselect.get(min_idx))) {
				min_idx = j; 
			}
		    }
		int temp = Integer.parseInt(intselect.get(min_idx)); 
	    	intselect.set(min_idx, intselect.get(i)); 
	    	intselect.set(i, String.valueOf(temp)); 
		} 
		return intselect;
	}
	public static String[] selectionSort (String[] stringSelect) {
		int n = stringSelect.length; 
		for (int i = 0; i < n-1; i++) 
		{ 
		    int min_idx = i; 
		    for (int j = i+1; j < n; j++) {
		    	if (Integer.parseInt(stringSelect[j]) < Integer.parseInt(stringSelect[min_idx])) {
				min_idx = j; 
			}
		    }
		int temp = Integer.parseInt(stringSelect[min_idx]); 
			stringSelect[min_idx] = stringSelect[i]; 
			stringSelect[i] = String.valueOf(temp); 
		} 
		return stringSelect;
	}
}
