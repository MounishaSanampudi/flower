
public class A{
		
	String name;
	String rollno;
 String college;
	
	public void display() {
		System.out.println(name + rollno + college);
	}
	
	 
	 public static void main(String[] args) {
		 A obj=new A();
		 obj.college="audi";
		 obj.name="mouni";
		 obj.rollno="A123";
		 obj.display(); 
		 
		 A obj2=new A();
		 obj2.name="kavya";
		 obj2.rollno="b123";
		 obj2.display();
		 
		 
	 }
	}
		
		
		
		
		
		
		
		
	


