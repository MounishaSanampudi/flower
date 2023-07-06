package mouni;

public class Static {
	static int x;
	int y;
	public static void f1() {
		x=1;
		
	}
  public static void main(String args[]) {
	  Static s =new Static();
	  x=10;
	  f1();
	  s.y=20;
	  
  }

}
  //here static variables can access only static variables 
//where as in main method static variables can be accessed without creating object
//non static variables can be accessed through objects.