/*Thomas Hada
 *107758936, HW 1, L02
 * 
 */
import java.util.*;
import java.text.NumberFormat;
public class Slope {
public static void main(String[] args){
	
	//This is the welcome message.
	System.out.println("*** WELCOME TO THE SLOPE CALCULATOR PROGRAM ***");
	
	//This prompts the user for input and stores it.
	System.out.println("Please enter coordinates for two points as (x1,y1) (x2,y2): ");
	Scanner A = new Scanner(System.in);
	String coordinates = A.nextLine();
	
	//This will convert the string into substrings.
	String x1 = coordinates.substring(coordinates.indexOf('(')+1, coordinates.indexOf(','));
	String y1 = coordinates.substring(coordinates.indexOf(',')+1, coordinates.indexOf(')'));
	String x2 = coordinates.substring(coordinates.lastIndexOf('(')+1, coordinates.lastIndexOf(','));
	String y2 = coordinates.substring(coordinates.lastIndexOf(',')+1, coordinates.lastIndexOf(')'));
	
	//This will convert the substrings into double values to be used in calculations.
	double xA = Double.parseDouble(x1);
	double xB = Double.parseDouble(x2);
	double yA = Double.parseDouble(y1);
	double yB = Double.parseDouble(y2);
	
	//This will verify the coordinates.
	System.out.println("The coordinates are: "+xA+" "+yA+" "+xB+" "+yB);
	
	//This will calculate the slope between the coordinates.
	double slope = (yB-yA)/(xB-xA);
	
	//This will format the results.
	NumberFormat NF = NumberFormat.getInstance();
	NF.setMinimumFractionDigits(2);
	NF.setMaximumFractionDigits(2);
	
	//This will print the results.
	System.out.println("The slope of the line passing between the two points is: "+NF.format(slope));
	A.close();
}
}
