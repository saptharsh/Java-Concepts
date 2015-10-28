package Casting;

public class App {

	public static void main(String[] args) {

		// 8 bits { -2^8 <--> 2^8 }
		byte byteValue = 99;
		
		// 16 bits
		short shortValue = 34;
		
		// 32 bits
		int intValue = 8568;
				
		// 64 bits
		long longValue = 23842;
		
		// 64 bits
		float floatValue = 2323473.694f;
		
		float value1 = 746829.3728f;
		
		/*
		 * The number type by default in the below case is: Double
		 */
		//float value = 746829.3728;
		
		float value2 = (float)746829.3728;
		
		System.out.println("Printing Float value: "+floatValue);
		System.out.println("Printing Float value: "+value1);
		
		// 64 bits
		double doubleValue = 3829432.2384;
		
		// Checking the Max and Min values
		System.out.println("Byte max value: "+Byte.MAX_VALUE);
		System.out.println("Long max value: "+Long.MAX_VALUE);
		System.out.println("Double max value: "+Double.MIN_VALUE);
		
		// Casting
		intValue = (int)longValue;
		
		System.out.println("Long to int: "+intValue);
		
		// No Casting is required
		doubleValue = intValue;
		
		System.out.println("Int to double: "+doubleValue);
		
		// Round Off
		System.out.println("Before rounding Off: "+ floatValue);
		System.out.println("Rounding Off: "+Math.round(floatValue));
		
		// Casting
		intValue = (int) floatValue;
		
		System.out.println(intValue);
		
		/*
		 * The range for byte is: -127 <--> 127.
		 * 		Hence, the below won't work as we expect it to. As 128 is too big for Byte
		 */
		byte byteeValue = (byte)128;
		System.out.println("Converting an int/short to Byte: "+ byteeValue);
		
	}

}



