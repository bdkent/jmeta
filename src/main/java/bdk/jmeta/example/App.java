package bdk.jmeta.example;

public class App {
	
	public static void main(String[] args) {
		
		Person p = new Person("John", "Smith");
		p.getFirst();
		p.talk("hello");
		
//		Person.jmeta.getFirst().parameter().constructor()
		Person.jmeta.talk().invoke(p, "hello");
		
		p.jmeta().getFirst().invoke();
		p.jmeta().talk().invoke("hello");
		
		Person p2 = Person.jmeta.constructor().newInstance("Jane", "Doe");
		
		Person.jmeta.talk().words().jmeta();
		
		p2.toString();
		
		p2.jmeta().talk().parameter1().method().parameter1().method().parameter1();
		
		Person.jmeta.copyConstructor().newInstance(p2);
		Person.jmeta.talk().words().method();
		
		Person.jmeta.getChildren().invoke(p2);
		p2.jmeta().getChildren().invoke();
		
		
		Person.jmeta.getChildren().invoke(p2);
		
		Person.jmeta.newInstance(p2).getChildren().invoke();
		p2.jmeta().getChildren().invoke();
	}
}
