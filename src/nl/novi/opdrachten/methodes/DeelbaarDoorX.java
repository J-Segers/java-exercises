package nl.novi.opdrachten.methodes;

import java.util.Scanner;

/**
 * Schrijf een methode die twee Integers ontvangt.
 * De eerste parameter heet 'number', de tweede 'divisible'
 *
 * Het is de bedoeling dat je checkt of 'number' deelbaar is door 'divisible'
 *
 * Wanneer het deelbaar is, return het volgende:
 * Het getal: %HIER GETAL% is deelbaar door %HIER DIVISIBLE%.
 * Wanneer het niet deelbaar is:
 * Het getal: %HIER GETAL% is niet deelbaar door %HIER DIVISIBLE%. Verlaag of verhoog het getal
 * %HET GETAL WAARMEE HET VERHOOGT OF VERLAAGD MOET WORDEN%
 *
 * VOORBEELD:
 *
 * De methode ontvangt de getallen 13 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 13 is niet deelbaar door 3. Verlaag het getal met 1.
 *
 * VOORBEELD 2:
 * De methode ontvangt de getallen 14 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 14 is niet deelbaar door 3. Verhoog het getal met 1.
 *
 */

public class DeelbaarDoorX {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int number;
        int divisible;

        System.out.println("kies je deelgetal:");
        number = userInput.nextInt();

        System.out.println("kies je deler:");
        divisible = userInput.nextInt();

        System.out.println(checkDivisible(number, divisible));
    }

    private static String checkDivisible(int number, int divisible) {
        int remainder = number % divisible;
        double halvedDivisible = (double)divisible / 2;

        System.out.println("remainder is " + remainder);

        if (remainder != 0) {
            if(remainder > halvedDivisible){
                return ("Het getal: " + number + " is niet deelbaar door " + divisible + "\nVerhoog het getal met " + (remainder - 1));
            }else if (remainder < halvedDivisible){
                return ("Het getal: " + number + " is niet deelbaar door " + divisible + "\nVerlaag het getal met " + remainder);
            } else {
                return ("Het getal: " + number + " is niet deelbaar door " + divisible + "\nVerhoog of verlaag het getal met " + remainder);
            }
        }else {
            return ("Het getal: " + number + " is deelbaar door " + divisible);
        }
    }
}
