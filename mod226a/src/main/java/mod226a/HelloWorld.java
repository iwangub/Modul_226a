package mod226a;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("hello");

		String changeMe = "changeMe";

		changeMe += " changed";

		System.out.println(changeMe);

		String str = new String("Hello"); // Instanzierung einer Klasse zu einem Objekt

		str = new String("Neues Objekt"); // str wird NICHT überschrieben sondern ein neuer Platz im speicher gelegt.

		System.out.println(str);

	}
}