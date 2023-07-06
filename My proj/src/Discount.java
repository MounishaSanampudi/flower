import java.util.*;
public class Discount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt(0);
		int b=100;
		int c=a*b;
		int discount;
		if(c>1000) {
			discount=(c*10)/100;
			c=c-discount;
			System.out.println(c + " it is final discount");
		}
		else {
			System.out.println("no discount");
			
			
		}

	}

}
