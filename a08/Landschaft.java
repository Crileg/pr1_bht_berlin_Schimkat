package pr1.a08;

import java.awt.Color;
import java.awt.Graphics;

import schimkat.berlin.lernhilfe2021ws.graphics.Drawable;

public class Landschaft extends EinfacheLandschaft implements Drawable{

	protected int AnzahlH�gel;
	protected int AnzahlB�ume;
	protected Color FarbeKrone = new Color(31,79,22);
	
	public Landschaft(Color Himmelfarbe, Color Landfarbe, int AnzahlH�gel, int AnzahlB�ume) {
		super(Himmelfarbe, Landfarbe);
		this.AnzahlH�gel = AnzahlH�gel;
		this.AnzahlB�ume = AnzahlB�ume;
	}
	
	public Landschaft(Landschaft Landschaft) {
		this.Himmelfarbe = Landschaft.getHimmelfarbe();
		this.Landfarbe = Landschaft.getLandfarbe();
		this.AnzahlH�gel = Landschaft.getAnzahlH�gel();
		this.AnzahlB�ume = Landschaft.getAnzahlB�ume();
	}
	
	public Landschaft() {
		super(Color.GREEN,Color.BLUE);
		this.AnzahlH�gel = 2;
		this.AnzahlB�ume = 7;
	}
	
	public void Baum(Graphics g) {
		int i = (int) (Math.random()*100)+400;
		int j = (int) (Math.random()*700);
		g.setColor(new Color(139,69,19));
		g.fillRect(j,i,10,50);
		g.setColor(FarbeKrone);
		g.fillOval(j-10,i-5,30,30);
	}

	public void H�gel(Graphics g) {
		g.setColor(new Color(0,150,0));
		int i = (int) (Math.random()*100)+400;
		int j = (int) (Math.random()*700);
		g.fillArc(j,i,100,100,0,180);
	}
	
	public void draw (Graphics g) {
		EinfacheLandschaft einfacheLandschaft = new EinfacheLandschaft();
		einfacheLandschaft.draw(g);
		for (int i = 0; i<AnzahlH�gel; i++) {
			H�gel(g);
		}
		for (int i = 0; i<AnzahlB�ume; i++) {
			Baum(g);
		}
		
	}
	
	public Color getHimmelfarbe() {
		return super.getHimmelfarbe();
	}
	
	public Color getLandfarbe() {
		return super.getLandfarbe();
	}
	
	public int getAnzahlH�gel() {
		return AnzahlH�gel;
	}
	
	public int getAnzahlB�ume() {
		return AnzahlB�ume;
	}
	
	public Color getFarbeKrone() {
		return FarbeKrone;
	}
	
	public void setFarbeKrone(Color Farbekrone) {
		this.FarbeKrone = Farbekrone;
	}
}
