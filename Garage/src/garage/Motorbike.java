package garage;

public class Motorbike extends Vehicle
{
	//Attributes
	private int sprocketTeeth;
	
		
		
		
	//Constructors
	public Motorbike(String regNumber, String manufacturer, String make, String colour
			, int topSpeed, int sprocketTeeth)
	{
		super(regNumber, manufacturer, make, colour, topSpeed);
		this.setSprocketTeeth(sprocketTeeth);
		calculateCost(); 
	}
	public Motorbike(String regNumber, String manufacturer, String make
			, int sprocketTeeth)
	{
		this(regNumber, manufacturer, make, "Black", 0, 0);
		calculateCost(); 
	}	
	
	//Methods
	@Override
	public String toString()
	{
		return "\nRegistration Number: " + getRegNumber() + "\nManufacturer: " + getManufacturer() + "\nMake: " + getMake() 
		+ "\nColour: " + getColour() + "\nTop Speed: " + getTopSpeed() + "mph" + "\nSprocketTeeth: " + getSprocketTeeth() + "\n";
	}
	
	@Override	
	public String calculateCost() 
	{
		setCost(3000);
		
		if (getTopSpeed() > 140)
		{
			setCost(getCost() + 800);
		}
		
		if(getSprocketTeeth() > 8)
		{
			setCost(getCost() + 300);
		}
		
		return "\nRegistration Number: " + getRegNumber() + "\nManufacturer: " + getManufacturer() + "\nMake: " + getMake()
		+ "\nCost: " + getCost() + "\n";
	}
	
	public int getSprocketTeeth() 
	{
		return sprocketTeeth;
	}
	
	public void setSprocketTeeth(int sprocketTeeth) 
	{
		this.sprocketTeeth = sprocketTeeth;
	}
	
}