/*
Przygotuj aplikację pobierającą od użytkownika ciąg znaków i sprawdzającą czy
podany tekst jest poprawnym polskim kodem pocztowym (np. 85-155, 00-122)
*/

package playground.week3.exercises.regex.ex2;

import java.util.regex.Pattern;

public class Ex2 {
    public boolean checkIfZipCode(String string) {
        Pattern pattern = Pattern.compile("^[0-9]{2}-[0-9]{3}$");
        boolean result = pattern.matcher(string).matches();
        return result;
    }
}
