package day8;

public class StudentMain {

	public static void main(String[] args) {
		
		//Student stu=new Student();
		
		/*
		//approach1- using object ref. variable to access the variable & assign the data into the object variable & then we print it
		stu.sid=102;
		stu.sname="john";
		stu.grade='A';
		stu.show();
		*/
		
		/*
		//approach2-using method
		stu.setData(102, "John", 'A');
        stu.show();
        */
		
		//approach3-using constructor
		Student stu=new Student(103,"Manoj",'T');
		stu.show();
		
	}

}
