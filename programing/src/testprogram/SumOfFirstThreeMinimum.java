package testprogram;

public class SumOfFirstThreeMinimum {
	public static void main(String[] args) {
		int [] a= {50,30,10,20,40};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	int sum1=0;
	for(int i=0;i<3;i++)
	{
		sum1=sum1+a[i];
	}
	System.out.print("Sum of first three Minimum no:"+sum1);

  }
}
