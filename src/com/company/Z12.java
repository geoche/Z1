package com.company;
import java.util.Random; // importing Random Class from utils/java

/**
 * Stwórz tablicę składającą się z 10 elementów typu int; wypełnij ją dowolnymi liczbami;
 * używając pętli i instrukcji warunkowych sprawdź, które liczby są większe od 10 - dla każdego przypadku
 * wypisz na ekranie: Liczba (n) > 10 lub Liczba (n) < 10
 */
public class Z12 {
    public static void main(String[] args) {
        Random random = new Random(); // Creating new object "random" of Random class
        int[] newArray = new int[10]; // Creating new Array "newArray" which consists of 10 values
        for (int i = 0; i<10; i++) { // Loop for 10 iterations
            newArray[i] = random.nextInt(20); // For each iteration filling cell of array with # "i" with random int value from 0 to 20.
            if (newArray[i] > 10){ // Comparing if value of object with index "i" is more than 10, printing "Element "i" < 10"
                System.out.println("Element [" + i + "] = " + newArray[i] + " > 10");
            }
            else if (newArray[i] == 10){ // Comparing if value of object with index "i" is equals 10, printing "Element "i" == 10"
                System.out.println("Element [" + i + "] = " + newArray[i] + " == 10");
            }
            else { // In other cases, when value of object with index "i" is less than 10, printing "Element "i" < 10"
                System.out.println("Element [" + i + "] = " + newArray[i] + " < 10");
            }
        }
    }
}
