package week1.day4;

public class Calculator {
	
	public void addTwoNumbers(int a , int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subTwoNumbers(int d, int e) {
	     int f=d-e;
		 System.out.println(f);
    }
	public void mulTwoNumbers(int g, int h) {
	     int i=g*h;
		 System.out.println(i);
   }
	public void divTwoNumbers(int j, int k) {
	     int l=j/k;
		 System.out.println(l);
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calculator calc=new Calculator();
        
        calc.addTwoNumbers(29, 32);
        calc.subTwoNumbers(124, 34);
        calc.mulTwoNumbers(49, 4);
        calc.addTwoNumbers(44, 2);
	}

}