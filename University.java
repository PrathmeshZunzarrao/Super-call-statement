package superkeyword;

public class University {

		String uniname;
		int unicode;
		String loc;
		
		public University() {
			// TODO Auto-generated constructor stub
		}
		
		public University(String uniname,int unicode,String loc)
		{
			this.uniname = uniname;
			this.unicode = unicode;
			this.loc = loc;
		}
		
		public void displayUniversity()
		{
			System.out.println("University Name : " + uniname);
			System.out.println("University Code : " + unicode);
			System.out.println("Location : " + loc);
		}
		
}
