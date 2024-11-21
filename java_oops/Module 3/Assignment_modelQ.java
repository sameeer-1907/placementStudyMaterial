/*
 A Professor has planned to host workshops for the Students. Students who are having even registration number are 
 going to attend Machine Learning and those who have odd registration number are going to attend Blockchain Technology
  workshop. Take user inputs for the registration number. Generate a user defined exception with 
  message “You are not allowed for the Workshop” when the student has any backlog. Otherwise print “Welcome to 
  the Workshop” along with the workshop name (i.e., Machine Learning or Blockchain Technology). 
  Print the exception in catch block.
 */
import java.util.*;
class MyExceptionBacklog extends RuntimeException
{
	String msg;
	MyExceptionBacklog(String s)
	{
		msg=s;
		System.out.println(msg);
	}
}

class Registration
{
	
	void studentRegistration() throws MyExceptionBacklog
	{
		System.out.println("Do you have any backlog? type Yes or No");
		Scanner sc=new Scanner(System.in);
		//String s1=sc.next().toUpperCase();
		String s1=sc.next();
		if(s1.equals("YES"))
		{
	try {
			throw new MyExceptionBacklog("You are not allowed for the Workshop");
	}
	catch(MyExceptionBacklog e)
	{
		System.out.println("Exception caught");
	}
			
		}
		else
		{
			System.out.println("Welcome to the Workshop. Enetr your registration number");
			//Scanner sc=new Scanner(System.in);
			int reg_no=sc.nextInt();
			if(reg_no%2==0)
			{
				System.out.println("you can attend Machine Learning workshop");
			}
			else
			{
				System.out.println("you can attend Blockchain Technology workshop");
			}
			
			
		}
		
		
	}

}

public class Assignment_modelQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registration r=new Registration();
		r.studentRegistration();

	}

}
