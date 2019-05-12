package com.sda.algorytmy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int[] a = {4, 1, 6,4,3,1, 1, 1};
        int wynik = 0;

        for (int i = 1; i < a.length; i++) {

            if (a[i] == 1){
                wynik = wynik+1;
            }

        }
        System.out.println(wynik);


    }
}
