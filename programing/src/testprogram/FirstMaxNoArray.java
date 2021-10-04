package testprogram;

public class FirstMaxNoArray {
	public static void main(String[] args) {
		int [] a= {50,30,10,20,40};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			System.out.println("First maximun no:"+a[0]);
			System.out.println("Second maximun no:"+a[1]);
			System.out.println("First minimum no:"+a[a.length-1]);
			System.out.println("Second minimum no:"+a[a.length-2]);

	}


}
