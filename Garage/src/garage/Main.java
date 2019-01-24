package garage;

import java.util.Scanner;

import garage.Garage;

public class Main 
{
	public static void main(String[] args)
	{
		Garage vehicles = new Garage();
		
		Scanner sc = new Scanner(System.in);
		
		vehicles.add(new Car("AH58 QXZ", "Honda", "Civic", "Orange", 120, true));
		vehicles.add(new Motorbike("AB51 TJW", "BMW", "G310GS", "Red", 140, 9));
		vehicles.add(new Van("ER12 FGD", "Ford", "Transit", "White", 120, 80));
		
		System.out.println(vehicles.getVehicles());
		
		System.out.println("Input a vehicles registration number.");
		
		String input = sc.nextLine();
		
		vehicles.calculateCost(input);	
	}
}