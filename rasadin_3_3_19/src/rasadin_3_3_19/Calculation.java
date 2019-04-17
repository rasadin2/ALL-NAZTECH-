package rasadin_3_3_19;

public class Calculation {
	public int num1;
	public int num2;
	
	int num;
	public Calculation(int x,int y) {
		this.num1=x;
		this.num2=y;
		
	}
	////public void name(String name) {
		
		///System.out.println("NAME: "+name);
	//}
	public void add() {
		
		num=num1+num2;
		System.out.println ("ADD:"+num);
	}
	public void sub() {
		num=num1-num2;
		System.out.println("SUB:"+num);
	}
	public void div() {
		
		num=num1/num2;
		System.out.println("DIV:"+num);
	}
	public void mul() {
		
		num=num1*num2;
		System.out.println("MUL:"+num);
	}
}
