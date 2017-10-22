package com.eclipse.patterns;

/*
 * Frequently, as your programs evolve and develop, they grow in complexity. 
 * In fact, for all the excitement about using design patterns, these 
 * patterns sometimes generate so many classes that it is difficult to 
 * understand the program’s flow. Furthermore, there may be a number of 
 * complicated subsystems, each of which has its own complex interface. 
 * The Façade pattern allows you to simplify this complexity by providing 
 * a simplified interface to these subsystems. 
 * 
 * The Facade pattern shields clients from complex subsystem components 
 * and provides a simpler programming interface for the general user. 
 * However, it does not prevent the advanced user from going to the deeper, 
 * more complex classes when necessary.
 * 
 * In addition, the Facade allows you to make changes in the underlying 
 * subsystems without requiring changes in the client code, and reduces 
 * compilation dependencies.
* */

public class FacadePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Like using JDBC to connect to varieties of DB, " +
				"extract the common part and build an interface, reduce the system dependencies.");
	}

}//end of Facade class
