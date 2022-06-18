package pr1.a08;

import java.awt.Color;
import java.awt.Graphics;

import schimkat.berlin.lernhilfe2021ws.graphics.Drawable;

public class Landschaft extends EinfacheLandschaft implements Drawable{

	protected int AnzahlHügel;
	protected int AnzahlBäume;
	protected Color FarbeKrone = new Color(31,79,22);
	
	public Landschaft(Color Himmelfarbe, Color Landfarbe, int AnzahlHügel, int AnzahlBäume) {
		super(Himmelfarbe, Landfarbe);
		this.AnzahlHügel = AnzahlHügel;
		this.AnzahlBäume = AnzahlBäume;
	}
	
	public Landschaft(Landschaft Landschaft) {
		this.Himmelfarbe = Landschaft.getHimmelfarbe();
		this.Landfarbe = Landschaft.getLandfarbe();
		this.AnzahlHügel = Landschaft.getAnzahlHügel();
		this.AnzahlBäume = Landschaft.getAnzahlBäume();
	}
	
	public Landschaft() {
		super(Color.GREEN,Color.BLUE);
		this.AnzahlHügel = 2;
		this.AnzahlBäume = 7;
	}
	
	public void Baum(Graphics g) {
		int i = (int) (Math.random()*100)+400;
		int j = (int) (Math.random()*700);
		g.setColor(new Color(139,69,19));
		g.fillRect(j,i,10,50);
		g.setColor(FarbeKrone);
		g.fillOval(j-10,i-5,30,30);
	}

	public void Hügel(Graphics g) {
		g.setColor(new Color(0,150,0));
		int i = (int) (Math.random()*100)+400;
		int j = (int) (Math.random()*700);
		g.fillArc(j,i,100,100,0,180);
	}
	
	public void draw (Graphics g) {
		EinfacheLandschaft einfacheLandschaft = new EinfacheLandschaft();
		einfacheLandschaft.draw(g);
		for (int i = 0; i<AnzahlHügel; i++) {
			Hügel(g);
		}
		for (int i = 0; i<AnzahlBäume; i++) {
			Baum(g);
		}
		
	}
	
	public Color getHimmelfarbe() {
		return super.getHimmelfarbe();
	}
	
	public Color getLandfarbe() {
		return super.getLandfarbe();
	}
	
	public int getAnzahlHügel() {
		return AnzahlHügel;
	}
	
	public int getAnzahlBäume() {
		return AnzahlBäume;
	}
	
	public Color getFarbeKrone() {
		return FarbeKrone;
	}
	
	public void setFarbeKrone(Color Farbekrone) {
		this.FarbeKrone = Farbekrone;
	}
}
