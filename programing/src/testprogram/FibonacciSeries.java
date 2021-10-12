package testprogram;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0,num2=1,num3;
		System.out.print(num1+" "+num2);
		int count=10;
		for(int i=2;i<count;i++)
		{
			
			num3=num1+num2;
			/*if(num3>=14)
			{
				break;
			}*/
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
			
		}

	}

}
