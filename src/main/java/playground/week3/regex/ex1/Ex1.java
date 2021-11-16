/*
Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
czy wprowadzona wartość jest wartością liczbową. Jeśli użytkownik wprowadził
liczbę, sprawdź czy jest parzysta czy nieparzysta. Wyświetl komunikat informujący
użytkownika o wprowadzeniu poprawnej lub błędnej liczby oraz o jej parzystości lub
nieparzystości.
*/

package playground.week3.regex.ex1;

import java.util.regex.Pattern;

public class Ex1 {
    public boolean checkIfNumber(String string) {
        Pattern pattern = Pattern.compile("[0-9]+");
        boolean result = pattern.matcher(string).matches();
        return result;
    }
}
