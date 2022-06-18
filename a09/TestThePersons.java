package pr1.a09;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TestThePersons {

	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		testDifferentTypes(out);
		testRechnungen(out);
		out.flush();
	}

	public static void testDifferentTypes(PrintWriter out) {
		List<Person> PersonListe = new ArrayList<Person>();
		PersonListe.add(new Person("Harry", "Potter", 19));
		PersonListe.add(new Person("Ronald", "Weasley", 20));
		PersonListe.add(new Person("Hermione", "Granger", 19));
		List<Student> StudentListe = new ArrayList<Student>();
		StudentListe.add(new Student("Neville", "Longbottom", 19, "Biologie", 95728));
		StudentListe.add(new Student("Luna", "Lovegood", 18, "Mathematik", 62584));
		StudentListe.add(new Student("Ginny", "Weasley", 17, "Sportwissenschaften", 52846));
		List<Handwerker> HandwerkerListe = new ArrayList<Handwerker>();
		ArrayList<Person> Liste = new ArrayList<Person>();
		HandwerkerListe.add(new Handwerker("Severus", "Snape", 38, "Mechatroniker", 19));
		HandwerkerListe.add(new Handwerker("Minerva", "McGonagall", 54, "Maler und Lackierer", 17));
		HandwerkerListe.add(new Handwerker("Gilderoy", "Lockhart", 35, "Maurer", 15));
		for (Person person : PersonListe) {
			Liste.add(person);
		}
		
		for (Person person : StudentListe) {
			Liste.add(person);
		}
		for (Person person : HandwerkerListe) {
			Liste.add(person);
		}
		printAll(Liste, out);
		out.println("--------------------");
		for (Person person : StudentListe) {
			out.println(person);
		}
		out.println("--------------------");
		StudentListe.get(0).StudienfachWechseln("Kräuterkunde");
		StudentListe.get(1).StudienfachWechseln("Arithmantik");
		StudentListe.get(2).StudienfachWechseln("Verteidigung gegen die dunklen Künste");
		for (Person person : StudentListe) {
			out.println(person);
		}
	}

	public static void printAll(List<Person> PersonListe, PrintWriter out) {
		for (Person person : PersonListe) {
			out.println(person);
		}
	}

	public static void testRechnungen(PrintWriter out) {
		Handwerker handwerker1 = new Handwerker("Severus", "Snape", 38, "Mechatroniker", 19);
		handwerker1.rechnung(7);
		Handwerker handwerker2 = new Handwerker("Minerva", "McGonagall", 54, "Maler und Lackierer", 17);
		handwerker2.rechnung(11);
		Handwerker handwerker3 = new Handwerker("Gilderoy", "Lockhart", 35, "Maurer", 15);
		handwerker3.rechnung(17);
	}
}
