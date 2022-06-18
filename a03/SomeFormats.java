package pr1.a03;

import java.io.PrintWriter;

public class SomeFormats {

	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		out.println(prettyInt(5, 1));
		out.println(prettyInt(6*23, 15));
		out.println(prettyInt(1+2-3+2, 6));
		out.println(prettyNumber(5.12, 1, 2));
		out.println(prettyNumber(12.24, 5, 5));
		out.println(prettyNumber(1, 1, 0));
		printPretty(out, 12.3, 4, 2);
		printPretty(out, 123.45, 6, 3);
		printPretty(out, 214.25435234, 6, 54);
		out.flush();
	}
	
	public static String prettyInt (int n, int width) {
		return 	String.format("%" + width + "d", n);
	}
	
	public static String prettyNumber (double n, int width, int precision) {
		return 	String.format("%" + width + "." + precision + "f", n);
	}
	
	public static void printPretty (PrintWriter out, double n, int width, int precision) {
		out.print(prettyNumber(n, width, precision));
	}

}
