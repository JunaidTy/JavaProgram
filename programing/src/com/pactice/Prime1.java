package com.pactice;

public class Prime1 {

	public static void main(String[] args) {
		for(int num=1;num<=100;num++)
		{
			int count=0;
			for(int i=num;i>=1;i--)
			{
				if(i%num==0)
				{
					count = count +1;
				}
			}
			if(count == 2)
			{
				System.out.println(num + " ");
			}
		}

	}

}
