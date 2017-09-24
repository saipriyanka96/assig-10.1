package mypack;
//Package is a grouping of related types providing access protection and name 
//space management
//create package name as my
public class ClassA {
	//public keyword is used in the declaration of a class,method or 
//field;public classes,method and fields can be accessed by the 
//members of any class.
//class defines instance and class fields,methods and inner classes as
//well as specifying the interfaces the class implements and the 
	//immediate superclass of the class

//created class name as tree
	public void run()
	//void is used to define the return type of the method
//public void run-if this thread object was instantiated using a runnable 
//target, the run() method is invoked on that runnable
	{
		System.out.println("Dog has a property that can run");
		//system is final class
//out is a static member of system class and type printStream
//println is method of printStream class.ln means nextline

	}
	public void bark()
	{
		System.out.println("Dog has a property that can bark");
	}
}
