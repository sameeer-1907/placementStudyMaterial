
class InsufficientFundsException extends RuntimeException
{
	String msg;
	InsufficientFundsException(String s)
	{
		msg=s;
		
	}
	
}

class Amount
{
	int balance=5000;
	
	int Balance()
	{
		return balance;
	}
	
	void Withdraw(int amount) throws InsufficientFundsException
	
	{
		try {
		if(amount>balance)
		{
			throw new InsufficientFundsException("out of balance");
			
		}
		else
		{
			balance=balance-amount;
			System.out.println("new balance "+balance);
		}
		}
		catch(InsufficientFundsException e)
		{
			System.out.println("e");
			
		}
		
	}
	
	
}


public class UserDefined1 {

	public static void main(String[] args) {
		Amount a=new Amount();
		a.Withdraw(10000);
		

	}

}
