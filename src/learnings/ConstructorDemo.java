package learnings;

public class ConstructorDemo {
	int x,y;
	ConstructorDemo() //default constructor
	{
		x=100;
		y=300;
	}
	ConstructorDemo(int a, int b) //parameterized constructor
	 { 
		x=a;
		y=b;
		}
	void printData() {
		System.out.println(x+", "+y);
	}
	void sum() {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		ConstructorDemo c= new ConstructorDemo(); //invoke default constructor
		c.printData();
		c.sum();
		ConstructorDemo cd=new ConstructorDemo(10, 30); //invoke parameterized constructor/invoke data
		cd.sum(); // then invoke method/operation
		
	}

}
