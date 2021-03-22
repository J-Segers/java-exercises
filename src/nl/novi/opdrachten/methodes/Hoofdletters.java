package nl.novi.opdrachten.methodes;

import java.util.ArrayList;
import java.util.List;

/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 *
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 *
 *
 */

public class Hoofdletters {

    public static void main(String[] args) {
        List<String> curstomerNames = new ArrayList<>();

        curstomerNames.add("nick piraat");
        curstomerNames.add("michael jackson");
        curstomerNames.add("glennis grace");
        curstomerNames.add("dreetje hazes");
        curstomerNames.add("robbie williams");
        curstomerNames.add("michiel de ruyter");
        curstomerNames.add("sjaak polak");
        curstomerNames.add("jan van jansen");
        curstomerNames.add("henk den hartog");
        curstomerNames.add("mo el-mecky");
        curstomerNames.add("fredje kadetje");


        List<String> customerNames = capitalizeFirstLetter(curstomerNames);

        System.out.println(customerNames);
    }

    public static List<String> capitalizeFirstLetter(List<String> lijst) {
        for (int counter = 0; counter < lijst.size(); counter++) {
            String name = lijst.get(counter);
            String[] choppedFullName = name.split(" ");
            String[] splitName;
            boolean checkForDash = false;
            String firstName;
            String surnamePrefix = " ";
            String lastName;
            String fullName;


            firstName = choppedFullName[0];
            lastName = choppedFullName[choppedFullName.length - 1];

            if (choppedFullName.length > 2) // Checks if a name has more than 3 words
            {
                for (int i = 1; i < (choppedFullName.length - 1) ; i++) {
                    surnamePrefix += choppedFullName[i] + " ";
                }
            }

            for (int i = 0; i < lastName.length(); i++) {
                if (lastName.charAt(i) == '-') {
                    checkForDash = true;
                    break;
                }
            }

            firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1);
            if (checkForDash) {
                splitName = lastName.split("-");
                String namePart1 = splitName[0];
                String namePart2 = splitName[1];
                namePart1 = Character.toUpperCase(namePart1.charAt(0)) + namePart1.substring(1);
                namePart2 = "-" + Character.toUpperCase(namePart2.charAt(0)) + namePart2.substring(1);
                lastName = namePart1 + namePart2;

            } else {
                lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1);
            }
            fullName = firstName + surnamePrefix + lastName;
            lijst.set(lijst.indexOf(name), fullName);
        }

        return lijst;
    }
}
