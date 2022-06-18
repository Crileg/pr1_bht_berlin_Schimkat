package pr1.a09;

public class Person {

	protected String Vorname;
	protected String Nachname;
	protected int Geburtsjahr;

	public Person(String Vorname, String Nachname, int Geburtsjahr) {
		this.Vorname = Vorname;
		this.Nachname = Nachname;
		this.Geburtsjahr = Geburtsjahr;
	}

	public String getVorname() {
		return Vorname;
	}

	public String getNachname() {
		return Nachname;
	}

	public int getGeburtsjahr() {
		return Geburtsjahr;
	}

	public String toString() {
		return (Vorname + " " + Nachname + " " + Geburtsjahr);
	}
}
