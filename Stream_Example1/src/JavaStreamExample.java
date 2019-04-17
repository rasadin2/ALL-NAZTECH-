import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList; 
import java.util.*;  

public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Employee> employesList = new ArrayList<Employee>();  
        //Adding Products  
        employesList.add(new Employee(1,"RASADIN AK",25000f,"MALE"));  
        employesList.add(new Employee(2,"ABIDA PK",25000f,"FMALE"));  
        employesList.add(new Employee(3,"PRITOM PK",25000f,"MALE"));  
        employesList.add(new Employee(4,"RABBY TAK",38000f, "MALE"));  
        employesList.add(new Employee(5,"SABINA NK",90000f,"FMALE")); 
        employesList.add(new Employee(6,"RASADIN12 AK",5000f,"MALE"));  
        employesList.add(new Employee(7,"ABIDA12 PK",2000f,"FMALE"));  
        employesList.add(new Employee(8,"PRITOM12 PK",5000f,"MALE"));  
        employesList.add(new Employee(9,"RABBY12 TAK",8000f, "MALE"));  
        employesList.add(new Employee(10,"RABINA12 NK",9000f,"FMALE")); 
        employesList.add(new Employee(11,"RABbby12 NK",9000f,"FMALE"));
        
        employesList.stream()  
                    .filter(s -> s.name.startsWith("R")&& s.salary<50000f && s.gender.startsWith("F") )   // filtering price  
                    .map(pm ->pm.name ) // fetching name  
                    //.map(a ->a.name) // fetching id
                    .forEach(System.out::println);  // iterating price  
        employesList.stream() 
        .filter(s -> s.name.startsWith("R")&& s.salary<50000f && s.gender.startsWith("F") )   // filtering price  
        .map(pm ->pm.id ) // fetching name  
        //.map(a ->a.name) // fetching id
        .forEach(System.out::println);  // iterating price
        
    }  
}  