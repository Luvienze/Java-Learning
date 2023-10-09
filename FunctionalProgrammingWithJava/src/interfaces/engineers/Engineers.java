package interfaces.engineers;

public abstract class Engineers implements Person{
	protected String name;
	protected int age;
	protected String profession;
	
	public Engineers(String name, int age, String profession) {
		this.name = name;
		this.age = age;
		this.profession = profession;
	}

	@Override
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public void printInfo() {
		System.out.println("\nName: " + name);
		System.out.println("Age: " + age);
		System.out.println("Profession: " + profession);
	}
	@Override
	public String toString() {
		return "Engineer \nName: " + name + " Age: " + age +  " Profession: " + profession;
	}
	
}
