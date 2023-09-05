package bicycle;

public class BicycleTest {

	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle("Salcano", "A230", 2023, "Blue");
		
		bicycle.go('l');
		bicycle.stop();
		bicycle.park();
	}

}
