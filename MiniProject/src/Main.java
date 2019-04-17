
public class Main {
	public static void main(String[] args) {
		
	Person per=new Person("Rabby","Male","Dhaka",11,25);
	Human h=new Human("Rabby","Male","Dhaka",11,25,"cool","depressed","mankind");
	
//	per.setName("Rabby");
//	per.setAddress("Dhaka");
//	per.setAge(25);
//	per.setGender("Male");
//	per.setId(10);
//	System.out.println(per.getId());
//	System.out.println(per.getName());
//	System.out.println(per.getAddress());
//  System.out.println(per.getAge());
//  System.out.println(per.getGender());
	
	System.out.println(per.toString());
	System.out.println(h.toString());
    
	}

}
