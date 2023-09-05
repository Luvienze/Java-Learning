package bicycle;

public class Steering {
	
	private String color;
	private int height;
	private String type;
	private char rotation;
	
	{
		color = "gray";
		height = 70;
		type = "metal";
	}
	private void rotateLeft() {
		System.out.println("\nRotating left");
	}
	private void rotateRight() {
		System.out.println("\nRotating right");
	}
	private void rotateForward() {
		System.out.println("\nRotating forward");
	}
	public void rotateSteering(char rotation) {
		if(rotation == 'f') {
			this.rotateForward();
		}
		else if(rotation == 'l') {
			this.rotateLeft();
		}
		else if(rotation == 'r') {
			this.rotateRight();
		}
		else
		{
			System.out.println("\nCannot rotate that direction.");
		}
	}

		
}
