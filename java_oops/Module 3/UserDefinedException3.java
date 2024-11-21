
class InsufficientFundsException1 extends RuntimeException
{
	String msg;
	InsufficientFundsException1(String s)
	{
		msg=s;
		System.out.println(msg);
	}
}

class Amount1
{
	int balance=5000;
	
	int Balance()
	{
		return balance;
	}
	
	void Withdraw(int amount) throws InsufficientFundsException1
	{
		try{
		if(amount>balance)
		{
			throw new InsufficientFundsException1("Out of balance");
			
		}
		
		else
		{
			balance=balance-amount;
			System.out.println("current balance "+balance);
		}
		}
		catch(InsufficientFundsException1 e)
		{
			System.out.println("user defined exception is handled here");
		}
		
	}
	
}



public class UserDefinedException3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Amount1 a=new Amount1();
		a.Withdraw(10000);

	}

}
