package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        wyswietlTest("TEST");
        int [] testowaTablica = new int[] {3, 4, 5};
        int wynik = sumowanieTablicy(testowaTablica);
        wyswietlTest(Integer.toString(wynik));
    }
    public static void wyswietlTest(String tekst){
        System.out.println("Tekst: " + tekst);
    }
    public static int sumowanieTablicy(int [] tab){
        int suma = 0;
        for (int i =0; i < tab.length; i++){
            suma = suma + tab[i];
        }
        return suma;
    }
}

