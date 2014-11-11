package com.gmv.cyclicstep;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Algorytm {
	private int timeToBeat;

	public static float dlugoscKroku() {
		Scanner dlugoscKroku = new Scanner(System.in);
		System.out.println("Podaj dlugosc kroku w metrach: ");
		float dlugosc = dlugoscKroku.nextFloat();
		return dlugosc;
	}

	public int dystansBiegu() {
		Scanner dystansDoPrzebiegniecia = new Scanner(System.in);
		System.out.println("Podaj dystans w metrach: ");
		int dystans = dystansDoPrzebiegniecia.nextInt();
		return dystans;
	}

	public float czasDoPokonania() {
		Scanner czasDoPokonania = new Scanner(System.in);
		System.out.println("Podaj minuty: ");
		int czasMinuty = czasDoPokonania.nextInt();
		System.out.println("Podaj sekundy: ");
		int czasSekundy = czasDoPokonania.nextInt();
		while (czasSekundy > 59) {
			System.out.println("Czas sekund nie moze byc wêkszy niz 59");
			czasSekundy = czasDoPokonania.nextInt();
		}
		float czasKoncowy = (czasMinuty * 60) + czasSekundy;

		System.out.println("Czyli chcesz pobic czas: " + czasMinuty + ":" + czasSekundy);
		System.out.println("Czas koncowy w sekundach: " + czasKoncowy);
		return czasKoncowy;
	}

	public float getTimeToBeat() {

		return this.timeToBeat;
	}

	public float obliczenieKrokow(int dystans, float krok) {
		System.out.println("Musisz zrobic " + dystans / krok + " kroków.");
		return dystans / krok;
	}

	public float obliczenieKrokowNaSekunde(float czasDoPokonania, float kroki) {
		double krokiPrzezCzas = kroki / czasDoPokonania;
		// double krokiNaSekunde =krokiPrzezCzas/100;
		// System.out.println("Na ka¿da sekunde musisz zrobic " + krokiPrzezCzas
		// + " kroków. Czyli co: " + Math.round(krokiNaSekunde*10000) +
		// " setnych musisz zrobic krok" );
		return kroki / czasDoPokonania;

	}

	public double iloscKrokowNaSekunde(double czasDoPokonania, float kroki) {
		double krokiPrzezCzas = kroki / czasDoPokonania;
		double krokiNaSekunde = 1000 / krokiPrzezCzas;
		System.out.println("Na ka¿da sekunde musisz zrobic " + krokiPrzezCzas + " kroków. Czyli co: " + krokiNaSekunde + " setnych musisz zrobic krok");
		return krokiNaSekunde;
	}



	public void funkcjaGlowna() throws InterruptedException {
		float dlugoscKroku = dlugoscKroku();
		int dystansDoPokonania = dystansBiegu();
		double czasDoPokonania = czasDoPokonania();
		float kroki = obliczenieKrokow(dystansDoPokonania, dlugoscKroku);
		long krokNaSekunde = (long) iloscKrokowNaSekunde(czasDoPokonania, kroki);
		long czas1 = System.currentTimeMillis();
		for (int i = 0; i < kroki; i++) {

			Thread.sleep((int) krokNaSekunde);
			// probaOtwarcia(String.valueOf(i + "\n"));
			System.out.println("krok");
			// System.out.println(i);

		}
		long czas2 = System.currentTimeMillis();

		long czasDokladny = (czas2 - czas1);

		System.out.println("Czas to " + czasDokladny);

	}

}
