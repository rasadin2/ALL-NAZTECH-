package mbl;

public class Mbl {

	public String mbl() {
		String number = "01746252107";
		 
		
		
		if (number.length() !=11 ) {
			//System.out.println("InValid Number");
			return "no";
		}
		else if (number.length() ==11 && number.startsWith("017")||number.startsWith("019")||number.startsWith("016")||number.startsWith("015") ) {
			//System.out.println("InValid Number");
			return "yes";
		}
		else {
			//System.out.println("InValid Number");
			return "no";
		}
	
		
	}}


