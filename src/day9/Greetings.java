package day9;

public class Greetings {
	//approach1-No params no return value
	void greeting1() {  //void means no return value
		System.out.println("Hello....");
	}	
	//approach2-No params Return value	
	String greeting2() {
			return "Hello how are you";
	}
	//approach3-take params No Return
	void greeting3(String name) {
			System.out.println("Hello.."+name);
	}
	//approach4-take params Return a value
	String greeting4(String name) {
		return ("Hello.."+name);
	}
   
	}

