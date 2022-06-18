package pr1.a04.vb;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

import schimkat.berlin.lernhilfe2021ws.io.DirtyFileReader;

public class VorbereitungInput {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		scannerAusprobieren();
	}
	
	public static void scannerAusprobieren() {
		PrintWriter out = new PrintWriter(System.out);
		String intNumbers = "6 8 32 27 35 90 29 27 93 37 56 37 51 83 64 1 85 39 3";
		Scanner in = new Scanner(intNumbers);
		String doubleNumbers = "23.234 343242.345 324.325 324.34 2354.3251 234.234. 546.345 34.436 546.546 54654.35";
		Scanner din = new Scanner(doubleNumbers);
		String mixedNumbers = "324 5546 29 27 23.234 93 37 2354.3251 56 37 325 324.34 234.234 22 546.345 213";
		Scanner min = new Scanner(mixedNumbers);
		DirtyFileReader reader = new DirtyFileReader("./data/testfiles/zahlen01.txt");
		Scanner rin = new Scanner(reader);
		out.println("Int Numbers:");
		while(in.hasNext()) {
			String i = in.next();			
			out.println("Zahl: " +i);
			out.flush();
		}
		in.close();
		out.println("===============");
		out.println("Double Numbers:");
		while(din.hasNext()) {
			String d = din.next();
			out.println("Zahl: " +d);
			out.flush();
		}
		din.close();
		out.println("===============");
		out.println("Mixed Numbers:");
		while(min.hasNext()) {
			String m = min.next();

			out.println("Zahl: " +m);
			out.flush();
		}
		min.close();

		out.println("===============");
		while(rin.hasNext()) {
			String r = rin.next();
			out.print("Zahl aus Datei:");
			out.println(r);
			out.flush();
		}
		rin.close();
	}
}