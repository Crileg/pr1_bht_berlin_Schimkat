package pr1.a08;

import java.awt.Color;
import java.awt.Graphics;

import schimkat.berlin.lernhilfe2021ws.graphics.Drawable;

public class EinfacheLandschaft implements Drawable {
	
	protected Color Himmelfarbe;
	protected Color Landfarbe;
	
	public EinfacheLandschaft(Color Himmelfarbe, Color Landfarbe) {
		this.Himmelfarbe = Himmelfarbe;
		this.Landfarbe = Landfarbe;
	}
	
	public EinfacheLandschaft() {
		this.Himmelfarbe = Color.BLUE;
		this.Landfarbe = Color.GREEN;
	}
	
	public EinfacheLandschaft(EinfacheLandschaft EinfacheLandschaft) {
		this.Himmelfarbe = EinfacheLandschaft.getHimmelfarbe();
		this.Landfarbe = EinfacheLandschaft.getLandfarbe();
	}
	
	public void draw (Graphics g) {
		g.setColor(Landfarbe);
		g.fillRect(0, 400, 1000, 1000);
		g.setColor(Himmelfarbe);
		g.fillRect(0, 0, 1000, 400);
		g.setColor(Color.BLACK);
		g.drawLine(0, 400, 1000, 400);
	}

	public Color getHimmelfarbe() {
		return Himmelfarbe;
	}

	public Color getLandfarbe() {
		return Landfarbe;
	}
}
