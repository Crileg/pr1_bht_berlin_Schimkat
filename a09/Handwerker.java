package pr1.a09;

public class Handwerker extends Person {

	protected String Gewerk;
	protected double Stundenlohn;

	public Handwerker(String Vorname, String Nachname, int Geburtsjahr, String gewerk, double stundenlohn) {
		super(Vorname, Nachname, Geburtsjahr);
		this.Gewerk = gewerk;
		this.Stundenlohn = stundenlohn;
	}

	public Handwerker(Person person, String gewerk, double stundenlohn) {
		super(person.getVorname(), person.getNachname(), person.getGeburtsjahr());
		this.Gewerk = gewerk;
		this.Stundenlohn = stundenlohn;
	}

	public String getGewerk() {
		return Gewerk;
	}

	public double getStundenlohn() {
		return Stundenlohn;
	}

	public String toString() {
		return (Vorname + " " + Nachname + " " + Gewerk + " " + Stundenlohn);
	}

	public String toStringreadeble() {
		return (Vorname + " " + Nachname + ", " + Gewerk + ", " + Stundenlohn + " €/h");
	}

	public double rechnung(double arbeitszeit) {
		return (72 + arbeitszeit * Stundenlohn);
	}
}
