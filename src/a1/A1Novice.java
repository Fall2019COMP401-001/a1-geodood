package a1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class A1Novice {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int total = scan.nextInt();
		
		String[] firstName = new String[total];
		String[] lastName = new String[total];
		int[] numberOfItems = new int[total];
		double[] totalCost = new double[total];
		
		for (int i = 0; i < total; i++) {
			firstName[i] = scan.next(); 
			lastName[i] = scan.next();
			int n = scan.nextInt();
			numberOfItems[i] = n;
			
			totalCost[i] = 0;
			int j = 0;
			while (j < n) {
				int quantity = scan.nextInt();
				String itemName = scan.next();
				double price = scan.nextDouble();
				double subtotal = quantity * price;
				totalCost[i] += subtotal;		
				j++;
			}
		} 
		
		scan.close();
		
		for (int i = 0; i < total; i++) {
			System.out.println(firstName[i].charAt(0) + ". "+ lastName[i] + ": " + String.format("%.2f", totalCost[i]));
		}
	}
	
}
