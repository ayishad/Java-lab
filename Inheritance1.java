class Parent
{
	void display1()
	{
		System.out.print("\nThis is parent class.");
	}
}

class Child extends Parent
{
	void display2()
	{
		System.out.print("\nThis is child class.");
	}
}

class Inheritance1
{
	public static void main(String args[])
	{
		Parent p=new Parent();		// Creating an object of Parent class
		Child c=new Child();		// Creating an object of Child class

		p.display1();				// Calling Parent class method using Parent class object
		c.display2();				// Calling Child class method using Child class object
		c.display1();				// Calling Parent class method using Child class object
	}
}