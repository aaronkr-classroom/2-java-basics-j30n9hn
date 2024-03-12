import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		byte b = 6;
		short s = 2;
		int i = 12;
		long l = 123456789012345L;

		char c = 'Y';
		char c2 = 88; //ASCII 코드
		String str = "Do you like pizza?";

		float f = 12.3456789f;
		double d = 1234567890.123456789; // d는 선택

		boolean bool = true; //소문자로 시작

		//출력하기
		System.out.print1n(str);
		System.out.print1n(bool);
		System.out.println(" " + c);
		System.out.println("Numbers: ");
		System.out.println("\tByte : " + b);
		System.out.println("\tShort : " + s);
		System.out.println("\tInt : " + i);
		System.out.println("\tLong : " + l);
		System.out.println("\tFloat : " + f);
		System.out.println("\tDouble : " + d);

		System.out.println("\nChar2 :  " + c2);
		char c3 = 89;
		System.out.println("\nChar3 :  " + c3);
	}
}
