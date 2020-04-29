package car;

public class Modcar {
	public static void main(String[] args) {
		Car p1=new Car("adcarry","蓝色");
		p1.setFuel(2.1);
		System.out.println(p1.color+"的"+p1.getName()+"还有"+p1.getFuel()+"L油");
		Car p2=new Car(2.2,"bdcarry","白色");
		System.out.println(p2.color+"的"+p2.getName()+"还有"+p2.getFuel()+"L油");
	}

}
