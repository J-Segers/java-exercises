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


        List<String> customerNames = capitalizeFirstLetters(curstomerNames);

        System.out.println(customerNames);
    }

    public static List<String> capitalizeFirstLetters(List<String> lijst) {
        String[] choppedFullName;
        String firstName;
        String surnamePrefix;
        String lastName;
        String fullName;
        String finalLastName;

        for (int i = 0; i < lijst.size(); i++) {
            String name = lijst.get(i);

            // Breaks up each list item into different words and puts them into an array.
            choppedFullName = name.split(" ");

            // First name is always element 0.
            firstName = choppedFullName[0];

            // Last name is always the last element of the string.
            lastName = choppedFullName[choppedFullName.length - 1];

            // First name is capitalized
            firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1);

            // This checks if there are any prefixes before the last name.
            surnamePrefix = fillSurnamePrefix(choppedFullName);

            // Capitalizes lastname. If last name has a dash the the next character is also capitalized.
            finalLastName = capitalizeNames(lastName);

            // Adds all parts into one String.
            fullName = firstName + surnamePrefix + finalLastName;

            // Replaces original name String with capitalized String in list
            lijst.set(lijst.indexOf(name), fullName);
        }
        return lijst;
    }

    private static String capitalizeNames(String last) {
        String[] splitName;

        if (checkForDash(last)) {
            splitName = last.split("-");
            String namePart1 = splitName[0];
            String namePart2 = splitName[1];
            namePart1 = Character.toUpperCase(namePart1.charAt(0)) + namePart1.substring(1);
            namePart2 = "-" + Character.toUpperCase(namePart2.charAt(0)) + namePart2.substring(1);
            last = namePart1 + namePart2;
        } else {
            last = Character.toUpperCase(last.charAt(0)) + last.substring(1);
        }
        return last;
    }

    private static String fillSurnamePrefix(String[] choppedFullName) {
        String prefix = " ";

        if (choppedFullName.length > 2) // Checks if a name has more than 3 words
        {
            for (int i = 1; i < (choppedFullName.length - 1); i++) {
                prefix += choppedFullName[i] + " ";
            }
        }
        return prefix;
    }

    private static boolean checkForDash(String name) {
        boolean dash = false;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == '-') {
                dash = true;
                break;
            }
        }
        return dash;
    }
}
