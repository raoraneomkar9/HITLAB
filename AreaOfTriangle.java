import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter width of a triangel : ");
		Scanner in = new Scanner(System.in);
		double base = in.nextDouble();
		System.out.println("Enter Height of a triangel : ");
		double height = in.nextDouble();
		in.close();
		double area = (base * height)/2; 
		System.out.println("Area of Triangle is : "+area);
	}

}
