package interfaces.engineers;

import interfaces.engineers.traits.TeamFan;
import interfaces.engineers.traits.Parent;

public class TeamFanParentEngineer extends Engineers implements TeamFan, Parent{
	
	public TeamFanParentEngineer(String name, int age, String profession) {
		super(name, age, profession);
	}

	@Override
	public void watchMatch() {
		System.out.println(name + " engineer is watching match!");
	}

	@Override
	public void goToStadium(String stadium) {
		System.out.println(name + " enginner is going to stadium: " + stadium);
	}

	@Override
	public void supportTeam(String team) {
		System.out.println(name + " engineer supports " + team + " team!");
	}

	@Override
	public void cheer() {
		System.out.println(name + " enginner cheers!");
	}

	@Override
	public void feedKids() {
		System.out.println("Engineer is feeding his/her kids!");
	}

	@Override
	public void readBookToKids(String book) {
		System.out.println("Enginner is reading book for his/her kids: " + book);
	}

	@Override
	public void cook(String food) {
		System.out.println("Enginner is cooking: " + food);
	}

	@Override
	public void goToHoliday(String holiday) {
		System.out.println("Enginner and his/her family is going to holiday to " + holiday );
	}
	
}
