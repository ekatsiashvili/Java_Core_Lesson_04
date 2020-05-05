package part_2;

public class App {

	public static void main(String[] args) {
		
		Animal a = new Animal("Dragon", 300.98, 200);			
		System.out.println("Animal name = "+a.getName()+", Animal speed = "+a.getSpeed()+" km/h"+", Animal age = "+a.getAge()+" years"+"\n-------------------------------------------------------------------------------");
		
		a.setName("Lion"); a.setSpeed(100.70); a.setAge(30);		
		System.out.println("\n"+"Animal name = "+a.getName()+", Animal speed = "+a.getSpeed()+" km/h"+", Animal age = "+a.getAge()+" years");
		

	}

}
