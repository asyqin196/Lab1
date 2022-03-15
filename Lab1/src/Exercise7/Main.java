package Exercise7;

import Exercise8.SaveWeightData;

public class Main 
{
	public static void main(String args[]) 
	{
		calcWeightMars mars = new calcWeightMars(100);
		mars.calcWeight();
		SaveWeightData list = new SaveWeightData();
	 }
}