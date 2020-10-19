/**
This program allows the user to create a vehicle
@author Duncan Campbell 3603844
*/
import java.text.NumberFormat;

public class Ferry {
	/**
	The array full of vehicles
	*/
	private Vehicle[] vehicle;
	/**
	The companion variable for the array
	*/
	private int numVehicles;
	/**
	The number of axels on the ferry
	*/
	private int axels;
	/**
	The maximum amount of axels that are allowed on the ferry
	*/
	private int maxAxels;
	/**
	The amount of passengers on teh ferry
	*/
	private int passengers;
	/**
	The maximum amount of passengers allowed on the ferry
	*/
	private int maxPassengers;
	/**
	The total weight on the ferry 
	*/
	private double weight;
	/**
	The maximum amount of weight that is allowed on the ferry
	*/
	private double maxWeight;
	
	NumberFormat formatter = NumberFormat.getNumberInstance();
		
	
	/**
	The input for the maximum amount of passengers, weight, axels, and vehicles
	@param maxVehicles The max amount of vehicles
	@param maxAxels The max amount of axels
	@param maxPassengers The max amount of passengers
	@param maxWeight The max amount of weight
	*/
	public Ferry (int maxVehicles, int maxAxels, int maxPassengers, double maxWeight){
		vehicle = new Vehicle[maxVehicles];
		numVehicles = 0;
		this.maxAxels = maxAxels;
		this.maxPassengers = maxPassengers;
		this.maxWeight = maxWeight;
	}
	/**
	Adding a vehicle to the ferry
	@param vehicleIn The vehicle that wants to be added
	*/
	public boolean addVehicle(Vehicle vehicleIn){
		boolean success = false;
		boolean found = false;
		
		if(numVehicles == 0 && (weight + vehicleIn.getWeight()) < maxWeight && (passengers + vehicleIn.getPeople()) < maxPassengers && (axels + vehicleIn.getAxels()) < maxAxels && (numVehicles + 1) < vehicle.length){

				vehicle[numVehicles] = vehicleIn;
				numVehicles++;
				axels += vehicleIn.getAxels();
				passengers += vehicleIn.getPeople();
				weight += vehicleIn.getWeight();
				success = true;
				found = true;
			}else{
			
				for(int i = 0; i < numVehicles && !found; i++){
					if(vehicleIn.getID() == vehicle[i].getID()){
						found = true;
					
				
					}else{
						if((weight + vehicleIn.getWeight()) < maxWeight && (passengers + vehicleIn.getPeople()) < maxPassengers && (axels + vehicleIn.getAxels()) < maxAxels && (numVehicles + 1) < vehicle.length){

							vehicle[numVehicles] = vehicleIn;
							numVehicles++;
							axels += vehicleIn.getAxels();
							passengers += vehicleIn.getPeople();
							weight += vehicleIn.getWeight();
							success = true;
							found = true;
						}
					}
				}
			}
		return success;
	}
	/**
	Removing a vehicle from the ferry
	@param vehicleIn The vehicle that the user wants to remove
	*/
	public boolean removeVehicle(Vehicle vehicleIn){
		boolean success = false;
		
		if(numVehicles > 0){
		for(int i = 0; i < numVehicles; i++){
			if(vehicle[i].getID() == vehicleIn.getID()){
				vehicle[i] = vehicle[numVehicles];
				numVehicles--;
				axels -= vehicleIn.getAxels();
				passengers -= vehicleIn.getPeople();
				weight -= vehicleIn.getWeight();
				success = true;
			}
		}
		}
		return success;
	}
	/**
	Chenging the amount of passengers in a vehicle
	@param vehicleIn The vehicle that the user wants to change the amount of passengers
	@param newNum The new number of people that the user wants to change it too
	*/
	public boolean changePassengers(Vehicle vehicleIn, int newNum){
		boolean success = false;
		
		
		if(numVehicles > 0){
		for(int i = 0; i < numVehicles; i++){
			
			if(vehicleIn.getID() == vehicle[i].getID() && ((passengers - vehicle[i].getPeople()) + newNum) < maxPassengers){
				
				passengers -= vehicle[i].getPeople();
				vehicle[i].setPeople(newNum);
				passengers += vehicleIn.getPeople();
				
				success = true;
		
			}
		}
		}
		return success;
	}
	/**
	Getting the amount of weight that the ferry has left
	@return maxWeight - weight The difference between the max weight and the total weight that is already on the ferry
	*/
	public double getWeightLeft(){
		return maxWeight - weight;
	}
	/**
	The textual string that gives out the ID and weight on the vehicle
	@return str The textual string that is created
	*/
	public String textualString(){
		formatter.setMaximumFractionDigits(2);
		formatter.setMinimumFractionDigits(2);
		formatter.setMinimumIntegerDigits(5);
		String str = "";
		String str1 = "";
		
		for(int i = 0; i < numVehicles; i++){
			str += vehicle[i].getID() + "\t" + formatter.format(vehicle[i].getWeight()) + " kg\n";
			
		}
		
		str1 = "Total Weight: \t\t" + formatter.format(weight) + "\n" + "Total Axels: \t\t" + axels + "\n" + "Total Passengers: \t" + passengers + "\n";
	
		
		return str + str1;
		
		
	}
}
				
				
				
				
				
				
				
				
				
				
	
	
