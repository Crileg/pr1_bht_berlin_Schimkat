package pr1.a03;

import java.io.PrintWriter;
import schimkat.berlin.lernhilfe2021ws.io.DirtyFileWriter;
import pr1.a02.*;

public class TestSchachbrett {

	public static void main(String[] args) {
		printSchachbrett("SchachbrettReverse.txt", true);
		printSchachbrett("Schachbrett.txt", false);
	}
	
	public static void printSchachbrett(String filename, boolean isReverse) {
		PrintWriter fout = new PrintWriter(new DirtyFileWriter(filename));
		if (isReverse == false) {
			Schachbrett.printSchachbrett(fout);
		} else {
			Schachbrett.printSchachbrettReverse(fout);
		}
		fout.flush();
	}
}
