package nl.novi.opdrachten.methodes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 *
 * Check in de methode of deze list 3 entries heeft.
 *
 * Wanneer dit niet zo is: return de foutmelding: "Er zijn te veel of te weinig getallen in de lijst."
 * BONUS: Kun je een foutmelding voor te veel en een foutmelding voor te weinig maken?
 *
 * Wanneer er wel drie getallen in zijn:
 * Return het volgende:
 * Een list met getallen gesorteerd van laag naar hoog.
 *
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class SorteerLijst {

    public static void main(String[] argeblabla) {

        List<Integer> wrongList = new ArrayList<>(Arrays.asList(1, 2, 4, 3, 5, 6, 7, 8));
        List<Integer> correctList = new ArrayList<>(Arrays.asList(87, 88, 909909));
        List<Integer> checkList = new ArrayList<>(Arrays.asList(7, 5, 9, 1, 8, 6, 3, 2, 4, 0));
        List<Integer> finalList;

        if (checkForListLength(checkList)) {
            finalList = sortList(checkList);
            printlist(finalList);
        }
    }

    private static boolean checkForListLength(List<Integer> lijst) {
        if (lijst.size() > 10) {
            System.out.println("Er zijn teveel getallen in de lijst!");
            return false;
        } else if (lijst.size() < 10) {
            System.out.println("Er zijn te weinig getallen in de lijst!");
            return false;
        } else {
            return true;
        }
    }

    private static void printlist(List<Integer> lijst) {
        for (int i = 0; i < lijst.size(); i++) {
            System.out.println(lijst.get(i));
        }
    }

    private static List<Integer> sortList(List<Integer> lijst) {
        int swap;
        boolean check = true;

        while(check){
            check = false;
            for (int i = 0; i < lijst.size(); i++) {
                if (i == lijst.size() -1) {
                    break;
                } else if (lijst.get(i) > lijst.get(i+1)) {
                    swap = lijst.get(i);
                    lijst.set(i, lijst.get(i+1));
                    lijst.set(i+1, swap);
                    check = true;
                }
            }
        }
        return lijst;
    }
}

