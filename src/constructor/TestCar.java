package constructor;

public class TestCar {

	public static void main(String[] args) {

		Car car = new Car("Ford", "Focus", 2016);

		System.out.println("Make: " + car.getMake() + "\nModel: " + car.getModel() + "\nYear: " + car.getYear());

	}

}
