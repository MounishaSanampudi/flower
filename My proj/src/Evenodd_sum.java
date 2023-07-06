
public class Evenodd_sum {
public static void main(String[] args) {
	int x[]= {1,4,3,5,7,8};
	 int evensum=0;
	 int oddsum=0;
	for(int i=0;i<x.length;i++) {
		if(x[i]%2==0) {
			evensum=evensum+x[i];
			
		}
		else {
			oddsum=oddsum+x[i];
			
		}
		System.out.println(evensum);
		System.out.println(oddsum);
	}
	

	
}
}
