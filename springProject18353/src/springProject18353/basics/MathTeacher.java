package springProject18353.basics;

public class MathTeacher implements Teaching{
	private String name;
	
	MathTeacher(){
		
	}
	
	MathTeacher(int age){
		this.age = age;
	}
	
	
	MathTeacher(String name,int age){
		this(age);
		this.name = name; 
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;
	
	public void toteach() {
		System.out.println("i am going to teach maths"+ name + age);
	}
	
}
