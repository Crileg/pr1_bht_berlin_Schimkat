package pr1.a09;

public class Student extends Person {

	protected String studienfach;
	protected int matrikelNr;

	public Student(String Vorname, String Nachname, int Geburtsjahr, String studienfach, int matrikelNr) {
		super(Vorname, Nachname, Geburtsjahr);
		this.matrikelNr = matrikelNr;
		this.studienfach = studienfach;
	}

	public Student(Person person, String studienfach, int matrikelNr) {
		super(person.getVorname(), person.getNachname(), person.getGeburtsjahr());
		this.matrikelNr = matrikelNr;
		this.studienfach = studienfach;
	}

	public String getStudienfach() {
		return studienfach;
	}

	public int getMatrikelNr() {
		return matrikelNr;
	}

	public void StudienfachWechseln(String neuesFach) {
		this.studienfach = neuesFach;
	}

	public String toString() {
		return (Vorname + " " + Nachname + " " + studienfach + " " + matrikelNr);
	}

	public String toStringreadeble() {
		return (Vorname + " " + Nachname + ", " + studienfach + ", " + matrikelNr);
	}
}
