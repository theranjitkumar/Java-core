package rk.java_core.scanner;

import java.util.Scanner;

public class ScannerTest {

	public void add(){
	      int x, y, z;
	      System.out.println("Enter two integers to calculate their sum ");
	      Scanner s = new Scanner(System.in);
	      x = s.nextInt();
	      y = s.nextInt();
	      z = x + y;
	      System.out.println("Sum of entered integers = "+z);

	      
	}	
	public static void main(String[] args) {
		ScannerTest st = new ScannerTest();
		st.add();
	}

}
