package week1.day1;

public class Car {
	public void enginestart() {
		System.out.println("enginestart");
	}
	public void turnonAC() {
	    System.out.println("turnonAC");
	}
	public void gearchange() {
		System.out.println("gearchange");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car features=new Car();
		features.enginestart();
		features.turnonAC();
		features.gearchange();

	}

}
