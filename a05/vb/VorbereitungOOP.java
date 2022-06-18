package pr1.a05.vb;

import java.io.PrintWriter;

import schimkat.berlin.lernhilfe2021ws.objectPlay.AdressList;
import schimkat.berlin.lernhilfe2021ws.objectPlay.Adresse;
import schimkat.berlin.lernhilfe2021ws.objectPlay.Person;
import schimkat.berlin.lernhilfe2021ws.objectPlay.PersonList;

public class VorbereitungOOP {

	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		test(out);
		out.flush();
	}

	public static void test(PrintWriter out) {
		
		Person Mike = new Person("Mike", "Oxlong", 1969);
		Person Anna = new Person("Anna", "Nass", 2001);
		Person Peter = new Person("Peter", "Silie", 1952);
		Person Wanda = new Person("Wanda", "Lismus", 2012);
		Person Mario = new Person("Mario", "Nette", 2021);

		Adresse A = new Adresse(10403, "Berlin", "Geh-Mal-Weg", 20);
		Adresse B = new Adresse(33605, "Bielefeld", "Hugostraﬂe", 45);
		Adresse C = new Adresse(95131, "Schwarzenbach", "Hauptstraﬂe", 5);
		Adresse D = new Adresse(95336, "Mainleus", "Groﬂe Straﬂe", 12);
		Adresse E = new Adresse(70597, "Stuttgart", "Breite Straﬂe", 85);
		
		PersonList Pliste = new PersonList();
		Pliste.add(Mario);
		Pliste.add(Peter);
		Pliste.add(Anna);
		Pliste.add(Mike);
		Pliste.add(Wanda);
		
		AdressList Aliste = new AdressList();
		Aliste.add(A);
		Aliste.add(B);
		Aliste.add(C);
		Aliste.add(D);
		Aliste.add(E);
		
		for(int i = 0; i<5; i++) {
			out.println(Pliste.get(i));
			out.println();
		}
		out.println();
		for(int i = 0; i<5; i++) {
			out.println(Aliste.get(i));
			out.println();
		}
	}
	

}
