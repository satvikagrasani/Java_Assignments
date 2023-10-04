package in.mindcraft;

/* 13.Take attributes for number, name and price in class Vehicle. 
 * Implement “equals” and “hashcode” methods for class Vehicle.
 * 14.Clone the objects of above class Vehicle by implementing “cloneable” interface.
 */

class Vehicle implements Cloneable {
	 private String vehicleNumber;
	 private String vehicleName;
	 private int vehiclePrice;

	public Vehicle(String number, String name, int price) {
        vehicleNumber = number;
        vehicleName = name;
        vehiclePrice = price;
    }

	// Implement the equals method to compare two Vehicle objects
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Vehicle otherVehicle = (Vehicle) obj;
		return vehicleNumber.equals(otherVehicle.vehicleNumber) && vehicleName.equals(otherVehicle.vehicleName)
				&& vehiclePrice == otherVehicle.vehiclePrice;
	}

	// Implement the hashCode method to generate a unique hash code for a Vehicle object
	@Override
	public int hashCode() {
		int result = vehicleNumber.hashCode();
		result = 31 * result + vehicleName.hashCode();
		result = 31 * result + vehiclePrice;
		return result;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String show() {
		return "Vehical number: " + vehicleNumber+ " Vehical name: " + vehicleName + " Price: " + vehiclePrice;
	}

}

public class Tester {
	public static void main(String[] args) throws CloneNotSupportedException {
		Vehicle v1 = new Vehicle("1D3", "Honda", 500000);
		Vehicle v2 = new Vehicle("1HS", "Suzuki", 500000);
		System.out.println(" v1: "+v1.show());
		System.out.println(" v2: "+v2.show());
				
		//Test the equals method
		System.out.println(v1.equals(v2) ? " v1 and v2 are equal." : " v1 and v2 are not equal.");
		
		// Test the hashCode method
        System.out.println(" Hash code for v1: " + v1.hashCode());
        System.out.println(" Hash code for v2: " + v2.hashCode());

		//Clone Object
		Vehicle v3 = (Vehicle) v1.clone();
		System.out.println(" clone of v1 is v3: "+v3.show());
	}
}
