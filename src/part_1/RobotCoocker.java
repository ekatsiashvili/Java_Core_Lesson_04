package part_1;

public class RobotCoocker extends Robot {

	RobotCoocker(String work) {
		super(work);
	}

	@Override
	public String toString() {
		return "RobotCoocker [" + getWork() + "]";
	}

}