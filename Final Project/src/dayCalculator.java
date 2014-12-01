
import java.util.*;
public class dayCalculator {
//Name: Thomas Hada
//Student ID: 107758936
	

public static void main (String [] args)
	{
	Scanner A = new Scanner(System.in);
	
	System.out.println("Enter the day.");
	int day = A.nextInt();
	System.out.println("Enter the month.");
	int month = A.nextInt();
	System.out.println("Enter the year.");
	int year = A.nextInt();
	
	if (month == 1){
		month = 1;
		year = year - 1;
	}
	if (month == 2){
		month = 14;
		year = year -1;
	}
		
	int name = (day + ((26*(month + 1))/10) + (year%100) + ((year%100)/4) + ((year/100)/4) + ((year/100)*5))%7;
	
	if (name == 0)
		System.out.println("Saturday.");
	else {if (name == 1)
		System.out.println("Sunday.");
	else {if (name == 2)
		System.out.println("Monday.");
	else {if (name == 3)
		System.out.println("Tuesday.");
	else {if (name == 4)
		System.out.println("Wednesday.");
	else {if (name == 5)
		System.out.println("Thursday.");
	else {if (name == 6)
		System.out.println("Friday.");
	}}}}}}
	A.close();
	
}
}