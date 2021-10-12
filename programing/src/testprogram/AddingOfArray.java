package testprogram;

public class AddingOfArray {
	public static void main(String[] args) {
	int [] a= {1,3,5,1,2,2,2,2,2};
	int [] b= {2,4,6,8,6,7,2,2,2,2,2,2,2};
	
	int count=a.length;
	
	if(a.length<b.length)
	{
		count=b.length;
	}
	for(int i=0;i<count;i++)
	{
		try 
		{
		   System.out.print(a[i]+b[i]+" ");
		}
		catch(Exception e)
		{
			if(a.length>b.length)
			{
				System.out.print(a[i]+" ");
			}
			else
			{
				System.out.print(b[i]+" ");
			}
		}
	}
}
}
