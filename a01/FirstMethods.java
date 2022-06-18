package pr1.a01;

import java.io.PrintWriter;

public class FirstMethods {

	public static void main(String[] args) {	
		PrintWriter out = new PrintWriter(System.out);
		rechteckFlaechen(out);
		numberPlayB();
		flaecheAchteck(3.0);
		test(out);
		printSqrtAndCubic(out, 1, 5);
		out.flush();
	}
	
	public static void rechteckFlaechen(PrintWriter out) {
		double flaeche1 = 10.23 * 4.288;
		double flaeche2 = 5.1 * 3.86;
		out.print("Flaeche1 = ");
		out.println(flaeche1);
		out.print("Flaeche2 = ");
		out.println(flaeche2);
	}
	
	public static int numberPlayB() {
		int term = (5+7)*9-4;
		return term;
	}
	
	public static double flaecheAchteck(double a) {
		double flaeche = a*a*(2+2*Math.sqrt(2));
//		Formel von Wikipedia.org/wiki/Achteck
		return flaeche;
	}
	
	public static void test(PrintWriter out) {
		out.println(flaecheAchteck(1));
		out.println(flaecheAchteck(2.75));
		out.println(flaecheAchteck(4));
		out.println(flaecheAchteck(10));
		out.println(numberPlayB());
	}
	
	public static void printSqrtAndCubic(PrintWriter out, int minValue, int maxValue) {
		char c = '\u221A';
		while (minValue <= maxValue) {
			double a = Math.sqrt(minValue);
			double b = Math.pow(minValue, 3);
			out.print("x: ");
			out.print(minValue);
			out.print("   ");
			out.print(c);
			out.print("x:");
			out.print(a);
			out.print("   x^3: ");
			out.println(b);
			minValue++;
		}
		
	}
}
