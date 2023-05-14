package superkeyword;

public class College extends University{
	
	String colname;
	int colcode;
	String colloc;
	String principle;
	String type;
	
	public College() {
		// TODO Auto-generated constructor stub
	}
	
	public College(String uniname,int unicode,String loc,String colname,int colcode,String colloc,String principle,String type)
	{
		super(uniname,unicode,loc);
		this.colname = colname;
		this.colcode = colcode;
		this.colloc = colloc;
		this.principle = principle;
		this.type = type;
	}
	
	public void displayCollege()
	{
		displayUniversity();
		System.out.println("College Name : " + colname);
		System.out.println("College Code : " + colcode);
		System.out.println("Location : " + colloc);
		System.out.println("Principle of college : " + principle);
		System.out.println("Type of college (Engg/Arch/Pharma/Medical) : " + type);
	}
	
	
	
}
