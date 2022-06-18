package pr1.a08;

import java.awt.Color;
import java.awt.Graphics;

import schimkat.berlin.lernhilfe2021ws.graphics.Drawable;

public class WinterLandschaft extends Landschaft implements Drawable{
	
	final static int AnzahlSchneeflocken = 5000;
	
	public WinterLandschaft(Color Himmelfarbe, Color Landfarbe, int AnzahlHügel, int AnzahlBäume) {
		super(Himmelfarbe, Landfarbe, AnzahlHügel, AnzahlBäume);
	}
	
	public WinterLandschaft() {
		
	}
	
	public void draw (Graphics g) {
		Landschaft Landschaft = new Landschaft(Color.BLUE, Color.GREEN, 5, 120);
		Landschaft.draw(g);
		Schneemann(g);
		Schnee(g);
	}
	
	public void Schneemann(Graphics g) {
		g.setColor(new Color(255,255,255));
		g.fillOval(100,500,15,15);
		g.fillOval(100,488,15,15);
		g.fillOval(100,476,15,15);
	}
	
	public void Schnee(Graphics g) {
		g.setColor(new Color(255,255,255));
		for(int i = 0; i < AnzahlSchneeflocken; i++) {
			int x = (int) (Math.random()*800);
			int y = (int) (Math.random()*800);
			g.fillOval(x,y,5,5);
		}
	}
}