
class Employee
{
	void display()
	{
		System.out.println("this is Employee class");
	}
	
	void calcsalary()
	{
		System.out.println("the engineer salary is 10000/-");
	}
}

class Engineer extends Employee
{
	void calcsalary()
	{
		System.out.println("the employee salary is 20000/-");  //<--- if parent class and children class have method of the same name then when called them using child class object, childclass method will be executed first...//
	
	}


}

class Salary
{
	public static void main(String args[])
	{
		Engineer o = new Engineer();
	
		o.calcsalary();
		o.display();
	}

}
