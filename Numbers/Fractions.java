//This program will try to add, subtract, multiply, and add fractions

import java.util.*;

public class main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of operation:");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		String op = in.nextLine(); 
		int operation = Integer.parseInt(op);
		
		System.out.println("Enter number of inputs");
		String n = in.nextLine();
		System.out.println("inputs: " + n);
		
		int numInputs = Integer.parseInt(n);
		ArrayList<Integer> numerator = new ArrayList<Integer>();
		ArrayList<Integer> denominator = new ArrayList<Integer>(); 
		while(in.hasNext()){
			System.out.println("Enter numerator");
			numerator.add(in.nextInt());
			System.out.println("Enter denominator");
			denominator.add(in.nextInt()); 
		}
		
		printArray(numerator, denominator);
		switch(operation){
			case 1:
				System.out.println("Addition");
				//add();
				break;
			case 2:
				System.out.println("Subtraction");
				//sub();
				break;
			case 3:
				System.out.println("Multiplication");
				//mult();
				break;
			case 4:
				System.out.println("Division");
				//div();
				break;
		}
	}//End of main
	
	/*Prints out the numerator and denominators*/
	static void printArray(ArrayList<Integer> num, ArrayList<Integer> den){
		int i = 0;
		while(num.listIterator().hasNext() && den.listIterator().hasNext()){
			System.out.println("Numerator" + num.get(i));
			System.out.println("Denominator" + den.get(i)); 
			i++;
		}
	}

}//end of class
