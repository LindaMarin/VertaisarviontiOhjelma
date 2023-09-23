import java.util.Scanner;
public class Login {

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner (System.in);
	
		System.out.println ("Enter your first name: ");
		String fname = in.nextLine();
		
		System.out.println ("Enter your last name: ");
		String lname = in.nextLine();
		
		System.out.println ("Enter your company domain: ");
		String companyDom = in.nextLine();
			
		if (fname=="" || lname=="")
		{
			System.out.println("Missing information.");
		}
		else
		{
		String email = fname +(".")+ lname +("@")+ companyDom;
		System.out.println (email);
		
		String userName = fname.substring(0,4)+ lname.substring(lname.length()-4);
		System.out.println (userName);
		}
		
		in.close();
	}

}
