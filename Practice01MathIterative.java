public class Practice01MathIterative implements Practice01Math
{
	public void main(String[] args)
	{
		System.out.println("Fibonacci: "+fib(4));
		System.out.println("Factorial: "+fact(4));
	}
		
	public int fib(int n)
	{
		try 
		{
			if(n<0) 
			{
				throw new IllegalArgumentException("Only Positive Numbers.");
			}
		}

		catch(IllegalArgumentException e) 
		{
			System.out.println(e.getMessage());
		}

		if (n<=1)
			return n;
		int fib = 0;
		int originalNum = 1;
		for(int i=1;i<=n;i++)
		{
			int placeholder = fib;
			fib += originalNum;
			originalNum = placeholder;
		}
		return fib;
	}
	public int fact(int n)
	{
		if(n<0)
		{
			throw new IllegalArgumentException("Only Positive Numbers.");
		}

		int fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		return fact;

	}

}


