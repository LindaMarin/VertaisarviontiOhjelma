import java.text.Normalizer;
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
			System.out.println(generateEmail(normalizeInput(fname),normalizeInput(lname),normalizeInput(companyDom)));
			System.out.println(generateUserName(normalizeInput(fname),normalizeInput(lname)));
		}
	}
	
	//Input is normalized (ä=a,ö=o etc.) with java.text.Normalizer and converted to lower case.
	//This is used to modify user input for generateEmail & generateUserName methods.
	
	public static String normalizeInput (String input)
	{
		return Normalizer.normalize(input, Normalizer.Form.NFD)
				   .replaceAll("[^\\p{ASCII}]", "")
				   .toLowerCase();
	}
	
	//This method generates email from user input values of first name, last name & company domain address.
	
	public static String generateEmail (String fname, String lname, String companyDom)
	{ 
		String email = fname +(".")+ lname +("@")+ companyDom;
		return email;
	}
	
	//Method which generates user name from user input.
	//User name is made from first name (first 4 letters) & last name (last 4 letters).
	
	public static String generateUserName (String fname, String lname)
	{
		String userName = fname.substring(0,4)+ lname.substring(lname.length()-4);
		return userName;
	}

}
