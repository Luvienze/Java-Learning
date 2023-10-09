package interfaces.factory1.extension;

public class HardworkingEmployee implements Hardworker {
	@Override
	public void work() {
		System.out.println("Employee is working!");
	}
	@Override
	public void workHard() {
		work();
		work();
		work();
	}
}
