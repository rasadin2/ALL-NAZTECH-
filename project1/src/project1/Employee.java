package project1;

public abstract class Employee {
	
	private String emp_name;
	private String emp_id;
	private String basic_salary;
	
	
	
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_id() {
		return emp_name;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	
	public String getBasic_salary() {
		return  basic_salary;
	}
	public void setBasic_salary(String basic_salary) {
		this.basic_salary = basic_salary;
	}
	
	public String attendence() {
	return "this is form attendence"; 	
	}
	abstract String salary();
}
