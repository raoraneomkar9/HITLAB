import java.util.Scanner;

public class ReverseNumberWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=0;
int reversenum=0;
System.out.println("input the number");
Scanner in =new Scanner(System.in);
num=in.nextInt();
while(num!=0) {
	reversenum=reversenum*10;
	reversenum=reversenum+num%10;
	num=num/10;
}
System.out.println("reverse is"+reversenum);
	}

}
