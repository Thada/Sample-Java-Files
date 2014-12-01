//Thomas Hada
//107758936, L02, HW 2
import java.util.*;

public class RollEE {

	public static void main(String [] args)
	{
		//This is the welcome message.
		System.out.println("*** Welcome to the RollEE program. ***");
		
		//This will describe the rules of the game.
		System.out.println("A play costs 1 dollar. If you roll equal numbers, you win 3 dollars.");
		System.out.println("If you roll even, you win 50 cents. If you roll odd, you do not win anything.");
		System.out.println("Do you want to play? Type (Y/N): ");
		
		//This will store the input from the user.
		Scanner A = new Scanner(System.in);
		String answer = A.nextLine();
		
		//This will store the total winnings.
		double total = 0.00;
		int i = 0;
		
		//This will loop the program until it is prompted to end.

		while(answer.toUpperCase().equals("Y"))
		{
		System.out.println("A bet of $1 has been placed.");
		total = total - 1.00;
		
		//This will generate and store random integers for each die.
		int randomNumber1 = (int)(Math.random( ) * 6);
		int randomNumber2 = (int)(Math.random( ) * 6);
		
		System.out.print("You have rolled a "+randomNumber1+", "+randomNumber2);
		
		//This calculates the winnings per round and displays them.
		if(randomNumber1 == randomNumber2)
			{
				System.out.println(". For this round you win $3.00.");
				total = total + 3.00;
			}
			else if((randomNumber1+randomNumber2)%2==0)
			{
				System.out.println(". For this round you win $0.50.");
				total = total + 0.50;
			}
			else
			{
			System.out.println(". For this round you win $0.00.");
			}
		System.out.println("Do you want to play? Type (Y/N): ");
		i++;
		
		String response = A.nextLine();
		if(response.toUpperCase().equals("N"))
			{
			answer = "N";
			
			//This will print the results of the playthrough and exit the program.
			if(total >= 0)
			{
			System.out.println("You played "+i+" times. You have won $"+total+". \nGoodbye.");
			System.exit(0);
			}
			else
			{
			System.out.println("You played "+i+" times. You have lost $"+Math.abs(total)+". \nGoodbye.");
			System.exit(0);
			}
			}
		}
	
		A.close();
	}
	
}
