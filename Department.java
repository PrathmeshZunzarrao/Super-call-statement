package superkeyword;

public class Department extends College{
	
	String dname;
	int noofstu;
	int noofpro;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public Department(String uniname,int unicode,String loc,String colname,int colcode,String colloc,String principle,String type,String dname, int noofstu, int noofpro)
	{
		super(uniname,unicode,loc,colname,colcode,colloc,principle,type);
		
		this.dname = dname;
		this.noofstu = noofstu;
		this.noofpro = noofpro;	
	}
	
	public void displayDepartment()
	{
		displayCollege();
		System.out.println("Department : " + dname);
		System.out.println("No of Students : " + noofstu);
		System.out.println("No of Professors : " + noofpro);	
	}
}
