package car;

public class Modcar {
	public static void main(String[] args) {
		Car p1=new Car("adcarry","��ɫ");
		p1.setFuel(2.1);
		System.out.println(p1.color+"��"+p1.getName()+"����"+p1.getFuel()+"L��");
		Car p2=new Car(2.2,"bdcarry","��ɫ");
		System.out.println(p2.color+"��"+p2.getName()+"����"+p2.getFuel()+"L��");
	}

}
