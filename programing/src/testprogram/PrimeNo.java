package testprogram;

public class PrimeNo {

	static boolean isPrime(int num)
	{
		if(num==1)
		{
			return false;
		}
		//this for loop will check weather the no is divisible by 2 or not
		for (int i=2;i<=num/2 ;i++ )
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int count=6;
		int sum=0;
		for (int num=1;count>0;num++ )
		{
			boolean answer=isPrime(num);
			if(answer==true)
			{
				System.out.println(num);
				sum=sum+num;
				count--;
			}
		}
		System.out.println("sum="+sum);
	}

}
