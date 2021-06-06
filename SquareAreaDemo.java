import java.util.Scanner;

public class SquareAreaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter side of square");
		double side= sc.nextDouble();
		
		double area=side*side;
		System.out.println("area of rectangle "+area);
	}

}
