package testprogram;

public class ZerosAtTheEnd {

	public static void main(String[] args) {
		int a []={1,3,0,7,0,5,1,0,0,8};
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[k] =a[i];
				k++;
			}
		}
		for(int i=k;i<a.length;i++)
		{
			a[i]=0;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}


	}

}
