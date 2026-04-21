package InvokeData;

public class Student {
	//class variables
	int ids; 
	String sname;
	char grade;
	
	public void printData() {
		System.out.println(ids+" "+sname+" "+grade);
	}
	//method
	public void dataSet(int id, String name, char gr )  //here in parameters these are local variable that eventually store value of class variable
	{
	    ids=id;
		sname=name;
		grade=gr;
	}
	
}
