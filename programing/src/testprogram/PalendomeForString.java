package testprogram;

public class PalendomeForString 
{

	public static void main(String[] args) 
	{
		String reverse="";
		String original="moaom";
		   
	      int length = original.length();   
	      for ( int i = length - 1; i>= 0; i-- )  
	      {
	         reverse = reverse + original.charAt(i);  
	      }
	      if (original.equals(reverse)) 
	      {
	       System.out.println("String is a palindrome.");  
	      }
	      else  
	      {
	    	  System.out.println("String isn't a palindrome.");   
	      }
	   }
}

	


