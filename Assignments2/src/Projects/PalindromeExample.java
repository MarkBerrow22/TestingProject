package Projects;
import java.util.Scanner;
public class PalindromeExample {

	public static void main(String[] args) {

		Scanner Scanner = new Scanner(System.in);
		
		String word;
		String reverse="";
		
		System.out.println("Enter a word");
		word=Scanner.next();
		
		int i=word.length();
		
		while(i>=0)
		{
			
		reverse+=word.charAt(i);
		
		i--;
		
			
		}
		
		if(reverse.equals(word));
		{
			System.out.println("This is a Palindrome");
		}
	
		{
			System.out.println("This is not a Palaindrome");
			
		}
	}

}

		
		
		
		
		