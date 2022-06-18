package pr1.a04;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

import schimkat.berlin.lernhilfe2021ws.io.DirtyFileReader;
import schimkat.berlin.lernhilfe2021ws.io.DirtyFileWriter;

public class FirstInput {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		PrintWriter out = new PrintWriter(System.out);
		Scanner in = new Scanner("1 2 3");
		out.println(countSumOf("data/testfiles/Zahlen01.txt"));
		out.println(countSumOf(in));
		out.println("Ende");
		out.flush();
	}

	public static double countSumOf(Scanner in) {
		double i = 0;
		while(in.hasNext()) {
			if(in.hasNextInt()) {
				i += in.nextInt(); 
			} else {
				i += in.nextDouble();
			}
		}
		in.close();
		return i;
	}
	
	public static double countSumOf(String filename) {
		DirtyFileReader dfr = new DirtyFileReader(filename);
		Scanner in = new Scanner(dfr);
		return countSumOf(in);
	}
	
	public static void printNumbersFrom(Scanner in, int width, int precision, PrintWriter out) {
		int i = 0;
		while(in.hasNext()) {
			if(in.hasNextInt()) {
				out.printf("%" + width + "d" , in.nextInt());
			} else {
				out.printf("%" + width + "." + precision + "f", in.nextDouble());
			}
			i++;
			out.flush();
			if(i % 10 == 0) {
				out.println();
			}
		}
		out.println();
		in.close();
	}
	
	public static void copyNumberFile(String alt, String neu, int width, int precision, PrintWriter out) {
		PrintWriter fout = new PrintWriter(new DirtyFileWriter(neu));
		DirtyFileReader reader = new DirtyFileReader(alt);
		Scanner in = new Scanner(reader);

		int i = 0;
		while (in.hasNext()) {
			double a = in.nextDouble();
			fout.printf("%" + width + "." + precision + "f", a);
			i++;
			if (i % 10 == 0) {
				fout.println();
			}
		}
		in.close();
		fout.flush();
		fout.close();
	}
}