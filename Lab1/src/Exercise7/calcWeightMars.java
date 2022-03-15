package Exercise7;


public class calcWeightMars 
{
	double weight;
	
	public calcWeightMars(double weight)
	{
		this.weight = weight;
	}
	
	void setMass(double weight) 
	{
		this.weight = weight;
	}
	
	public void calcWeight() 
	{
		double WeightonEarth = weight * 9.81;
		double WeightonMars = weight * 3.71;
		
		System.out.println("\nWeight input: "+ weight +"kg");
		System.out.println("Weight on Earth: " + WeightonEarth +"N");
		System.out.println("Weight on Mars: "+ WeightonMars +" N");
	}
}
