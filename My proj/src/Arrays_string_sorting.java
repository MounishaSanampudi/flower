import java.util.Arrays;

public class Arrays_string_sorting {
	public static void main(String[] args) {
		int arr[]= {2,4,7,1,4,5};
		int t;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				t=arr[i];  
				arr[i]=arr[i+1];
				arr[i+1]=t;
				i=-1;
				
			}
			System.out.println(Arrays.toString(arr));
		}
		
		
	}

}
