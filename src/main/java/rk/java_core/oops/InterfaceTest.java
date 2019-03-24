package rk.java_core.oops;

interface Animal {
	public void eat();

	public void run();
}

class Cat implements Animal {
	public void eat() {
		System.out.println("cat eats..");
	}

	public void run() {
		System.out.println("cat runs..");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		System.out.println("Welcome to Interface Test");
		Cat c = new Cat();
		c.eat();
		c.run();

	}

}
