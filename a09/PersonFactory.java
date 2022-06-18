package pr1.a09;

import java.util.ArrayList;
import java.util.Locale;

public class PersonFactory {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	}

	public static ArrayList<Person> createTestPersons() {
		Person A = new Person("Jim", "Panse", 2003);
		Person B = new Person("Frank", "Reich", 1998);
		Person C = new Person("Moni", "Thor", 2012);
		Person D = new Person("Rainer", "Zufall", 1969);
		Person E = new Person("Wilma", "Bier", 1965);
		Person F = new Person("Andi", "Macht", 1945);
		Person G = new Person("Ernst", "Haft", 1987);
		Person H = new Person("Mike", "Oxlong", 1934);
		Person I = new Person("Mara", "Kuja", 2002);
		Person J = new Person("Anna", "Lyse", 1991);
		ArrayList<Person> List = new ArrayList<Person>();
		List.add(A);
		List.add(B);
		List.add(C);
		List.add(D);
		List.add(E);
		List.add(F);
		List.add(G);
		List.add(H);
		List.add(I);
		List.add(J);
		return List;
	}
}
