package pr1.a07.test;

import schimkat.berlin.lernhilfe2021ws.graphics.Drawable;

import java.awt.Graphics;

import java.awt.Color;

public class FirstGraphics implements Drawable {
	public void draw (Graphics g) {
		 g.setColor(Color.YELLOW);
		 g.fillRect(100, 100, 100, 100);
		 g.setColor(Color.BLUE);
		 g.fillRect(125, 125, 50, 50);
		 g.setColor(Color.RED);
		 g.drawOval(40, 40, 150, 150);
	}
}


