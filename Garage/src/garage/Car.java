package garage;

public class Car extends Vehicle
{
	//Attributes
	private boolean isConvertable;
	
	
	
	//Constructors
	public Car(String regNumber, String manufacturer, String make, String colour
			,int topSpeed, boolean isConvertable)
	{
		super(regNumber, manufacturer, make, colour, topSpeed);
		this.setConvertable(isConvertable);
		calculateCost(); 
	}
	
	public Car(String regNumber, String manufacturer, String make, boolean isConvertable)
	{	
		this(regNumber, manufacturer, make,"Black",0, false);
		calculateCost(); 
	}
	
	//Methods
	@Override
	public String toString()
	{
		return "\nRegistration Number: " + getRegNumber() + "\nManufacturer: " + getManufacturer() + "\nMake: " + getMake() 
		+ "\nColour: " + getColour() + "\nTop Speed: " + getTopSpeed() + "mph" + "\nConvertable: " + isConvertable() +"\n";
	}
	
	public String fixingToString()
	{
		return "\nRegistration Number: " + getRegNumber() + "\nManufacturer: " + getManufacturer() + "\nMake: " + getMake()
		+ "\nCost: " + getCost() + "\n";
	}
	
	@Override
	public String calculateCost() 
	{
		setCost(3000);
		
		if (getTopSpeed() > 120)
		{
			setCost(getCost() + 500);
		}
		
		if(isConvertable())
		{
			setCost(getCost() + 400);
		}
		
		return "\nRegistration Number: " + getRegNumber() + "\nManufacturer: " + getManufacturer() + "\nMake: " + getMake()
		+ "\nCost: " + getCost() + "\n";
	}
	
	public boolean isConvertable() 
	{
		return isConvertable;
	}

	public void setConvertable(boolean isConvertable) 
	{
		this.isConvertable = isConvertable;
	}
}