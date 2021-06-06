
public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1= 120,num2=220;
		System.out.println("--before swap--");
		System.out.println("first number "+num1);
		System.out.println("second numer "+num2);
		
		int temp =num1;
		num1=num2;
		num2=temp;
		System.out.println("--after swap--");
		System.out.println("first number: "+num1);
		System.out.println("second number: "+num2);
	}

}
