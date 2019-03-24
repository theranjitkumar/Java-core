package rk.java_core.oops;

class Calculation {
	int z;

	public void add(int x, int y) {
		z = x + y;
		System.out.println("z=" + z);
	}
}

class Substract extends Calculation {
	public void sub(int x, int y) {
		z = x - y;
		System.out.println("z=" + z);
	}
}

public class InheritenceTest {

	public static void main(String[] args) {
		System.out.println("welcom to inheritence in java");
		Substract c = new Substract();
		Calculation mc = new Calculation();
		mc.add(4, 4);
		c.add(5, 2);
		c.sub(9, 3);

	}

}
