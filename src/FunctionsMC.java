/*
Klasa FunctionsMC zawiera wyłącznie funkcje statyczne wyliczające metodą
 MonteCarlo wybrane charakterystyki wskazanej tablicy. Parametrami
 funkcji są:
    1.tablica(int[]) oraz
    2.liczba prób dla metody MonteCarlo.
*/

import java.util.Random;

public class FunctionsMC {

        public static double averageMC(int[] tablica, int numberOfTrials) {
        int suma=0;
        int size=tablica.length;

        Random generator=new Random();

        for (int i = 1; i < numberOfTrials; i++) {
            int pozycja=generator.nextInt(size);
            suma=suma+tablica[pozycja];
        }
        //System.out.println(suma);
        return (double) suma/numberOfTrials;
    }//_____________________________________________________________________________


    public static int minimumMC(int[] tablica, int numberOfTrials) {

        Random generator=new Random();

        int size=tablica.length;
        int pozycja=generator.nextInt(size);
        int minimum=tablica[pozycja];

        for (int i = 1; i < numberOfTrials; i++) {
            pozycja=generator.nextInt(size);
            int wartosc= tablica[pozycja];
            if (minimum > wartosc) { minimum=wartosc;}
        }
        //System.out.println(minimum);
        return minimum;
    }//_____________________________________________________________________________

}
