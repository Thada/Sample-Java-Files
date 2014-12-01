/*Thomas Hada
 *107758926, HW 1, L02
 */

import java.util.*;
import java.text.NumberFormat;
import java.lang.Math;
public class Distance{

	public static void main(String[] args){
		
	//This is the welcome text.
	System.out.println("*** WELCOME TO THE DISTANCE CALCULATOR PROGRAM ***");
	
	//This will get input from the user.
	Scanner A = new Scanner(System.in);
	System.out.print("Enter the coordinates of the first point: ");
	double x1 = A.nextDouble();
	double y1 = A.nextDouble();
	System.out.print("\nEnter the coordinates of the second point: ");
	double x2 = A.nextDouble();
	double y2 = A.nextDouble();
	
	//This will do the distance calculations.
	double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
	
	//This will format the answer.
	NumberFormat nf = NumberFormat.getInstance();
	nf.setMinimumFractionDigits(2);
	nf.setMaximumFractionDigits(2);

	//This will print the answer.
	System.out.println("The distance between these two points is: "+nf.format(distance));
	A.close();
	}
}