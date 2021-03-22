package nl.novi.opdrachten.methodes;

import java.util.Scanner;

/**
 * Schrijf een methode die een Integer ontvangt.
 * Wanneer het getal deelbaar is door 5, laat hem de volgende tekst returnen:
 * 'deelbaar door vijf'
 * Wanneer het getal niet deelbaar is door vijf:
 * 'ondeelbaar door vijf'
 */
public class DeelbaarDoorVijf {

    public static void main(String[] sammieKijkOmhoog) {
        Scanner userInput = new Scanner(System.in);
        int chosenNumber = userInput.nextInt();

        deelbaar(chosenNumber);
    }

    private static void deelbaar(int chosenNumber) {
        if(chosenNumber % 5 == 0) {
            System.out.println(chosenNumber + " is deelbaar door vijf");
        } else {
            System.out.println(chosenNumber + " is niet deelbaar door vijf");
        }
    }
}
