package rasadin1;

public class student {  
public static void main(String[] args) {  
    int marks=65;  
    int age=20;  
    int weight=80; 
    if(marks<50){  
        System.out.println("fail");  
    }  
    else if(marks>=50 && marks<60){  
        System.out.println("D grade");  
    }  
    else if(marks>=60 && marks<70){  
        System.out.println("C grade");  
    }  
    else if(marks>=70 && marks<80){  
        System.out.println("B grade");  
    }  
    else if(marks>=80 && marks<90){  
        System.out.println("A grade");  
    }else if(marks>=90 && marks<100){  
        System.out.println("A+ grade");  
    }else{  
        System.out.println("Invalid!");  
    } 
    {    
        if(weight>50){  
            System.out.println("You are eligible to donate blood");  
        }    
    }    
}  
}  