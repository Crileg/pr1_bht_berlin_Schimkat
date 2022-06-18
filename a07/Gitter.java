package pr1.a07;

import java.awt.Graphics;
import java.awt.Color;

import schimkat.berlin.lernhilfe2021ws.graphics.Drawable;

public class Gitter implements Drawable {

	protected Color color;
	protected int dist;
	
	public Gitter(Color color, int dist) {
		this.color = color;
		this.dist = dist;
	}
	
	public Color getColor() {
		return color;
	}
	
	public int getDist() {
		return dist;
	}
	
	public void draw (Graphics g) {
		g.setColor(color);
		final int Untergrenze = -100;
		final int Obergrenze = 1000;
		int i = Untergrenze;
		while (i <= Obergrenze) {
			g.drawLine(Untergrenze,i,Obergrenze,i);
			g.drawLine(i,Untergrenze,i,Obergrenze);
			i += dist;
		}
//		for (int x = Untergrenze; x < Obergrenze; i+=dist) {
//			g.drawLine(Untergrenze,x,Obergrenze,x);
//			g.drawLine(x,Untergrenze,x,Obergrenze);
//		}
//		i = Untergrenze;
//		while (i <= Obergrenze) {
//			g.drawLine(i,Untergrenze,i,Obergrenze);
//			i += dist;
//		}
	}
}










