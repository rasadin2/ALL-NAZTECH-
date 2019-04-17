
public class Son extends Parents{
	String language="English";
@Override
public void details() {
	
	System.out.println("Details: "+"\n"+"NAME= "+name+"\n"+"SKIN COLOR= "+skin_color+"\n"+"HEIGHT= "+height+"\n"+"LANGUAGE= "+language);
}
public Son(String name,String skin_color, String height) {
	super(name,skin_color,height);
}
}
