package project1;

public class Main {
	public static void main(String[] args) {
		
		Person per=new Person("Rasadin","Male","Dhaka",11,25);
		Human h=new Human("Rasadin","Male","Dhaka",11,25,"cool","depressed","mankind");
		Employee_details ed= new Employee_details();
		 
//		per.setName("Rasadin");
//		per.setAddress("Dhaka");
//		per.setAge(25);
//		per.setGender("Male");
//		per.setId(10);
//		System.out.println(per.getId());
//		System.out.println(per.getName());
//		System.out.println(per.getAddress());
	//  System.out.println(per.getAge());
	//  System.out.println(per.getGender());
		
		System.out.println(per.toString());
		System.out.println(h.toString());
		System.out.println(h.study());
		System.out.println(h.toString());
		System.out.println(ed.salary());
		System.out.println(ed.attendence());
		}
}
