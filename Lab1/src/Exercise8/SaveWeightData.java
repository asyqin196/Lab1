package Exercise8;
import Exercise7.calcWeightMars;
import java.util.ArrayList;
import java.util.Iterator;


public class SaveWeightData  
{
	public SaveWeightData()
	{
		calcWeightMars weight1 = new calcWeightMars(45);
		calcWeightMars weight2 = new calcWeightMars(88);
		calcWeightMars weight3 = new calcWeightMars(93);

		ArrayList<calcWeightMars> weightdata = new ArrayList<calcWeightMars>();

		weightdata.add(weight1);
		weightdata.add(weight2);
		weightdata.add(weight3);

		Iterator<calcWeightMars> weightIt = weightdata.iterator();
		while (weightIt.hasNext()) 
		{
			weightIt.next().calcWeight();
		}
	}
}

