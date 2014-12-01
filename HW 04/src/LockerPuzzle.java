import java.util.Arrays;

//Thomas Hada, 107758936, L02, Homework 4
public class LockerPuzzle {

	public static void main (String [] args)  {
		
		//This is the welcome message.
		System.out.println("*** Welcome to Homework 4 ***");
		
		//This declares and initializes the array of lockers.
		boolean [] locker = new boolean [100];
		Arrays.fill(locker, false);
		
		//This will manipulate the elements of the array.
		for (int i = 0; i <= locker.length - 1; i++)
		{ 
			for (int a = i; a < 100; a = a + i + 1) 
			{
				if (locker [a] == true) locker [a] = false;
				else locker [a] = true;
			}
		}
		
		//This prints out which lockers are open.
		System.out.print("The following lockers are open: ");
		int c = 0;
		while (c < locker.length) 
		{
		if (locker [c] == true) 
		{
			System.out.print("L" + (c+1) + ", ");
			c++;
		}
		else c++;
		}
	}
}
