/*
Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
czy wprowadzona wartość zawiera słowo "ala".
*/

package playground.week3.exercises.regex.ex4;

import java.util.regex.Pattern;

public class Ex4 {
    public boolean checkIfAla(String string) {
        Pattern pattern = Pattern.compile("^.*ala.*$");
        boolean result = pattern.matcher(string).matches();
        return result;
    }
}
