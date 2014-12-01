
// CSE 110 Lab 9
//
// Name: Thomas Hada
// Section: Thursday, Nov 11, 12:50 p.m.
import java.util.*;
public class BillGenerator
{
public static void main (String [] args)
{	int z = 1;
while(z > 0)
{
	System.out.println("Enter the plan number for the next customer.");
	Scanner A = new Scanner(System.in);
	int planNumber = A.nextInt();
	
	System.out.println("Enter the number of hours used.");
	Scanner B = new Scanner(System.in);
	int hoursUsed = B.nextInt();
	
   computeBills(planNumber, hoursUsed);
   z = z+1;
   A.close();
   B.close();
}
}

public static void computeBills (int planNumber, int hoursUsed)
{
	double bill = 0;
	double difference = 0;
	double rate = 0;
	int x = 0;
	double y = 0;
	
	if (planNumber == 1)
	{	x = 10;
		y = 9.95;
		rate = 2.00;
	}
	else { if (planNumber == 2)
	{	x = 20;
		y = 13.95;
		rate = 1.00;
	}
	else { planNumber = 3;
		x = 0;
		y = 19.95;
		rate = 0;
	}
	}
	
	if (hoursUsed < x)
		bill = y;
	else
	{	difference = hoursUsed - x;
		bill = y + (difference*rate);
	}
	
	System.out.println("The bill for this month is " + bill + ".");

}
}
