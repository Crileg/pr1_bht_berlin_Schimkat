package pr1.a07.test;

import schimkat.berlin.lernhilfe2021ws.graphics.DirtyPainter;

public class Test {
	
	public static void main(String[] args) {
		DirtyPainter painter = new DirtyPainter();
		painter.add(new FirstGraphics());
		painter.showDrawing();
	}
}
