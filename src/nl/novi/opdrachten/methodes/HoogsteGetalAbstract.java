package nl.novi.opdrachten.methodes;

import java.util.*;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 *
 * Wanneer er twee getallen of meer in zijn:
 * Return het volgende:
 * "Het hoogste getal van de gegeven getallen is: %GETAL%"
 *
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class HoogsteGetalAbstract {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(14);
        numbers.add(17);
        numbers.add(211);
        numbers.add(16);
        numbers.add(21);
        numbers.add(148);
        numbers.add(99);
        numbers.add(6);

        System.out.println(findHighestNumber(numbers));
    }

    private static int findHighestNumber(List<Integer> numbers) {
        int num = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (num < numbers.get(i)){
                num = numbers.get(i);
            }
        }
        return num;
    }
}
