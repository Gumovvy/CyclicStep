package com.gmv.cyclicstep;

import java.util.Scanner;

public class allRequiredFunction {
    private int timeToBeat;

    public static float lengthOfStep(float dlugosc) {

        return dlugosc;
    }

    public static float readLengthOfStep() {
        Scanner dlugoscKroku = new Scanner(System.in);
        System.out.println("Podaj dlugosc kroku w metrach: ");
        return dlugoscKroku.nextFloat();
    }

    public int distanceOfRunning(int dystans) {
        //Scanner dystansDoPrzebiegniecia = new Scanner(System.in);
        //System.out.println("Podaj dystans w metrach: ");
        //int dystans = dystansDoPrzebiegniecia.nextInt();
        //int dystans=100;
        return dystans;
    }

    public int czytajDystans() {
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
            System.out.println("Czas sekund nie moze byc w�kszy niz 59");
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
        System.out.println("Musisz zrobic " + dystans / krok + " krok�w.");
        return dystans / krok;
    }

    public float obliczenieKrokowNaSekunde(float czasDoPokonania, float kroki) {
        double krokiPrzezCzas = kroki / czasDoPokonania;
        // double krokiNaSekunde =krokiPrzezCzas/100;
        // System.out.println("Na ka�da sekunde musisz zrobic " + krokiPrzezCzas
        // + " krok�w. Czyli co: " + Math.round(krokiNaSekunde*10000) +
        // " setnych musisz zrobic krok" );
        return kroki / czasDoPokonania;

    }

    public double iloscKrokowNaSekunde(double czasDoPokonania, float kroki) {
        double krokiPrzezCzas = kroki / czasDoPokonania;
        double krokiNaSekunde = 1000 / krokiPrzezCzas;
        System.out.println("Na ka�da sekunde musisz zrobic " + krokiPrzezCzas + " krok�w. Czyli co: " + krokiNaSekunde + " setnych musisz zrobic krok");
        return krokiNaSekunde;
    }


    public void funkcjaGlowna() throws InterruptedException {
        float dlugoscKroku = lengthOfStep();
        int dystansDoPokonania = distanceOfRunning(czytajDystans());
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
