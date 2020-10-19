/**
This program allows the user to create a vehicle
@author Duncan Campbell 3603844
*/

public class Vehicle {
	/**
	The amount of people in the vehicle
	*/
	private int numPeople;
	/**
	The amount of axels on the vehicle
	*/
	private int numAxels;
	/**
	The weight of the vehicle
	*/
	private double weight;
	/**
	The starting number that the vehicle gets when registered
	*/
	private static int startNum = 100;
	/**
	The ID of the vehicle
	*/
	private final int ID;

	/**
	Allows the user to set the number of people, number of axels, and the weight of the car
	@param numPeople Number of people in the car
	@param numAxels Number of axels on the car
	@param weight The weight of the car
	*/
	public Vehicle (int numPeople, int numAxels, double weight){
		this.numPeople = numPeople;
		this.numAxels = numAxels;
		this.weight = weight;
		ID = startNum;
		startNum++;
	}
	/**
	Allows the user to acquire the number of people in the car
	@return numPeople
	*/
	public int getPeople(){
		return numPeople;
	}
	/**
	Allows the user to acquire the number of axels on the car
	@return numAxels
	*/
	public int getAxels(){
		return numAxels;
	}
	/**
	Allows the user to acquire the weight of the car
	@return weight
	*/
	public double getWeight(){
		return weight;
	}
	/**
	Allows the user to acquire the ID of the car
	@return ID
	*/
	public int getID(){
		return ID;
	}
	/**
	Allows the user to set the number of people in the car
	@param newPeople
	*/
	public void setPeople(int newPeople){
		numPeople = newPeople;
	}
}
