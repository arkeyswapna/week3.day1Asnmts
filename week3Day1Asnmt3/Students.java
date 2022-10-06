package week3Day1Asnmt3;

public class Students {
	public void getStudentInfo() {
		System.out.println("Student college is Testleaf");
	}
public void getStudentInfo(String a) {
	System.out.println("Student name is" +a);
	}
public void getStudentInfo(int a) {
	System.out.println("Student ID is" +a);
}
public void getStudentInfo(String a,int b) {
	System.out.println("Student email and phone number are:" +a+" and "+b);
	
}
	public static void main(String[] args) {
		Students s=new Students();
		s.getStudentInfo();
		s.getStudentInfo("Swapna");
		s.getStudentInfo(123);
		s.getStudentInfo("swapna@gmail.com", 12345678);

	}

}
