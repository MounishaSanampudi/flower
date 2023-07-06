
public class Digits {

	public static void main(String[] args) {
		String str[]= {"aced12f4","d3f42s1","ko1f3s2"};
		for(String s: str) {
		  for(int i=0;i<s.length();i++) 
		  {
			if(Character.isDigit(s.charAt(i))) {
				System.out.print(s.charAt(i));
			}
			
		}
		  System.out.println();
		

	}

	}}
