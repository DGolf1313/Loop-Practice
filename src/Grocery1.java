import java.util.Scanner;

public class Grocery1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name");
		String name = sc.nextLine();
		
		System.out.println("Welcome " + name);
		
		int selection = 0;
		double total = 0;
			
		while (selection != 4) {
		
			System.out.println("Select your groceries: ");
			System.out.println("1) Add Candybar to cart: 1.99");
			System.out.println("2) Add Milk to cart: 4.59");
			System.out.println("3) Add Laundry soap to cart: 17.79");
			System.out.println("4) Ready to Checkout");
			
			selection = sc.nextInt();
			
			
			
			switch (selection) {
				case 1:
					total += 1.99;
					break;
				case 2:
					total += 4.59;
					break;
				case 3:
					total += 17.79;
					break;
				case 4:
					break;
				default: 
					System.out.println("Please pick a valid option");
			
			}
		System.out.println("Your current total is: " + total);
		}
	}
	
	
}


