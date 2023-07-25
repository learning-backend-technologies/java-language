package demo._001_variables;

import com.sun.jdi.ShortValue;

public class _010_ConversionDeTipos_EntrePrimi {

	public static void main(String[] args) {

		int i = 22768;
		short s = (short) i;
		System.out.println("s = " + s);
		long l = i;
		System.out.println("l = " + l);
		System.out.println(Short.MAX_VALUE);
		char b = (char) i;
		System.out.println("b = " + b);
		float f = (float) i;
		System.out.println("f = " + f);
				
	}
}
