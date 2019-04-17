package rasadin2;
import java.util.Scanner;

public class inputTest {
	

	public static void main(String args[])
    {
        String str;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter String : ");
        str = scan.nextLine();
		
        System.out.print("You entered " +str);
    }

}
