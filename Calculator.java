import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operator;
		double num1, num2, result;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a operator : +, -, * or /");
		operator = input.next().charAt(0);
		System.out.println("Enter the First number");
		num1 = input.nextDouble();
		System.out.println("Enter the Second number");
		num2 = input.nextDouble();
		input.close();
		
		switch(operator) {
		 
		case '+': result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = "+result);
		break;
		
		case '-': result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = "+result);
		break;
		
		case '*': result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = "+result);
		break;
		
		case '/': result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = "+result);
		break;
	}

}
	}
