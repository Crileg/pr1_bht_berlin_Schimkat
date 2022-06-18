package pr1.a05;

import java.io.PrintWriter;
import java.util.Scanner;

import schimkat.berlin.lernhilfe2021ws.io.DirtyFileReader;
import schimkat.berlin.lernhilfe2021ws.objectPlay.AdressList;
import schimkat.berlin.lernhilfe2021ws.objectPlay.Adresse;
import schimkat.berlin.lernhilfe2021ws.objectPlay.Einwohner;
import schimkat.berlin.lernhilfe2021ws.objectPlay.EinwohnerList;
import schimkat.berlin.lernhilfe2021ws.objectPlay.Person;
import schimkat.berlin.lernhilfe2021ws.objectPlay.Factory;

public class AdressPlay {

	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
//		test(out);
		someInhabitants();
	}
	
	public static AdressList createTestAdresses() {
		Adresse A = new Adresse(10403, "Berlin", "Geh-Mal-Weg", 13);
		Adresse B = new Adresse(33605, "Bielefeld", "Hugostraﬂe", 3);
		Adresse C = new Adresse(95131, "Schwarzenbach", "Hauptstraﬂe", 7);
		Adresse D = new Adresse(95336, "Mainleus", "Groﬂe Straﬂe", 567);
		Adresse E = new Adresse(70597, "Stuttgart", "Breite Straﬂe", 87);
		Adresse F = new Adresse(10403, "Berlin", "Kleine Straﬂe", 54);
		Adresse G = new Adresse(95131, "Duisburg", "Andere Straﬂe", 12);
		Adresse H = new Adresse(A, 78);
		Adresse I = new Adresse(B, 56);
		Adresse J = new Adresse(C, 62);
		AdressList List = new AdressList();
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
	
	public static void test(PrintWriter out) {
		for(int i = 0; i<10; i++) {
			out.println(createTestAdresses().get(i));
		}
		out.flush();
	}
	
	public static void someInhabitants() {
		AdressList List = AdressPlay.createTestAdresses();
		
		Scanner Axel = new Scanner("Frank Reich 1987");
		Scanner Moni = new Scanner("Moni Thor 1996");
		Scanner Rainer = new Scanner("Rainer Zufall 1987");
		Scanner Wilma = new Scanner("Wilma Bier 2012");
		Scanner Andi = new Scanner("Andi Macht 1968");
		Scanner Ernst = new Scanner("Ernst Haft 1954");

		Einwohner einwohner1 = new Einwohner(Factory.createPerson(Axel) , List.get(0));
		Einwohner einwohner2 = new Einwohner(Factory.createPerson(Moni) , List.get(1));
		Einwohner einwohner3 = new Einwohner(Factory.createPerson(Rainer) , List.get(2));
		Einwohner einwohner4 = new Einwohner(Factory.createPerson(Wilma) , List.get(3));
		Einwohner einwohner5 = new Einwohner(Factory.createPerson(Andi) , List.get(4));
		Einwohner einwohner6 = new Einwohner(Factory.createPerson(Ernst) , List.get(5));
		
		EinwohnerList einwohnerlist = new EinwohnerList();
		
		einwohnerlist.add(einwohner1);
		einwohnerlist.add(einwohner2);
		einwohnerlist.add(einwohner3);
		einwohnerlist.add(einwohner4);
		einwohnerlist.add(einwohner5);
		einwohnerlist.add(einwohner6);
		
		PrintWriter out = new PrintWriter(System.out);
		for (int i = 0;  i<6; i++) {
			out.println(einwohnerlist.get(i));
		}
		out.println();
		out.println("Umzug:");
		out.println();
		einwohner1.umziehenNach(List.get(6));
		einwohner2.umziehenNach(List.get(7));
		einwohner3.umziehenNach(List.get(8));
		for (int i = 0;  i<6; i++) {
			out.println(einwohnerlist.get(i));
		}
		out.flush();
	}
	
	public static Adresse createAdresse(Scanner in) {
		int PLZ = in.nextInt();
		String Ort = in.next();
		String Straﬂe = in.next();
		int Hausnummer = in.nextInt();
		return new Adresse(PLZ, Ort, Straﬂe, Hausnummer);
	}
	public static AdressList createAdressen(Scanner in) {
		AdressList A = new AdressList();
		while (in.hasNext()) {
			Adresse Adresse = createAdresse(in);
			A.add(Adresse);
		}
		return A;
	}
	
	public static AdressList createAdressen(String filename) {
		Scanner in = new Scanner(new DirtyFileReader(filename));
		return createAdressen(in);
	}
}
