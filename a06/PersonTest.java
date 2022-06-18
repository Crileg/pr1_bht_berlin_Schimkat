package pr1.a06;

import java.io.PrintWriter;
import java.util.ArrayList;

import schimkat.berlin.lernhilfe2021ws.io.DirtyFileWriter;

public class PersonTest {
	
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		test(out);
		printFactoryPersons(out);
	}
	
	public static void printPersons(PrintWriter out, ArrayList<Person> persons){
		for(int i = 0; i<persons.size() ;i++) {
			out.println(persons.get(i));
		}
		out.flush();
	}
	
	public static void test(PrintWriter out) {
		PrintWriter fout = new PrintWriter(new DirtyFileWriter("data/factory_persons.txt"));
		Person A = new Person("Ted", "Mosby", 2003);
		Person B = new Person("Marshall", "Erikson", 1998);
		Person C = new Person("Barney", "Stinson", 2012);
		Person D = new Person("Lilly", "Aldren", 1969);
		Person E = new Person("Robin", "Scherbatsky", 1965);
		Person F = new Person("Tracy", "Mosby", 1945);
		Person G = new Person("Harry", "Potter", 1987);
		out.println(A);
		out.println(B);
		out.println(C);	
		out.println(D.toString());
		out.println(E.toString());
		out.println(F.toString());
		out.println(G.toString());
		out.flush();
		ArrayList<Person> List = new ArrayList<Person>();
		List.add(A);
		List.add(B);
		List.add(C);
		List.add(D);
		List.add(E);
		List.add(F);
		List.add(G);
		printPersons(out, List);
		printPersons(fout, List);
	}
	
	public static void printFactoryPersons(PrintWriter out) {
		printPersons(out, PersonFactory.createTestPersons());
	}
}
