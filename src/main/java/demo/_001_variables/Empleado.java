package demo._001_variables;

public class Empleado {

	private String name;
	private Integer age; 
	private Float salary;
	private String sex;
	private Boolean imss;
	
	public Empleado(String name, Integer age, Float salary, String sex, Boolean imss) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.sex = sex;
		this.imss = imss;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Boolean getImss() {
		return imss;
	}
	public void setImss(Boolean imss) {
		this.imss = imss;
	} 
	
}
