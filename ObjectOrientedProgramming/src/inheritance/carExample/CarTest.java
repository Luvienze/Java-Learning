package carExample;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car ("Mercedes Benz", "CLK 200", "2013", 2);
		car.start();
		car.go(1000);
		car.accelerate(120);
		car.stop();
		car.turnOff();
		
	}

}
