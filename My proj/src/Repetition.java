
public class Repetition {

	public static void main(String[] args) {
		String str="programming";
		String s2="";
		int count;
	    for(int i=0;i<str.length();i++) 
		{
	    	if(s2.contains(String.valueOf(str.charAt(i)))==false) 
	    	{
	    		s2=s2+str.charAt(i);
	    		count=1;
	    		
	    	  for(int j=i+1;j<str.length();j++) 
			  {
				if(str.charAt(i)==str.charAt(j)) 
				{
					count++;
					
					
				}
				
			}
	    	  System.out.println(str.charAt(i)+" "+count);
			
			
		
			
		}
	    }
	

}}

