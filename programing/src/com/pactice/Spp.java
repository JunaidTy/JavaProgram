package com.pactice;

public class Spp{

	public static void main(String[] args) {
		for(int num=1;num<=100;num++)
		{
			int count=0;
			for(int i=num;i>=1;i--)
			{
				if(num%i==0)
				{
					count = count +1;
				}
			}
			if(count == 2)
			{
				System.out.print(num + " ");
			}
		}

	}

}
