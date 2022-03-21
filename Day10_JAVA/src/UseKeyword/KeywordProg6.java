package UseKeyword;
			
				// keyword used: super

class Father{
	
	public int getAge() {   //super method
		return 55;
	}
}

class Son extends Father{
	
	public int getAge() { 
		return 22;
	}
	
	public void PrintAge() {
		
		System.out.println("Father's age: "+super.getAge());
		System.out.println("Son age: "+getAge());
	}
}
public class KeywordProg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son obj=new Son();
		obj.PrintAge();

	}

}
