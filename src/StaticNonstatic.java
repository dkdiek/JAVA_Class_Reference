
class Car{
	public static void audi() {
		System.out.println("Audi!");
	}
	
	public void benz() {
		System.out.println("Benz!");
	}
}

public class StaticNonstatic {


	public static void main(String[] args) {
		// Static : 객체를 생성하지 않고 사용 가능
		Car.audi();
		
		// Nonstatic : 객체를 생성한 후에 사용 가능
		Car car1 = new Car();
		car1.benz();

	}

}
