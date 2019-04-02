
public class test {
	public static int subtract(int num1, int num2) {
		int sub;
		sub=Math.abs(num1-num2);
		return sub;
	}
	
	public static int multiply(int num1, int num2) {
		int multi;
		multi=Math.abs(num1*num2);
		return multi;
	}
	
	public static int divide(int num1, int num2) {
		int div;
		if (num1>=num2) {
			div=num1/num2;
			}
		else {
			div=num2/num1;
		}
		return div;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(subtract(6,3));
		System.out.println(multiply(6,3));
		System.out.println(divide(6,3));
	
	}

}
