//https://www.youtube.com/watch?v=XWHWuFNoklk&list=PLd3UqWTnYXOkL0yWLDq4o0DBVG1r_Rm8U&index=2

//Java StringBuffer class is used to create mutable (modifiable) String objects. 
//The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed.
package string;
import java.lang.StringBuffer;

public class StringBufferClass {

	//String objects are immutable and SB objects are mutable;
	public static void main(String[] args) {
		
		String s = new String("hi");
		s.concat("hello");
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		sb.insert(5," world ");
		sb.setLength(3);
		System.out.println(sb);//prints Hello Java  
		
		/*
		 * Difference Between String Buffer and String Builder
		 * 
		 * ==> At a time on Sbuffer Object only one thread is allowed to operate.
		 * 	  Thread safety is there, but performance wise not recommended to use.
		 * 	  Both are almost same, in String Buffer every method is synchronized,,,
		 * 	  but in String Builder no method is synchronized.
		 * 
		 * Long story short:
			- StringBuilder came later in Java and is faster because multiple threads can use it (faster, but no thread-safety)
			- StringBuffer was there before and provides thread safety. Means, only one thread at a moment can use it. Hence its slower. (Slower, Thread-Safety)
		 */
		
	}

}
