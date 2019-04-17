package collection_5_3;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Random;

/////import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;


public class Main{
	public static void main(String[] args) {
	String abc="123";
	System.out.println(abc);
	
	
	int y = Integer.parseInt(abc);
	System.out.println(y);
	
	Integer x = Integer.valueOf(abc);
	System.out.println(x);
	
	
	////DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	//LocalDate localDate = LocalDate.now();
	//System.out.println(dtf.format(localDate));
	
	
	
	long millis=System.currentTimeMillis();  
	java.sql.Date date=new java.sql.Date(millis);  
	System.out.println(date); 
	
	
	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	String formattedDate=dateFormat.format(date);
	System.out.println(formattedDate); 
	
	LocalTime time=LocalTime.now();
	
	 System.out.println("Random doubles: " + Math.random());
	
	 
	 Random rand = new Random(); 
	  
     // Generate random integers in range 0 to 999 
     int rand_int1 = rand.nextInt(10); 
     int rand_int2 = rand.nextInt(1000); 

     // Print random integers 
     System.out.println("Random Integers: "+rand_int1); 
     System.out.println("Random Integers: "+rand_int2);

	}}
