package pr1.a03;

import java.io.PrintWriter;
import java.util.Locale;

import schimkat.berlin.lernhilfe2021ws.io.DirtyFileWriter;

public class Aufgabe03IO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		writeMixedNumberFile ("Data/MixedNumberfile.txt", 1000, 5);
		writeIntNumberFile ("Data/IntNumberfile.txt", 1000);
	}

	public static void writeIntNumberFile (String filename, int numberCount) {
		PrintWriter fout = new PrintWriter(new DirtyFileWriter(filename));
		if (numberCount %2 != 0) {
			numberCount++;
		} 
		for(int i = 1; i <= numberCount; i++) {
			fout.printf("%6d", i);
			if((i-1)%10==0){
				fout.println();
			}
		}
		fout.flush();
	}
	
	public static void writeMixedNumberFile (String filename, int numberCount, int width) {
		PrintWriter fout = new PrintWriter(new DirtyFileWriter(filename));
		if (numberCount %2 != 0) {
			numberCount++;
		} 
		double a;
		for(int i = 1; i <= numberCount; i++) {
			double b = Math.random();
			if((i-1)%10==0 && i-1 > 0){
				fout.println();
			}
			a = i;
			if (b < 0.5) {
				fout.printf("%"+ width +"d	", i);
			} else {
				fout.printf("%"+ width +".1f	", a);
			}
		
		}
		fout.flush();
	}
}
