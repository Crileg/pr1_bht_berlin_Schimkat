package pr1.a08;

import schimkat.berlin.lernhilfe2021ws.graphics.DirtyPainter;

public class Landschaftstest {
	public static void main(String[] args) {
		testEinfacheLandschaft();
		testLandschaft();
		testWinterLandschaft();
	}
	
	public static void testEinfacheLandschaft() {
		DirtyPainter painter = new DirtyPainter();
		painter.add(new EinfacheLandschaft());
		painter.showDrawing();
	}
	
	public static void testLandschaft() {
		DirtyPainter painter = new DirtyPainter();
		painter.add(new Landschaft());
		painter.showDrawing();
	}
	
	public static void testWinterLandschaft() {
		DirtyPainter painter = new DirtyPainter();
		painter.add(new WinterLandschaft());
		painter.showDrawing();
	}
}
