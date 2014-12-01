/*
 * Thomas Hada, 107758936, L02, Homework 3
 */
public class Amount {
	// ds is the string for the dollar symbol.
	// cs is the string for the cent symbol.
	public static final String ds = "$";
	public static final String cs = "\u00A2";
	
//These are the instance variables for this class.
private int dollars;
private int cents;

//This is the default constructor.
public Amount() 
{
	dollars = 0;
	cents = 0;
}

public Amount(int x, int y)
{
	//These two loops will properly format the variables.
	if (x < 0)
		dollars = 0;
	else
		dollars = x;
	
	if (y > 0 && y < 100)
		cents = y;
	else
		cents = 0;
}

//These two methods are accessor methods, which will each
//access their respective variables when called.
public int getDollars() {return dollars;}
public int getCents() {return cents;}

//These two methods are mutator methods, which will set
//the variables to desired values.
public void setDollars(int newDollars)
{
	if (newDollars < 0)
		dollars = 0;
	else
		dollars = newDollars;
}
public void setCents(int newCents)
{
	if (newCents > 0 && newCents < 99)
		cents = newCents;
	else
		cents = 0;
}

//This is method will determine if an object is larger than the
//object it is applied to.
public boolean isLarger(Amount a)
{
	if (this.dollars > a.dollars)
		return true;
	else
	{
		if (this.dollars == a.dollars)
			{
			if (this.cents > a.cents)
				return true;
			else
				return false;
			}
		else return false;
	}
}

//This method will combine dollars and cents into one value.
public double allDollars()
{
	double x = this.dollars + (this.cents/100.00);
	return x;
}

//This method will round the object to a whole dollar value.
public int roundToDollars()
{
	int x;
	if (this.cents > 49)
	{
		x = this.dollars + 1;
		return x;
	}
	else 
		{
		x = this.dollars;
		return x;
		}
}

//This is the example method that will compare two Amount objects
//and state whether they are equal or not.
public boolean equals (Amount a)
{ if ((dollars == a.dollars) && (cents == a.cents)) return true;
else return false; }

//This method will convert the objects into strings when printed.
public String toString()
{
	String s1 = "";
	s1 = s1 + this.cents;
	if (this.cents < 10)
		s1 = "0" + s1;
	else;
	
	return ds + this.dollars + " and " + cs + s1;
}

}
