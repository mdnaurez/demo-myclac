package project2;

public class mycalc3 {
	public int sum(int a, int b) {
		return a+b;
	}
	public int diff(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mycalc3 c=new mycalc3();
		System.out.println("sum is"+c.sum(20, 10));
		System.out.println("sum is"+c.diff(20, 10));
		System.out.println("sum is"+c.mul(20, 10));
	}

}
