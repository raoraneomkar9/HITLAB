import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter length of rect");
double length= sc.nextDouble();
System.out.println("enter width of rect");
double width= sc.nextDouble();
double area=length*width;
System.out.println("area of rectangle "+area);

	}

}
