/*
Klasa posadająca tylko funkcje statyczne do wyliczania w sposób
 deterministyczny zdefiniowanych własności tablicy
*/

public class FunctionsDT {

        public static double averageDT(int[] tablica) {
            int pozycja;
            int suma=0;
            int size=tablica.length;

            for (int i = 0; i < size; i++) {
                suma=suma+tablica[i];
            }
            return (double) suma/size;
        }//_____________________________________________________________________________


    public static int minimumDT(int[] tablica) {

        int minimum=tablica[0];

        for (int i = 1; i < tablica.length; i++) {
            if (minimum > tablica[i]) { minimum=tablica[i];}
        }
        return minimum;
    }//_____________________________________________________________________________




}
