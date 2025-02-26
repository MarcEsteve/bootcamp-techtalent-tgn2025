package UD05FlujoDatos;

public class UD05ConversionTiposApp {

	public static void main(String[] args) {

		String numString = "123";
		System.out.println("String: " + numString);
		
		long numLong = Long.parseLong(numString);
		System.out.println("Long: " + numLong);
		
		int numInt = Integer.parseInt(numString);
		System.out.println("Int: " + numInt);
		
		short numShort = Short.parseShort(numString);
		System.out.println("Short: " + numShort);
		
		byte numByte = Byte.parseByte(numString);
		System.out.println("Byte: " + numByte);
		
		double numDouble = Double.parseDouble(numString);
		System.out.println("Double: " + numDouble);
		
		float numFloat = Float.parseFloat(numString);
		System.out.println("Float: " + numFloat);
		
		// Conversión a String
		
		String stringLong = Long.toString(numLong);
		System.out.println("Un long a String: " + stringLong);
		
		String decimalString = Double.toString(numDouble);
		System.out.println("Un double a String: " + decimalString);
		
		
		

	}

}
