import java.util.*;
public class Main
{
	public static void main(String[] args) {

    Scanner sc=new Scanner(System.in); 
    
    
		Student student=new Student();
		
		
		student.getStudentDetails(); 



		System.out.print("My University is :" + student.university);
		
		System.out.println();
		
		System.out.print("My ID is :" + student.id);
		
			System.out.println();
		
		System.out.print("My Name is :" + student.name);
		
			System.out.println();
	}
}
class Student
{
    static String university="BHSS";
    String name;
    int id;
    public void getStudentDetails()
    {
        	
        Scanner sc=new Scanner(System.in); 
        
        System.out.printf("Enter the University:");
		
		university=sc.nextLine();
		
		System.out.printf("Enter the Student ID:");
		
		 id=sc.nextInt();
		 sc.nextLine();
		
		System.out.printf("Enter the Name:");
		
		 name=sc.nextLine();
        
    }
}