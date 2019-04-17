import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;

public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"spple Laptop",90000f));  
        productsList.stream()  
                    .filter(s -> s.name.startsWith("S")&&s.price<90000f)   // filtering price  
                   //.map(pm ->pm.id) // fetching name  
                    .map(a ->a.name) // fetching id
                    .forEach(System.out::println);  // iterating price  
    }  
}  