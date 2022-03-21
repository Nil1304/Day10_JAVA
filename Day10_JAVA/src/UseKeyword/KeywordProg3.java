package UseKeyword;
import java.io.*;

			//keyword used: import, throws, do, while, if, else, continue 

public class KeywordProg3 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		int i,range;
		
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
		System.out.println("Enter starting point:");
		i=Integer.parseInt(br.readLine());
		
		System.out.println("Enter range:");
		range=Integer.parseInt(br.readLine());
		
		System.out.println("The ODD numbers between "+i+" & "+range+ " are:");
		
		do {
			if(i%2==0){
				i++;
				continue;
			}
			else
				System.out.println(i);
			i++;
		}while(i<=range);
		
	}
}
