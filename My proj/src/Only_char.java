
public class Only_char {

	public static void main(String[] args) {
	String str="mouni_2800 is me ";
	for(int i=0;i<str.length();i++) {
		if(Character.isAlphabetic(str.charAt(i))) {
			System.out.println(str.charAt(i));
		}
		else if(Character.isDigit(str.charAt(i))) {
			System.out.println(str.charAt(i));
		}
		else {
			System.out.println("this.is space");
		}
		
	}

	}

}
