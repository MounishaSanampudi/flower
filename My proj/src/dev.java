import java.util.Scanner;

interface client {

	void input();

	
}

class dev implements client {
	int salary;
	String name;

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("the name is : ");
		name = sc.next();
		
		System.out.println("the salary is : ");
		salary = sc.nextInt();

		
		System.out.println(salary+":"+name);
	}
	
	/*public void output() {
		
	}*/

	

	public static void main(String[] args) {
		dev k = new dev();
		k.input();
	
		
		

	}
}
