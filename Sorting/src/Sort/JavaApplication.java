/**
 * 
 */
package Sort;

import java.util.Arrays;

/**
 * 
 */
public interface JavaApplication {
	public static void display(Student[] students) {
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println();
	}
	public static void execution() {
		Student[] students=new Student[4];
		students[0] = new Student(1,"mahi","cfrtgbhu",12345678l);
		students[1] = new Student(3,"egr","muytrfvb",1224521l);
		students[2] = new Student(2,"zvsfr","wsdfd",1698428l);
		students[3] = new Student(4,"nuy","werfghnbn",987525878l);
		display(students);
		Arrays.sort(students);
		display(students);
	}

}
