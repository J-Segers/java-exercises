package nl.novi.opdrachten.whilelussen;

/**
 * Bekijk onderstaande while-lus.
 * Zorg ervoor dat de while-lus stopt op regel 22.
 */

public class StopTwentyTwo {
    public static void main(String[] tt) {
        int teller = 1;
        while(teller < 100) { // Deze regel mag niet aangepast worden.
            if(teller == 22) {
                System.out.println("Getal: " + teller);
                break;
            }

            System.out.println("Getal: " + teller);
            teller = teller + 1;
        }
    }
}
