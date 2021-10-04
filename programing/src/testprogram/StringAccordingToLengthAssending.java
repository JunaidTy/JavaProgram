package testprogram;

public class StringAccordingToLengthAssending {

	public static void main(String[] args) {
		String [] a= {"Hi","bye","P","mango","tyss","Happy"};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].length()>a[j].length())
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
