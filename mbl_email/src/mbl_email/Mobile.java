package mbl_email;



public class Mobile {

	
	public static void main(String[] args) 
	{
	   
		String number = "+8801746252107";
		 
		
		
		if (number.matches("[0-9]+") && number.length() == 11 &&(number.startsWith("017")||number.startsWith("019")||number.startsWith("016")||number.startsWith("015"))) {
			System.out.println("Valid Number");
		}
		
		else if (number.matches("[+0-9]+") && number.length() == 14 &&(number.startsWith("+88017")||number.startsWith("+88019")||number.startsWith("+88016")||number.startsWith("+88015"))) {
			System.out.println("Valid Number");
		}
	  
		else {System.out.println("Invalid Number");}

	   }
	
	   }
	
	   
	
