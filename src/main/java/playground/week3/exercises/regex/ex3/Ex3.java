/*
Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
czy wprowadzona wartość jest poprawnym loginem użytkownika. Za poprawny login
uważamy tekst zawierający małe i duże litery oraz cyfry. Jego minimalna długość to 8
a maksymalna 16 znaków.
*/

package playground.week3.exercises.regex.ex3;

import java.util.regex.Pattern;

public class Ex3 {
    public boolean checkIfProperLogin(String string) {
        Pattern pattern = Pattern.compile("^[\\w]{8,16}$");
        boolean result = pattern.matcher(string).matches();
        return result;
    }
}
