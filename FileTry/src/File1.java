import java.awt.TextField;
import java.io.File;
import java.io.IOException;
import java.util.Formatter;

public class File1{

	public static void main(String[] args) throws IOException {
//		
		File f1=new File("C:/Users/mohd.rasadin/Desktop/rrr");
		f1.mkdir();
		File f2=new File("C:/Users/mohd.rasadin/Desktop/rrr/rr.txt");
	    System.out.println(f1.getAbsolutePath());
//	    boolean p1=
	    if(f1.exists()&&f2.exists()) {
	    	System.out.println("Ase");
	    }else {
	    	f2.createNewFile();
		    Formatter f3=new Formatter("C:/Users/mohd.rasadin/Desktop/rrr/rr.txt");
		    f3.format("%s   %s  %s\r\n", "Name","Age","Dep");
		    f3.format("%s   %d  %s", "Miraj",22,"CSE");
		    f3.close();
	    }}}