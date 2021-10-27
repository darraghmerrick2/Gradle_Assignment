package A1_Gradle;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String name;
	private int age;
	private String DOB;
	private long id;
	private String username;
	private ArrayList<String> modules = new ArrayList<String>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public ArrayList<String> getModules() {
		return modules;
	}
	public void setModules(ArrayList<String> modules) {
		this.modules = modules;
	}

	public String getUsername(String name, int age)
	{
		username = name + age;
		System.out.println(username);
		return username;
	}
	

}
