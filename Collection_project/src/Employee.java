import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Employee {

	public static void main(String[] args) {

//		String id,name,salary,dept;
//		String[] data= {"101","Rabby","1000000","CSE"};
//		String[] data1= {"102","Sakib","1000000","EEE"};
//		String[] data2= {"103","Pritam","1000000","CSE1"};
//		String[] data3= {"104","Rasadin","1000000","CSE2"};
//		String[] bkash_data= {"200","300","500","4000","6799"};
//		String[] rocket_data= {"1200","1300","1500","114000","16799"};
//		//String[] money= {};
//		String[] y= {"E","10"};
		
		Stack<String> list7=new Stack<String>();
		PriorityQueue<String> list8=new PriorityQueue<String>();
		
		
		list7.push("rasadin");
		System.out.println(list7);
		list7.push("rasadin");
		list7.push("rasa");
		System.out.println(list7);
		list7.pop();
		System.out.println(list7);
		
		
		
		list8.offer("rubel");
		System.out.println(list8);
		
		
//		
//	
//		ArrayList<String> list=new ArrayList<String>(); 
//		ArrayList<String> list1=new ArrayList<String>();
//		ArrayList<String> list2=new ArrayList<String>();
//		List<String> list4= new ArrayList<String>();
//		LinkedList<String>list5= new LinkedList<String>();
//		
//		
//		LinkedList<String>bkash = new LinkedList<String>();
//		LinkedList<String>rocket = new LinkedList<String>();
//		LinkedList<String>money = new LinkedList<String>();
//		LinkedList<String>money_bkash = new LinkedList<String>();
//		
//		
//		for(int i=0;i<bkash_data.length;i++)
//		{
//		bkash.add(bkash_data[i]);
//		}
//		System.out.println("bkas: "+bkash);
//		
//		
//		for(int i=0;i<rocket_data.length;i++)
//		{
//		rocket.add(rocket_data[i]);
//		}
//		System.out.println("rocket: "+rocket);
//		
//		
//		money.addAll(0,bkash);
//		money.addAll(0,rocket);
//		System.out.println("All money"+money);
//		
//		System.out.println("Subbkash:  "+money.subList(5,10));
//
//		
//		String A[]=money.toArray(new String[money.size()]);
//		for(String e: A)
//			System.out.println(e);
//		
//		
//		//out.println(list);
//		//list.add("Sakib");
//		//list.add("29");
//		
//		list5.add("abc");
//		list5.add("20");
//		list5.add("cse");
//		list5.add("rasel");
//		list5.add("10");
//		System.out.println(list5);
//		
//
//		list5.addFirst("w");
//		System.out.println(list5);
//		
//		list5.addLast("ravvy");
//		System.out.println(list5);
//		
//		list5.remove("ravvy");
//		System.out.println(list5);
//		
//		String p= list5.get(3);
//		System.out.println(p);
//		
//		String q= list5.getFirst();
//		System.out.println(q);
//		
//		
//		
//		System.out.println("SubList:  "+list5.subList(0,2));
//		
//		for(String x:list5)
//			System.out.println(x);
//		
//		
//		for(String k:y)
//			list5.add(k);
//		
//		
//		for(int i=0;i<data.length;i++)
//		{
//		list.add(data[i]);
//		list1.add(data1[i]);
//		
//		}
//		System.out.println(list);
//		//list.clear();
//		//System.out.println(list);
//		System.out.println(list1);
//		System.out.println(list.size());
//		list.addAll(0,list1);
//		System.out.println(list);
//
//		}   
//	
//	
//	
//	//public void removefromto(int from, int to,LinkedList<String>l1) {
//		
//		//l1.subList(0, 2);
//		//System.out.println("l1"+l1);
//		
}


}