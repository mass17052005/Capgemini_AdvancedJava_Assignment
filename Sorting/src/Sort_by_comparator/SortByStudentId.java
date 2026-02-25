/**
 * 
 */
package Sort_by_comparator;

import java.util.Comparator;

/**
 * 
 */
public record SortByStudentId() implements Comparator<Student>{
	@Override
	public int compare(Student student1, Student student2) {
		return student1.contactNumber().compareTo(student2.contactNumber());
	}

}
