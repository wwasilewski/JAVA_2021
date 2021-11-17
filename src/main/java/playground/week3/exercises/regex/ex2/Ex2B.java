/*
Przygotuj aplikację pobierającą od użytkownika ciąg znaków i sprawdzającą czy
podany tekst jest poprawnym polskim kodem pocztowym (np. 85-155, 00-122)
*/

package playground.week3.exercises.regex.ex2;

import playground.week3.exercises.RegexValidator;

import java.util.regex.Pattern;

public class Ex2B implements RegexValidator {

    public final Pattern PATTERN = Pattern.compile("^[0-9]{2}-[0-9]{3}$");

    @Override
    public boolean isValid(String string) {
        return PATTERN.matcher(string).matches();
    }
}
