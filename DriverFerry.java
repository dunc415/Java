/**
This class is the driver to test out the methods of the vehicle class and ferry class
@author Duncan Campbell 3603844
*/


public class DriverFerry{
	public static void main(String[] args){
		Ferry ferry = new Ferry(4, 8, 14, 15000.0);
		Vehicle v1 = new Vehicle(4, 2, 10000.0);
		Vehicle v2 = new Vehicle(11, 2, 2500.0);
		Vehicle v3 = new Vehicle(4, 10, 10000.0);
		Vehicle v4 = new Vehicle(2, 2, 20000.0);
		Vehicle v5 = new Vehicle(1, 2, 1000.0);
		Vehicle v6 = new Vehicle(1, 2, 1000.0);
		
		
		
		System.out.println(ferry.addVehicle(v1));
		System.out.println(ferry.addVehicle(v5));
		System.out.println(ferry.addVehicle(v6));
		System.out.println(ferry.addVehicle(v1));
		System.out.println(ferry.addVehicle(v4));
		System.out.println(ferry.addVehicle(v2));
		System.out.println(ferry.addVehicle(v3));
		System.out.println(ferry.changePassengers(v5, 2));
		System.out.println(ferry.getWeightLeft());
		System.out.println(ferry.textualString());
		System.out.println(ferry.changePassengers(v1, 20));
		System.out.println(ferry.removeVehicle(v6));
		System.out.println(ferry.getWeightLeft());
		System.out.println(ferry.textualString());
		System.out.println(ferry.removeVehicle(v3));
		System.out.println(ferry.getWeightLeft());
		System.out.println(ferry.textualString());
	}
}
		
		