package com.eclipse.patterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * The Iterator pattern allows you to move through a list or collection 
 * of data using a standard interface without having to know the details 
 * of the internal representations of that data. In addition you can also 
 * define special iterators that perform some special processing and 
 * return only specified elements of the data collection.
 * 
 * 1. Data modification. The most significant question iterators may raise 
 * is the question of iterating through data while it is being changed. If 
 * your code is wide ranging and only occasionally moves to the next element, 
 * it is possible that an element might be added or deleted from the 
 * underlying collection while you are moving through it. It is also possible 
 * that another thread could change the collection. There are no simple 
 * answers to this problem. You can make an enumeration thread-safe by 
 * declaring the loop to be synchronized, but if you want to move through a 
 * loop using an Enumeration, and delete certain items, you must be careful of 
 * the consequences. Deleting or adding an element might mean that a particular 
 * element is skipped or accessed twice, depending on the storage mechanism 
 * you are using.
 * 
 * 2. Privileged access. Enumeration classes may need to have some sort of 
 * privileged access to the underlying data structures of the original container 
 * class, so they can move through the data. If the data is stored in a Vector 
 * or Hashtable, this is pretty easy to accomplish, but if it is in some other 
 * collection structure contained in a class, you probably have to make that 
 * structure available through a get operation. Alternatively, you could make 
 * the Iterator a derived class of the containment class and access the data 
 * directly. The friend class solution available in C++ does not apply in Java. 
 * However, classes defined in the same module as the containing class do have 
 * access to the containing classes variables.
 * 
 * 3. External versus Internal Iterators. The Design Patterns text describes two 
 * types of iterators: external and internal. Thus far, we have only described 
 * external iterators. Internal iterators are methods that move through the entire 
 * collection, performing some operation on each element directly, without any 
 * specific requests from the user. These are less common in Java, but you could 
 * imagine methods that normalized a collection of data values to lie between 0 
 * and 1 or converted all of the strings to a particular case. In general, external 
 * iterators give you more control, because the calling program accesses each 
 * element directly and can decide whether to perform an operation on.
 * */
public class IteratorPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		standardSample();

	}

	private static void standardSample() {
		// Standard sample from java.util package.
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);

		Iterator<Integer> ite = list.iterator();
		while (ite.hasNext()) {
			int element = (Integer) ite.next();
			System.out.print(element + " ");
			if (element % 2 != 0) {
				ite.remove();
			}
		}
		System.out.println();
		System.out.println(list);
	}

}// end of Iterator class
