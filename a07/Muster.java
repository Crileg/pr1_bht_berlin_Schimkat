package pr1.a07;

import schimkat.berlin.lernhilfe2021ws.graphics.Drawable;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Muster implements Drawable{
	
	protected Color color;
	
	public Muster(Color color) {
		this.color = color;
	}

	public void draw (Graphics g) {
		g.setColor(color);
		List<Rectangle> rectangles = new ArrayList<Rectangle>();
		for (int x = 0; x <= 300;x += 50) {
			double b = 10 + 0.0725 * x;
			int breite = (int) b;
			
			double y = 400 - 0.01*(x-100)*(x-100);
			int yKoordinate = (int) y;
			Rectangle Rechteck = new Rectangle(x, yKoordinate, breite, breite);
			rectangles.add (Rechteck);
		}
		for(int i = 0; i <= 6; i ++) {
			g.fillRect(rectangles.get(i).x, rectangles.get(i).y, rectangles.get(i).width, rectangles.get(i).height);
		}
	}	
}


