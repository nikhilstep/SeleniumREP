package week1.day1;

public class Mobile {
	public void call() {
		System.out.println("call");
	}		
	public void msg() {
			System.out.println("msg");
	}
	public void playgames() {
		System.out.println("playgames");
	}
	
	public static void main(String[] agrs) {
		Mobile features=new Mobile();
		features.call();
		features.msg();
		features.playgames();
		
	}

}
