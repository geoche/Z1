package com.company;

/**
 *Wypisz na ekranie konsoli liczby od 1 do 20;
 * dla liczby 13 wypisz dodatkowy tekst
 * "To moja szczęśliwa liczba";
 * użyj for i if
 */
public class Z11 {
    public static void main(String[] args) {
    for (int i = 1; i<=20; i++){ // Loop for 20 iterations
        System.out.println(i); // Will print i
        if (i == 13){ // If i equals 13, will write to console value of "i" and "this is my lucky number"/
            System.out.println(i + " this is my lucky number!");
            }
        }
    }
}
