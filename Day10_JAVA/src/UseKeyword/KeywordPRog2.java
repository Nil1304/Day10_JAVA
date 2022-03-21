package UseKeyword;

			//keyword used: char, for, break, default, switch, case

public class KeywordPRog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(char ch='A'; ch<='Z'; ch++)
		{
			switch(ch) {
			
			case ('A'): 
				System.out.println(ch+" -- this is vowel");
				break;
			case ('E'): 
				System.out.println(ch+" -- this is vowel");
				break;	
			case ('I'): 
				System.out.println(ch+" -- this is vowel");
				break;
			case ('O'): 
				System.out.println(ch+" -- this is vowel");
				break;
			case ('U'): 
				System.out.println(ch+" -- this is vowel");
				break;
			default:
				System.out.println(ch+" -- this is consonant");
				break;
			}
		}
		
	}
}
