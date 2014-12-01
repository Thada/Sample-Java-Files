/*
 * Thomas Hada, 107758936, L02, Homework 3
 */
import java.util.*;
import java.text.NumberFormat;
public class AmountCalculator {
	
	public static void main (String [] args)
	{
		//This is the welcome message.
		System.out.println("***Welcome to the Amount Calculator program***");
		System.out.print("Type C to continue or Q to quit: ");
		
		//This will loop the program until prompted to quit.
		Scanner input = new Scanner(System.in);
		String answer = input.nextLine();
		while (answer.toUpperCase().equals("C"))
		{
			//This will prompt for input, then store and convert the data to Amount a1.
			System.out.print("\nEnter amount-1 dollars and cents, separated by a space: ");
			String data1 = input.nextLine().trim();
			int data1Dollar = Integer.parseInt(data1.substring(0, data1.indexOf(' ')));
			int data1Cents = Integer.parseInt(data1.substring(data1.indexOf(' ') + 1));
			Amount a1 = new Amount(data1Dollar, data1Cents);
			
			//This will do the same for Amount a2.
			System.out.print("Enter amount-2 dollars and cents, separated by a space: ");
			String data2 = input.nextLine().trim();
			int data2Dollar = Integer.parseInt(data2.substring(0, data2.indexOf(' ')));
			int data2Cents = Integer.parseInt(data2.substring(data2.indexOf(' ') + 1));
			Amount a2 = new Amount(data2Dollar, data2Cents);
			
			//This will format the results.
			NumberFormat NF = NumberFormat.getInstance();
			NF.setMinimumFractionDigits(2);
			NF.setMaximumFractionDigits(2);
			
			//These print statements will call methods and print their results.
			System.out.println("\nSum of two amounts is "+add(a1, a2).toString());
			if (a1.isLarger(a2)) System.out.println("The larger amount is " + a1.toString());
			else System.out.println("The larger amount is " + a2.toString());
			System.out.println("Their difference is "+difference(a1, a2).toString());
			if (a1.equals(a2)) System.out.println("Amounts are equal.");
			else System.out.println("Amounts are not equal.");
			System.out.println("Amount-1 in dollars is "+Amount.ds+NF.format(a1.allDollars()));
			System.out.println("Rounded amount-2 is "+Amount.ds+a2.roundToDollars());
	


			//When prompted, this will break the while loop.
			System.out.println("Type C to continue or Q to quit: ");
			String ans = null;
			ans = input.nextLine();
			if(ans.toUpperCase().equals("Q"))
			{
			break;
			}
			
		}
		System.out.println("Goodbye!");
		System.exit(0);
		input.close();
		
	}
	
	//This method will add two Amount objects together.
	public static Amount add(Amount a1, Amount a2) // Returns an object of class Amount.
	{ 
	int c = 0, d = 0; // local variables.
		
	// Create a3 using the default constructor.
	Amount a3 = new Amount ();
	
	c = a1.getCents( ) + a2.getCents( ); // You cannot use just a1.cents. Why?
	//You cannot use a1.cents because a1 is private.
	if (c > 99) { c = c - 100; d = 1; }
	else { d = 0; }
	
	// Update cents value for object a3.
	a3.setCents(c);
	
	// Similarly calculate dollar value for a3 and update.
	d = d + a1.getDollars() + a2.getDollars();
	if ( d < 0) d = 0;
	else;
	
	a3.setDollars(d);
	// At the end return the Amount object a3.
	return a3;
	}
	

	//This method will subtract the larger value with the smaller one.
	public static Amount difference(Amount a1, Amount a2)
	{
		int c = 0, d = 0;
		Amount a3 = new Amount();
		if (a1.isLarger(a2))
		{
			if ((a1.getCents() - a2.getCents()) >= 0)
				{
				c = a1.getCents() - a2.getCents();
				}
			else 
				{c = 100 + (a1.getCents() - a2.getCents());
				d = -1;
				}
			d = d + (a1.getDollars() - a2.getDollars());
		}
		else 
		{
			if ((a2.getCents() - a1.getCents()) >= 0)
				{
				c = a2.getCents() - a1.getCents();
				}
			else 
				{c = 100 + (a2.getCents() - a1.getCents());
				d = -1;
				}
			d = d + (a2.getDollars() - a1.getDollars());
		}
		a3.setDollars(d);
		a3.setCents(c);
		return a3;
	}
}
