package UseKeyword;
							//keyword used: abstract,return 
abstract class Addition{
	
	public int x,y;
	
	abstract void display();  // abstract method
	
	 public int add(int a,int b){
		 	this.x=a;
		 	this.y=b;
			return(x+y);
		}
}

public class KeywordProg4 extends Addition {
	
	void display() {  //abstract method overridden
		
		System.out.println("Welcome to Additon Program");
		System.out.print("The addtion of two number is:");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeywordProg4 obj=new KeywordProg4();
		int ans=obj.add(5,3);
		obj.display();
		System.out.println(ans);
	}
}

