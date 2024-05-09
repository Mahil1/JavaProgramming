package day8;

public class EmployeeMain {

		public static void main(String[]args) {
			Employee1 emp1=new Employee1();
			emp1.eid=100;
			emp1.ename="John";
			emp1.job="Engineer";
			emp1.esal=10000;
			
			emp1.display();
			
			Employee1 emp2=new Employee1();
			emp2.eid=200;
			emp2.ename="scott";
			emp2.job="Manager";
			emp2.esal=40000;
			emp2.display();
		}
}
