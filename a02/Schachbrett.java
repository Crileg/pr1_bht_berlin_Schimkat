package pr1.a02;

import java.io.PrintWriter;

public class Schachbrett {
	
	public static void main(String[] args) {
		printSchachbrett();
		printSchachbrettReverse();
	}
	
	public static void printSchachbrett() {
		PrintWriter out = new PrintWriter(System.out);
		printSchachbrett(out);
	}
	
	public static void printSchachbrettReverse() {
		PrintWriter out = new PrintWriter(System.out);
		printSchachbrettReverse(out);
	}
	
	public static void printSchachbrett(PrintWriter out) {
		char c = '\u0041';
		for (int a = 8; a > 0; a--) {
			for(int i = 1; i <= 8; i++) {
				out.print(c);
				out.print(a);
				out.print("  ");
				c++;
			}
			c = '\u0041';
			out.println();
		}
		out.flush();
	}
	
	public static void printSchachbrettReverse(PrintWriter out) {
		char c = '\u0048';
		for (int a = 1; a <= 8; a++) {
			for(int i = 1; i <= 8; i++) {
				out.print(c);
				out.print(a);
				out.print("  ");
				c--;
			}
			c = '\u0048';
			out.println();
		}
		out.flush();
	}
	

}
