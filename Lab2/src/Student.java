

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	
	public Student(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public int compareTo(Student o) {
		//
		
	//	if (this.age > o.getAge()) {
		//	return 1;
	//	}
		//else if (this.age < o.getAge()) {
		//	return -1;
	//	}
		//else {
		//	return 0;
	//	}
	
	}
}