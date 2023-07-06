
public class A_static {
	String name;
	String rollno;
	String college="audi";
	static String str;

	public void display() {

		System.out.println(college);

	}

	public void show() {
		System.out.println(college);
	}

	public static void main(String[] args) {
		A_static.str = "mouni";

		A_static obj = new A_static();
		

		obj.display();

		A_static obj2 = new A_static();
		obj2.name = "kavya";
		obj2.rollno = "b123";

		obj2.show();
		

	}
}

/*
 * why we are writing static method: first static varibles can ne accessed only
 * through static method whin in the same class we need not mention clsname lets
 * us take an example: public static int i; public static void display() { i=10;
 * Console.WriteLine(i); } if the "i" value should be constant then we should
 * declare static then if i want to perfrom any modulation on i we will try to
 * do in static method
 */