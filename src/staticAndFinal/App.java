package staticAndFinal;

import static staticAndFinal.ClassWithStatic.*;
public class App {

	public static void main(String[] args){
		
		//Static variables are associated with the class
		Thing.description = "Staic var is unique to class, and instances of objects can't access it. These are class variables";
		System.out.println(Thing.description);
		
		//Static methods should be accessed by the class, can't access using the instances of a class, single copy per class
		Thing.showInfo();
		
		//Usually count of objects created is accessed by getters
		System.out.println("The count of number of objects created, before creating the instance of the class: " + Thing.count);
		
		Thing thing1 = new Thing();
		
		Thing thing2 = new Thing();
		
		System.out.println("The count of number of objects created, after creating the instance of the class: " + Thing.count);
		
		/*
		 * If the var is not static, any copies can be made w.r.t the number of instances of classes
		 */
		thing1.name = "jack";
		thing2.name = "joe";
		
		System.out.println(thing1.name);
		System.out.println(thing2.name);
		
		thing1.fullName = "jack kruse";
		thing2.fullName = "joe sargent";
		
		thing1.showFullName();
		thing2.showFullName();
		
		
		//commonly used static variable
		System.out.println(Math.PI);
		
		/*
		 * Math.PI is constant, we can't re-assign: Math.PI = 3; PI => final static variable 
		 */
		
		
		//Our static variable
		System.out.println("My lucky constant number attached to Machine class, can called from any class:"+ Thing.LUCKY_NUMBER);
		
		CallingStaticMethod clas = new CallingStaticMethod();
		
		System.out.println("A Class(/Object) is added using a Static Method(): "+ clas.add(randomStatic()));
		
		System.out.println("A Class(/Object) is added using a Static Method(): "+ clas.add(new Thing()));
	}
	
}








