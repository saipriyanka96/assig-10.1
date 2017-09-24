package mypack;
//Package is a grouping of related types providing access protection and name 
//space management
//create package name as my
import mypack.*;
//import is make class and interface available
import mypack.ClassA;
//importing classA methods
public class ClassB {
	//public keyword is used in the declaration of a class,method or 
	//field;public classes,method and fields can be accessed by the 
	//members of any class.
	//class defines instance and class fields,methods and inner classes as
	//well as specifying the interfaces the class implements and the 
		//immediate superclass of the class

	//created class name as tree
	public static void main(String[] args) 
	//static is used for memory management
	//void is used to define the return type of the method
	//String[] args is actually an array of java.lang.String type and it's name is args here
		{
		// TODO Auto-generated method stub
		System.out.println("The properties of a dog is:");
		//system is final class
		//out is a static member of system class and type printStream
		//println is method of printStream class.ln means nextline
		ClassA demo=new ClassA();//creating an object
		System.out.println("here the classA methods have been called in another package");
		demo.bark();//calling bark
		demo.run();//calling run
	}

}
