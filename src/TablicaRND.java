/*

Klasa TablicaRND generuje jednowymiarową tablicę o zadanym rozmiarze="size"
 wypełnioną całkowitymi liczbami losowymi z przedziału od 0 do "range".
Domyślnymi wartościami są: size=100 i range=100.
Klasa oferuje jedynie dostęp do wygenerwanej tablicy przez metodę "getTable()"
*/

import java.util.Random;

public class TablicaRND {

    private int size=100;
    private int range=100;
    private int[] tablicaRand;

    public TablicaRND(){
        tablicaRand=new int[size];
        fillTablicaRand();
    }

    public TablicaRND(int size, int range){
        this.size=size;
        this.range=range;
        tablicaRand=new int[size];
        fillTablicaRand();
    }

    private void  fillTablicaRand () {
        Random generator=new Random();
        for (int i=0; i< size; i++){
            tablicaRand[i]=generator.nextInt(range);
        }
    }

    public int[] getTable(){
        return tablicaRand;
}

}
