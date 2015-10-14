
package ýidd;

import java.util.Arrays;
import java.util.Scanner;

public class Ýidd {

    
    public static void main(String[] args) {
        final int MAX = 100;
        int[] pole = new int[MAX];
        int pocet = 0;
        Scanner vstup = new Scanner(System.in);
        //načítáme hodnoty, dokud není zadaná nula
        System.out.print("Vlož číslo:");
        int cislo = vstup.nextInt();
        while (cislo !=0) {
            pole[pocet++] = cislo;
            System.out.print("vlož číslo: ");
            cislo = vstup.nextInt();
        }
         Arrays.sort(pole,0,pocet);
         if (pocet/2 == 0) {
             // lichý počet prvků
              System.out.println("Medián: "+pole[pocet/2]);
         } else {
             // sudý počet prvků
             // výstupem je průměr dvou středních prvků
             // přetypování na float kvůli desetinému výtupu
             System.out.println("Medián: "+ (float) (pole[pocet/2]+pole[pocet/2-1])/2);
         }
    }  
}
