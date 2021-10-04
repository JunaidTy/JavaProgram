package testprogram;

public class PalendromeForInteger {

	public static void main(String[] args) {
		int n=151;
		
		int r,sum=0,temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Palendrome no");
		}
		else
		{
			System.out.println("Not palendrome");
		}
	}

}
