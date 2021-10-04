package testprogram;

public class PrimeNo1 {
		
		static boolean isPrime(int num)
		{
			if(num==1)
			{
				return false;
			}
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					return false;
				}
			}
			return true;
			}
		public static void main(String[] args) {
			boolean answer=isPrime(7);
			if(answer==true)
			{
				System.out.println("is prime");
			}
			else
			{
				System.out.println("not a prime");
			}

	}

}
