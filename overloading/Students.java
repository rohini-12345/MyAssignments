package overloading;

public class Students {
	
public void getStudentInfo(int Id) {
  System.out.println("student Id no:"+Id);

}
public void getStudentInfo(String name,int Id) {
	System.out.println("Student name"+name);
	System.out.println("Student Id"+Id);
}

public void getStudentsInfo(String email,String phoneNumber) {
	System.out.println("student email id:"+email);
	System.out.println("student phone number"+phoneNumber);

}
	public static void main(String[] args) {
		Students s = new Students();
		s.getStudentInfo(312);
		s.getStudentInfo("Rohini", 3123);
		s.getStudentsInfo("rohini14@gmail.com", "9861551441");

	}

}
