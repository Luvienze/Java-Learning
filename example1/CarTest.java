package example1;

public class CarTest {
	public static void main (String[] args) 
	{
		Car car1 = new Car();
		int distanceToGo = 1000;
		int arrivalTime;
		
		System.out.println("When the car stands still.");
		car1.make = "Mercedes";
		car1.model = "C200";
		car1.year = "2019";
		car1.distance = 0;
		car1.speed = 0;
		String info = car1.getInfo();
		System.out.println(info);
		
		System.out.println("\nWhen the car moves.");
		car1.accelerate(225);
		car1.go(100);
		car1.go(50);
		System.out.println(car1.getInfo());
		car1.stop();
		System.out.println(car1.getInfo());
		
		System.out.println();
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "i8";
		car2.year = "2017";
		car2.distance = 10_000;
		car2.speed = 160;
		car2.accelerate(200);
		System.out.println(car2.getInfo());
		
		/* car2.accelerate(220);
		double timeToGo = car2.go(1000);
		System.out.println("Time to go 1000 km" + timeToGo + "hour.");
		System.out.println(car2.getInfo());
		*/
		System.out.println();
		car1.accelerate(200);
		arrivalTime = distanceToGo / car1.speed;
		System.out.println(car1.make +" "+ car1.model + " " + "arrive to" + distanceToGo + "at " + arrivalTime + "hours.");
		
		System.out.println();
		car2.accelerate(180);
		arrivalTime = distanceToGo / car2.speed;
		System.out.println(car2.make + " " + car2.model + " " + "arrive to" + distanceToGo + "at " + arrivalTime + "hours.");
		
	}
}	

	