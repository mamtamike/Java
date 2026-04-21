package InvokeData;

public class StudentData {
	//class variables
	int ids;
	String sname;
	char grade;
	
	public void printData() {
		System.out.println(ids+" "+sname+" "+grade);
	}
	//constructor
	StudentData(int id, String name, char gr ) //local variables stores value of class variables
	{
		ids=id;
		sname=name;
		grade=gr;
	}

}
