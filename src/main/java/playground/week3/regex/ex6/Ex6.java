/*
Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
czy wprowadzony numer seryjny jest poprawny. Numer seryjny składa się z 3 dużych
liter, 5 cyfr, 1 małej litery i 1 dużej litery np. VSD43281fA.
*/

package playground.week3.regex.ex6;

import java.util.regex.Pattern;

public class Ex6 {
    public boolean checkIfSnValid(String string) {
        Pattern pattern = Pattern.compile("^[A-Z]{3}[0-9]{5}[a-z][A-Z]$");
        boolean result = pattern.matcher(string).matches();
        return result;
    }
}
