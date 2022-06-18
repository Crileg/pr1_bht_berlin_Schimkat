package pr1.a02;

import java.io.PrintWriter;

public class SomeFunctions {

	public static void main(String[] args) {	
		test();
	}
	
	public static void test() {
		PrintWriter out = new PrintWriter(System.out);
		test(out);
	}
	
	public static double kreisUmfang(double radius) {
		return Math.PI*2*radius;
	}
	
	public static double rechteckUmfang(double a, double b) {
		return 2*a+2*b;
	}
	
	public static double rechteckFlaeche(double a, double b) {
		return a*b;
	}
	
	public static void test(PrintWriter out) {
		out.print(String.format("%17s", "Kreis Umfang: "));
		out.println(kreisUmfang(2));
		out.print(String.format("%17s", "Kreis Umfang: "));
		out.println(kreisUmfang(3));
		out.print(String.format("%17s", "Rechteck Umfang: "));
		out.println(rechteckUmfang(2, 3));
		out.print(String.format("%17s", "Rechteck Umfang: "));
		out.println(rechteckUmfang(4, 5));
		out.print(String.format("%17s", "Rechteck Fläche: "));
		out.println(rechteckFlaeche(2, 3));
		out.print(String.format("%17s", "Rechteck Fläche: "));
		out.println(rechteckFlaeche(4, 5));
		out.flush();
	}
	
}
