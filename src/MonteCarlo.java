/*
Program:
1. generuje jednowymiarową tablicę o wielkości size
   wypełnioną liczbami losowymi z zakresu od zera do numberOfTrials;
2. wywołuje funkcje wyliczające zadane własności tablicy metodą Monte Carlo;
3. wywołuje funkcje wyliczające dla porównania deterministycznie policzone
   własności tablicy.
*/

public class MonteCarlo {
    public static void main(String[] args) {

        TablicaRND wektorDemo=new TablicaRND(50,365);

        double average;
        int minimum;

        average=FunctionsMC.averageMC(wektorDemo.getTable(), 1_000);
        System.out.println("Srednia wartość elementów tablicy metodą MC = "+ average);

        average=FunctionsDT.averageDT(wektorDemo.getTable());
        System.out.println("Deterministyczna średnia wartość elementów tablicy = "+ average);

        System.out.println();

        minimum= FunctionsMC.minimumMC(wektorDemo.getTable(),20);
        System.out.println("Najmniejszy element tablicy metodą MC = "+minimum);

        minimum=FunctionsDT.minimumDT(wektorDemo.getTable());
        System.out.println("Deterministyczne minimum elementów tablicy = "+ minimum);


    }
}


/*
mymy: dostęp do pojedynczego elementu = wektorDemo.getTable()[4];

*/
