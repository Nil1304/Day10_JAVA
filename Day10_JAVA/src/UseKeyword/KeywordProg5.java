package UseKeyword;

				//keyword used: interface,implements

interface Work   //Interface
{
	void running();
	void coding();
	void eating();
	void sleep();
	int a=245;
}

class Nilotpal implements Work{
	
	public void running() {
		System.out.println("Nilotpal is running");
	}
	
	public void coding() {
		System.out.println("Nilotpal is coding");
	}
	
	public void eating() {
		System.out.println("Nilotpal is eating");
	}
	
	public void sleep() {
		System.out.println("Nilotpal is sleeping");
	}
	
}

public class KeywordProg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Nilotpal obj=new Nilotpal();
		obj.running();
		obj.coding();
		obj.eating();
		obj.sleep();
		
	}

}
