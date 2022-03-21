package UseKeyword;

				// keyword used: class, package, private, short, final, byte, public,protected,boolean
				//				  int, float, double, long, void, this, extends,new

class PatientDB{
	
	private short ID;
	final byte Ward_No=5;
	
	String name;
	String last_name;
	int age;
	float height;
	double weight;	
	long mobileNo;
	protected boolean bill_status;
	
	public void setid(short id1) {
		this.ID=id1;
	}
	
	public void showid() {
		System.out.println("ID:"+ID);
	}
}

class HospitalDB extends PatientDB{
	
	public void setDB(short id1,String name1,String last_name1,int age1, float height1, double weight1, long mobileNo1,boolean status) 
	{
		
		setid(id1);
		this.name=name1;
		this.last_name=last_name1;
		this.age=age1;
		this.height=height1;
		this.weight=weight1;
		this.mobileNo=mobileNo1;
		this.bill_status=status;
	}
	
	public void showDB() {
		
		showid();
		System.out.println("Ward No: " +Ward_No);
		System.out.println("Patient Name: " +name);
		System.out.println("Last Name: " +last_name);
		System.out.println("Age: "+age);
		System.out.println("Height:"+height+"ft");
		System.out.println("Weight: "+weight+"KG");
		System.out.println("Patient Mobile No:" +mobileNo);
		System.out.println("Hospital Bill Full Cleared ? " +bill_status);
		System.out.println();
	}
}


public class KeywordProg1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HospitalDB p1 = new HospitalDB();
		
		p1.setDB((short)101,"Rohit","Sharma",39,5.9f,72,6423895645l,true);
		System.out.println("Patient Details:");
		p1.showDB();
		
		HospitalDB p2 = new HospitalDB();
		
		p2.setDB((short)102,"Priya","Roy",29,5.4f,61,8326545412l,false);
		System.out.println("Patient Details:");
		p2.showDB();
		
	}

}
