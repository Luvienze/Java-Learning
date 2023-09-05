package plant;

public class FruitTree extends Bloomer {
	protected String fruit;
	public FruitTree(String type, String color, int leaves, String flower, String fruit) {
		super(type, color, leaves, flower);
		this.fruit = fruit;
		System.out.println("Plant with fruit");
	}
	public void produceFruit() {
		System.out.println("This tree produce " + fruit);
	}
}
