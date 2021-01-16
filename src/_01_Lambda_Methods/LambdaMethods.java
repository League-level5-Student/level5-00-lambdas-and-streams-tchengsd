package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			char[] chars = s.toCharArray();
			String sNew = "";
			for(int i = chars.length - 1; i >= 0; i--) {
				sNew += chars[i];
			}
			System.out.println(sNew);
		}, "sdrawkcab");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			char[] chars = s.toCharArray();
			String sNew = "";
			for(int i = 0; i < chars.length; i++) {
				if(i % 2 == 0) {
					chars[i] = Character.toUpperCase(chars[i]);
				} else {
					chars[i] = Character.toLowerCase(chars[i]);
				}
				sNew += chars[i];
			}
			System.out.println(sNew);
		}, "upperlowermix");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			char[] chars = s.toCharArray();
			String sNew = "";
			for(int i = 0; i < chars.length; i++) {
				sNew += chars[i];
				sNew += '.';
			}
			System.out.println(sNew);
		}, "ACRONYM");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			char[] chars = s.toCharArray();
			String sNew = "";
			for(int i = 0; i < chars.length; i++) {
				if(chars[i] != 'a' && chars[i] != 'e' && chars[i] != 'i' && chars[i] != 'o' && chars[i] != 'u' && chars[i] != 'A' && chars[i] != 'E' && chars[i] != 'I' && chars[i] != 'O' && chars[i] != 'U') {
					sNew += chars[i];
				}
			}
			System.out.println(sNew);
		}, "no vowels");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
