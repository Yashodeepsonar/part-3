class Vehicle{
	int speed = 170;
}

class Car extends Vehicle{
	int speed=130;
	void display(){
		System.out.println("maximum speed: "+speed);
		System.out.println("maximum speed: "+super.speed);

	}
}
class Test{
	public static void main(String[] args) {
		Car s = new Car();
		s.display();
	}
}
