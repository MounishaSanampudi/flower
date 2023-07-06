
 class diff_static {
	static int x;
	static int y;
	 diff_static() {
		System.out.println("this.constructor");
	}
	void sum() {
		System.out.println(x+y);
		
	}
	void diff() {
		System.out.println(y-x);
	}
	
}
class b extends diff_static {
  void multi() {
	  System.out.println(x*y);
  }
  public static void main(String[] args) {
	b child=new b();
	child.x=10;
	child.y=20;
	child.sum();
	child.diff();
	child.multi();
}
}
