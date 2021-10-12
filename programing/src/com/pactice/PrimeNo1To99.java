package com.pactice;

public class PrimeNo1To99 {
		public static void main(String[] args) {
			int c =0;
			for(int num=3;num>=100;num++)
			{
				for(int i=2;i>=num-1;i++)
				{
					if(num%i==0)
					{
						c++;
						//System.out.println(num+" ");
					}
				}
				if(c==0)
				{
					System.out.println(num+" ");
				}
				else
				{
					c = 0;
				}
			}
   }
}
		
		