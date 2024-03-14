package Main;

abstract class Addition{
	
	abstract void add();
	
	public void sub()
	{
		System.out.println("Subtraction");
	}
}

abstract class ImplementedMethod extends Addition{
	
	abstract void division();
	public void multiply()
	
	{
		System.out.println("Multiplication");
	}
	
}

class three extends ImplementedMethod{
	
	void division() {
		System.out.println("Division");
	}
	
	void add() {
		System.out.println("Addition");
	}
}

public class New {

	public static void main(String[] args) {
		
		three im = new three();
		im.add();
		im.sub();
		im.multiply();
		im.division();
		
	}

}
