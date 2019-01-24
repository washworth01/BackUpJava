package garage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage
{
	private List<Vehicle> vehicles; 
	
	public Garage()
	{
		vehicles = new ArrayList<>();
	}
	
	public void add(Vehicle v)
	{
		vehicles.add(v);
	}
	
	public List<Vehicle> getVehicles() 
	{
		return vehicles;
	}
	
	public void setVehicles(List<Vehicle> vehicles)
	{
		this.vehicles = vehicles;
	}
	
	public void calculateCost(String regNumber)
	{
		vehicles.stream()
				.filter(vehicle -> vehicle.getRegNumber().equals(regNumber))
				.forEach(vehicle -> System.out.println(vehicle.calculateCost()));
	}
}
