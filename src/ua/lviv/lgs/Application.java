package ua.lviv.lgs;

import java.io.ObjectInputStream.GetField;

public class Application {

	public static void main(String[] args) {

		Robot a = new Robot("I am robot - I'm just working");
		System.out.println(a);

		CoffeRobot b = new CoffeRobot("I am robot - I'm just making Coffe");
		System.out.println(b);

		RobotCoocker c = new RobotCoocker("I am robot - I'm just cooking food");
		System.out.println(c);

		RobotDancer d = new RobotDancer("I am robot - I'm just dancing");
		System.out.println(d);

		Robot[] array = { a, b, c, d };

		for (int i = 0; i < array.length; i++) {

			System.out.println("\n"+i+":" + array[i].getWork());
		}

	}

}
