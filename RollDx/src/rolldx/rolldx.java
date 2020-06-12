package rolldx;

import java.util.Scanner;

public class rolldx {

	public static void main(String[] args) {
		
		System.out.println("Why hasn't anyone thought of this before?");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("How many dice do you want to roll?");
			int x = input.nextInt();
			System.out.println("How many sides does each die have?");
			int y = input.nextInt();
			System.out.println("Wunderbar! Rolling di(c)e:");
			
			for (int z = 0; z < x; z++) {
				
				int rand = (int) (Math.random() * y) + 1;
				System.out.println("Die " + (z + 1) + ": " + rand);
				
			}	
			
		}
		
	}

}
