package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Stworzyć program wykonujący operacje na tablicach. W pierwszym kroku należy stworzyć tablicę 50 elementów
 * i wypełnić ją elementami losowymi typu int- tutaj prosty opis użycia klasy Random.
 * Jeżeli wypełnianie wartościami losowymi jest zbyt trudne,
 * zainicjuj tablicę wartościami pseudolosowymi (wprowadź je samodzielnie).
 * W kolejnym kroku należy:
 * a) wydrukować tablicę,
 * b) wydrukować posortowaną tablicę,
 * c) wypisać ile razy występuje określona wartość,
 * d) wypisać ile wynosi suma wszystkich elementów,
 * e) stworzyć kopię tablicy na dwa sposoby: prawidłowy i nieprawidłowy
 *    oraz wykazać w kodzie jaki jest skutek nieprawidłowego kopiowania
 */

public class Z13 {

    public static void main(String[] args) {
        Random random = new Random(); // Creating object "random" of Random Class
        int[] newArray = new int[50]; // Creating new Array "newArray" with 50 elements.

        System.out.println("Unsorted elements:"); // Writing to console first volume "Unsorted elements":
        for (int i = 0; i < newArray.length; i++){ // Loop for filling array with values, from element 0 to element, that equals the last index in array
            newArray[i] = random.nextInt(1000); // Filling each element with random values of int type up to 1000;
            System.out.println("Element [" +i+ "]: " + newArray[i]); // Writing to console this element's value
        }

        System.out.println();
        System.out.println("Sorted elements:"); // Writing to console second volume "Sorted elements":
        int temp;
        int count = 0;
        int sum = 0;
        //Array sorting from min to max
        for (int i = 0; i < newArray.length; i++){ // Searching in array from index 0 to the last element in array
            for (int n = 0; n < newArray.length; n++){ // Searching for every element from 0 to the last element in array
                if (newArray[i] < newArray[n]){ // Comparing element i with every next element from 0 to the last element in array.
                                                // If element i < element n, that
                    temp = newArray[i];         // Variable "temp" is used to keep temporary element i, which is max
                    newArray[i] = newArray[n];  // Changing i to n, because now n is max
                    newArray[n] = temp;         // n is min now
                }

            }
        }
        //Sorted array
        for (int i = 0; i < newArray.length; i++){
            sum+=newArray[i];
            System.out.println("Element [" +i+ "]: " + newArray[i]);
            //Sum of elements
            if (i == newArray.length-1){
                System.out.println("Sum of elements is: " + sum);
            }
        }

        //Exact value
        Scanner scanner = new Scanner(System.in); // New object of Scanner class to get input from console
        System.out.println("Enter your value:"); // Message
        int scn = scanner.nextInt(); // Converting inputed value to int type
        for (int i1 : newArray) { // Searching in array from index 0 to the last element in array
            if (i1 == scn)
                count++; // If element equals entered value, counter "count" increasing
        }
        if (count == 1){
            System.out.println("Your value is " + scn + " and it appears in this array " + count + " time");
        }
        else{
            System.out.println("Your value is " + scn + " and it appears in this array " + count + " times");
        }
        //Wrong way to copy array
        int[] wrongArray; // This array don't even have to be initialized with exact amount of elements because
        wrongArray = newArray; //here it will copy only link of newArray to each element
        int x = 0;
        while (x<50){ // loop for each element of wrongArray
            System.out.println(wrongArray); // Writing to console proof, that wrongArray consists only of link(s) to newArray
            x++;
        }

        //Right copy way to copy array
        int[] rightArray = new int[newArray.length]; // Declaring new array that will consist of the same amount of elements as newArray
        for (int i = 0; i < newArray.length; i++){
            rightArray[i] = newArray[i]; // Copying each element from newArray to rightArray according to exact index of element
            System.out.println("Element [" +i+ "] in new array: " + rightArray[i]); // Writing full Array "rightArray" to console
        }


    }
}
