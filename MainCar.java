package inheritanceconcept;

public class MainCar {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
	        // Creating an object of the subclass
	        Car myCar = new Car();
	        
	        // Calling methods inherited from the superclass
	        myCar.move(); // Output: Vehicle is moving.
	        
	        // Calling method specific to the subclass
	        myCar.honk(); // Output: Car is honking.
	    }
	}
