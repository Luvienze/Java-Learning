package plant;

public class PlantTest {

	public static void main(String[] args) {
		Plant plant = new Plant("Grass", "Green", 0);
		plant.printInfo();
		plant.carbondioObtaining();
		plant.oxygenCycling();
		
		System.out.println("--------");

		Bloomer bloomer = new Bloomer("Orchid", "Green", 5, "White");
		bloomer.printInfo();
		bloomer.needWater();
		bloomer.haulingBees();
		
		System.out.println("--------");
		
		FruitTree fruitTree = new FruitTree("Apple", "Brown", 84, "Green" ,"apple");
		fruitTree.printInfo();
		fruitTree.haulingBees();
		fruitTree.produceFruit();
	}

}
