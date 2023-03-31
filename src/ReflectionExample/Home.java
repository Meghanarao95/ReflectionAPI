package ReflectionExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
 import java.lang.reflect.Parameter;

public class Home {

	public static void main(String[] args) {
		
		
		Test t = new Test(); 
		Class clazz = t.getClass();
		System.out.println(clazz.getSimpleName());
		Constructor[] cons = clazz.getDeclaredConstructors();
		System.out.println(cons.length);
		
		// To get the constructor names 
		
		
		for ( Constructor con:cons) {
			
			System.out.println(con.getName());
		}
		
     /*   Method[] arrayofMethods = clazz.getDeclaredMethods(); // shows only the declared methods 
       
       
        System.out.println(clazz.getMethods().length); // shows all the methods in the class(inherited by super classes and methods )
        System.out.println(arrayofMethods.length);
        
        // To fetch names of all the methods listed in the class
        
          for(Method m:arrayofMethods) {
        	  
        	  System.out.println(m.getName()+"--Return Type is:---"+m.getReturnType());
        	  
        	  
        // To fetch the parameters of the methods 
        	  
        	  Parameter[] params = m.getParameters();
        	  
        	  for(Parameter param:params) {
        		  
        		  System.out.println(param.getName());
        	  }
          }
        */
	}

}
