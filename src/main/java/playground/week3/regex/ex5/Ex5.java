/*
Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzjącą
czy wprowadzona data jest poprawna. Za poprawną datę uważamy zapis w postaci
"10.02.2018r.". Na potrzeby zadania nie weryfikujemy wartości dnia miesiąca. 45 to
też poprawna wartość.
*/

package playground.week3.regex.ex5;

import java.util.regex.Pattern;

public class Ex5 {
    public boolean checkIfDateValid(String string) {
        Pattern pattern = Pattern.compile("^[\\d]{1,2}.[\\d]{2}.[\\d]+r.$");
        boolean result = pattern.matcher(string).matches();
        return result;
    }
}
