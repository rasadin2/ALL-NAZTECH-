
public class Human extends Person implements Student{
	protected String feelings,thoughts,huminity;

	//constractor after inheritance 
	//when we inherit variable or method from other class super() method gives us previous class attributes
	public Human(String name, String gender, String address, int id, int age, String feelings, String thoughts,
			String huminity) {
		super(name, gender, address, id, age);
		this.feelings = feelings;
		this.thoughts = thoughts;
		this.huminity = huminity;
	}

	@Override
	public String toString() {
		return "Human [feelings=" + feelings + ", thoughts=" + thoughts + ", huminity=" + huminity + ", getName()="
				+ getName() + ", getGender()=" + getGender() + ", getAddress()=" + getAddress() + ", getId()=" + getId()
				+ ", getAge()=" + getAge() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
    @Override
    public void study()
    {
    	
    }
    public void exam()
    {
    	
    }
	

	
	
	
	

}
