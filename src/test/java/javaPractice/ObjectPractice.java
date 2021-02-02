package javaPractice;

public class ObjectPractice {

	static ObjectPractice2 op2 = new ObjectPractice2();
	
	public static void main(String[] args) {
		
		op2.name("Mayu");
		op2.age(33);
		op2.height(5,6);
		new ObjectPractice2().name("Mayu");
		new ObjectPractice3().job();
		
	}
	
}
 