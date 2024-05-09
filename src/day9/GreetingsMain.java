package day9;

public class GreetingsMain {

	public static void main(String[] args) {
		Greetings gr=new Greetings();
		gr.greeting1(); //1
		
		String str=gr.greeting2();
		System.out.println(str); //2
		
 //or   System.out.println(gr.greeting2()); //2

		gr.greeting3("John"); //3
		
		String str4=gr.greeting4("John");
		System.out.println(str4); //4
	}

}
