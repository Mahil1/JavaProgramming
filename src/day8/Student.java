package day8;

public class Student {
	    //class/instance variable
         int sid;
         String sname;
         char grade;
         
         void show() {   //void is not return anything, it just printing the data
        	 System.out.println(sid+" "+sname+" "+grade);
         }
         
         //purpose of crating this method(setData) is just to assign the data into the variable
         void setData(int id, String name, char g) {  //local variable, this method will set the data into the variable
        	 sid=id;
        	 sname=name;
        	 grade=g;
         }
         
         //constructor- it is only meant data into the variable nothing else
         Student(int id, String name, char g){ //constructor will not return any value, still we don't used void. constructor can take parameter & assign the value to the variable
            sid=id;
            sname=name;
            grade=g;
         }
}
