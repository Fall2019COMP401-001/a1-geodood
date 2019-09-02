package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
int itemCount = scan.nextInt();
		
		String[] itemName = new String[itemCount];
		double[] price = new double[itemCount];
		int[] numberOfEachItem = new int[itemCount];
		int[] numberOfBuyers = new int[itemCount];

		
		for (int i = 0; i < itemCount; i++) {
			itemName[i] = scan.next();
			price[i] = scan.nextDouble();
		}
		
		// A1Adept
		
		int customerCount = scan.nextInt();
		
		String[] firstName = new String[customerCount];
		String[] lastName = new String[customerCount];
		int[] numberOfItems = new int[customerCount];
		
		for (int i = 0; i < customerCount; i++) {
			firstName[i] = scan.next(); 
			lastName[i] = scan.next();
			int n = scan.nextInt();
			numberOfItems[i] = n;
			
			for (int j = 0; j < n; j++) {
				int quantity = scan.nextInt();
				String itemBought = scan.next();
				
				for (int k = 0; k < itemCount; k++) {
					if (itemBought.equals(itemName[k])) {
						numberOfEachItem[k] += quantity;
						numberOfBuyers[k] ++;
					}
				}
			}
		} 
		
		scan.close();
		
		for (int i = 0; i < itemCount; i++) {
			if (numberOfEachItem[i] == 0 ) {
				System.out.println("No customers bought " + itemName[i]);
			} else {
				System.out.println(numberOfBuyers[i] + " customers bought " + numberOfEachItem[i] + " " + itemName[i]);
			}
		}
	}
}
