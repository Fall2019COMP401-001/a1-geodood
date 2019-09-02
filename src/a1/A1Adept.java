package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int itemCount = scan.nextInt();
		
		String[] itemName = new String[itemCount];
		double[] price = new double[itemCount];
		
		for (int i = 0; i < itemCount; i++) {
			itemName[i] = scan.next();
			price[i] = scan.nextDouble();
		}
		
		// A1Novice
		
		int customerCount = scan.nextInt();
		
		String[] firstName = new String[customerCount];
		String[] lastName = new String[customerCount];
		int[] numberOfItems = new int[customerCount];
		double[] totalCost = new double[customerCount];
		
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
						totalCost[i] += quantity * price[k];
						continue;
					}
				}	
			}
		} 
		
		scan.close();
		
		String biggest = findBiggest(customerCount, firstName, lastName, totalCost);
		String smallest = findSmallest(customerCount, firstName, lastName, totalCost);
		String average = findAverage(customerCount, totalCost);
		
		System.out.println("Biggest: " +  biggest);
		System.out.println("Smallest: " + smallest);
		System.out.println("Average: " + average);
	}
		
	static String findBiggest(int num, String[] first, String[] last, double[] amount) {
		double base = amount[0];
		String big = first[0] + " " + last [0] + " (" + String.format("%.2f", amount[0]) +")";
		for (int i = 1; i < num; i++ ) {
			if (amount[i] > base ) {
				big = first [i] + "  " + last [i] + "  (" + String.format("%.2f", amount[i]) +")";
				base = amount[i];
			}
		}
		return big;
	}
	
	static String findSmallest(int num, String[] first, String[] last, double[] amount) {
		double base = amount[0];
		String small = first[0] + " " + last [0] + " (" + String.format("%.2f", amount[0]) +")";
		for (int i = 1; i < num; i++ ) {
			if (amount[i] < base ) {
				small = first [i] + "  " + last [i] + " (" + String.format("%.2f", amount [i]) +")";
				base = amount[i];
			}
		}
		return small;
	}
	
	static String findAverage (int num, double[] amount) {
		double average = 0;
		for (int i =0; i < amount.length; i++) {
			average += amount[i];
		}
		average = average / num ;
		return String.format("%.2f", average);
	}
}
