package part_1;

public class RobotDancer extends Robot {

	RobotDancer(String work) {
		super(work);
	}

	@Override
	public String toString() {
		return "RobotDancer [" + getWork() + "]";
	}
}
