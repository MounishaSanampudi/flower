import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=5;j>i;j--) {
			System.out.print(j);	
		}
		System.out.println("");
	}
	
	}

}
