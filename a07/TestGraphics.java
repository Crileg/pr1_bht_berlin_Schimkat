package pr1.a07;

import schimkat.berlin.lernhilfe2021ws.graphics.DirtyPainter;
import java.awt.Color;

public class TestGraphics {

	public static void main(String[] args) {
		DirtyPainter painter = new DirtyPainter();
		painter.add(new Gitter(Color.GRAY, 50));
		painter.add(new Muster(Color.RED));
		painter.showDrawing();
	}
}
