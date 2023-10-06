import java.util.ArrayList;
import java.util.Collections;

public class Driver {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		System.out.println("Hello");
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		Student s1 = new Student("John", 25);
		Student s2 = new Student("Bart", 26);
		Student s3 = new Student("Sara", 45);
		
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		
		System.out.println("Initital list:");
		for (Student s : students) {
			System.out.println("Name:" + s.getName());
			System.out.println("Age:" + s.getAge());
		}
		
		Collections.sort(students);
		
		System.out.println("\nList sorted based on NAME:");
		for (Student s :students) {
			System.out.println("Name:", + s.getName());
			System.out.println("Age:", + s.getAge());
		}
		
		
		
	}

}