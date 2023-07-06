package kavya;

class mouni {
	int x=20;
	public void display() {
		System.out.println("this is super clas");
	}
}

class kavya extends mouni {
	int x=30;
	public void display() {
		System.out.println("this is child clas"+x);
	}
}
class pila {
	public static void main(String[] args) {
		kavya k=new kavya();
		k.display();
		
	}
	
}
