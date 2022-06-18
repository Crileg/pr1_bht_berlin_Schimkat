package pr1.a10;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import schimkat.berlin.lernhilfe2021ws.io.DirtyFileWriter;

public class Data {

	public static void main(String[] args) {
		PrintWriter fout = new PrintWriter(new DirtyFileWriter("Data/A.txt"));
		List<Integer> liste = new ArrayList<Integer>();
		for (int i = 0; i < 75000; i++) {
			Integer a = (int) (800*Math.random());
			liste.add(a);
		}
		for(int i = 0; i < 50000; i+=10) {
			for(int j = 0; j<10; j++) {
				fout.printf("%3d   ", liste.get(i+j));
			}
			fout.println();
		}
		fout.flush();
		fout.close();
		PrintWriter dout = new PrintWriter(new DirtyFileWriter("Data/B.txt"));
		for(int i = 50000; i < 75000; i+=10) {
			for(int j = 0; j<10; j++) {
				dout.printf("%3d   ", liste.get(i+j));
			}
			dout.println();
		}
		dout.flush();
		dout.close();
	}
}
