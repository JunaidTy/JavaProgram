package testprogram;

public class ArrayAlbhabaticallyOrder {

	public static void main(String[] args) {
		//Java Program to sort an array in alphabetical order.
				      
		     // int n=10;//Declare the array size
		     String fruits[]= {"Banana","Custard apple","Blackberry","Apple","Dates", "Grapes","Guava","Orange", "Papaya","Kiwi"};   //Declare the array
		     for(int i=0;i<fruits.length;i++)
		     {
		     System.out.print(fruits[i]+" ");
		     }
		      
		        //logic for sorting     
		         for(int i=0;i<fruits.length;i++)   //Holds each element
		         {  
		             for (int j=i+1;j<fruits.length;j++)  //Check for remaining elements 
		             {  
		                //compares each elements of the array to all the remaining elements  
		                if(fruits[i].compareTo(fruits[j])>0)   
		                {  
		                    //swapping array elements  
		                    String temp = fruits[i];  
		                    fruits[i] = fruits[j];  
		                    fruits[j] = temp;  
		                 }  
		              }  
		           }
		         System.out.println();
		           //prints the sorted array in alphabetical order  
		         for(int i=0;i<fruits.length;i++)
		 		{
		 			System.out.print(fruits[i]+" ");
		 		}  
		       }  
		

	}


