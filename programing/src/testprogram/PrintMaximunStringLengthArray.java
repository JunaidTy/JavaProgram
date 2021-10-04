package testprogram;

public class PrintMaximunStringLengthArray {
	public static void main(String[] args) {
		String [] a= {"Hi","bye","P","mango","tyss","Happy"};
	String max=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(max.length()<a[i].length())
		{
			max=a[i];
		}
	}
	//System.out.println(max);
	
	for(int j=0;j<a.length;j++)
	{
		if(max.length()==a[j].length())
		{
			System.out.println(a[j]);
		}
	}
}
}
