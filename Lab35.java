// Create array of object of class Student_Detail with attributes Enrollment_No, Name, Semester, CPI for 5 students, scan their information and print it.
import java.util.*;
public class Lab35{
	public static void main(String[] args) {
			Student_Detail[] s = new Student_Detail[5];
			Scanner sc = new Scanner(System.in);
			Scanner scm = new Scanner(System.in);
			String enrollment_No;
			String name;
			int semester;
			double cpi;

			for(int i=0;i<5;i++){
				System.out.println("Enter enrollment_No");
				enrollment_No =sc.nextLine();

				System.out.println("Enter Name");
				name =sc.nextLine();

				System.out.println("Enter Semester");
				semester =scm.nextInt();

				System.out.println("Enter cpi");
				cpi =scm.nextDouble();

				 s[i] = new Student_Detail(enrollment_No,name,semester,cpi); 
			}

			for(int i=0;i<5;i++){
				s[i].print();
			}
	}
}
class Student_Detail{
	String enrollment_No;
	String name;
	int semester;
	double cpi;

	Student_Detail(String enrollment_no,String name,int semester,double cpi){
		this.enrollment_No = enrollment_No;
		this.name = name;
		this.semester = semester;
		this.cpi = cpi;
	}

	public void print(){
		System.out.println("Enrollment No is :"+enrollment_No);
		System.out.println("name is :"+name);
		System.out.println("Semester is :"+semester);
		System.out.println("CPI is :"+cpi);
	}
}