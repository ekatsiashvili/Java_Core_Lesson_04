package ua.lviv.lgs;

public class CoffeRobot extends Robot {

	CoffeRobot(String work) {
		super(work);
	}

	@Override
	public String toString() {
		return "CoffeRobot [" + getWork() + "]";
	}

}
