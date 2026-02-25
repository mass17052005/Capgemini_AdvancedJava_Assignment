/**
 * 
 */
package Sort;

/**
 * 
 */
public record Student(Integer id,String name,String mailId,Long contactNumber) implements Comparable<Student> {
	@Override
	public int compareTo(Student student) {
		if(this.id() < student.id) {// for assending reverse the > and < symbols 
			return 1;
			
		}
		else if(this.id() > student.id) {
			return -1;
			
		}
		else {
			return 0;
		}
	}

}
