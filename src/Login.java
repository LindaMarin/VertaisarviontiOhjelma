import java.util.Scanner;
public class Login {

	public static void main(String[] args) 
	{
	//Open a scanner to collect information from user.
		
		Scanner in = new Scanner (System.in);
	
	//Ask user for first name, last name & company domain address. 
	//After needed information collected, close scanner.
		
		System.out.println ("Enter your first name: ");
		String fname = in.nextLine();
		
		System.out.println ("Enter your last name: ");
		String lname = in.nextLine();
		
		System.out.println ("Enter your company domain: ");
		String companyDom = in.nextLine();
		
		in.close();
		
	//Check if input is empty in which case print error message, else continue to generate email & user name.
		
		if (fname=="" || lname=="" || companyDom=="")
		{
			System.out.println("Missing information.");
		}
		else
		{
			System.out.println(generateEmail(fname, lname, companyDom));
			System.out.println(generateUserName(fname, lname));
		}
		
	}
	
	//Method which generates email from user input values of first name, last name & company domain address.
	//Email is  converted to lower case.
	
	public static String generateEmail (String fname, String lname, String companyDom)
	{ 
		String email = fname +(".")+ lname +("@")+ companyDom;
		email = email.toLowerCase();
		return email;
	}
	
	//Method which generates user name from user input.
	//User name is made from first name (first 4 letters) & last name (last 4 letters).
	//User name is also converted to lower case.
	
	public static String generateUserName (String fname, String lname)
	{
		String userName = fname.substring(0,4)+ lname.substring(lname.length()-4);
		userName = userName.toLowerCase();
		return userName;
	}

}
