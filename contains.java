package strings;

public class contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String mainString = "Hello, World!";
	        String substring1 = "Hello";
	        String substring2 = "Java";

	        boolean containsSubstring1 = mainString.contains(substring1);
	        boolean containsSubstring2 = mainString.contains(substring2);

	System.out.println("Example 1:");
    System.out.println("Does the main string contain \"" + substring1 + "\"? " + containsSubstring1);
    System.out.println("Does the main string contain \"" + substring2 + "\"? " + containsSubstring2);
	}
}
