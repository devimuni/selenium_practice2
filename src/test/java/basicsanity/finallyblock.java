package basicsanity;

import org.testng.Assert;
import org.testng.annotations.Test;



public class finallyblock 
{
	
	
	//public static void main(String args[])
	@Test
	public void checkfinally()
	{
	      int a[] = {21, 32, 65, 78};
	     try 
	      {
	         System.out.println("Access element three :" + a[5]);
	         Assert.assertTrue(false);
	         System.out.println("after assert"); 
	         
	     }
	     catch (ArrayIndexOutOfBoundsException e) 
	     {
	         System.out.println("Exception thrown :" + e);
	        
	         
	         
	        System.exit(0);
	         
	        
	      } 
	      
	    
	      
	      finally 
	      {
	    	  
	    	
	         a[0] = 6;
	         System.out.println("First element value: " + a[0]);
	         System.out.println("The finally statement is executed");
	      }
	   }
	
	
	
	
	
	
	
	

}
