/*
Przygotuj aplikację pobierającą od użytkownika dowolny ciąg znaków i sprawdzającą
czy wprowadzona wartość jest wartością liczbową. Jeśli użytkownik wprowadził
liczbę, sprawdź czy jest parzysta czy nieparzysta. Wyświetl komunikat informujący
użytkownika o wprowadzeniu poprawnej lub błędnej liczby oraz o jej parzystości lub
nieparzystości.
*/

package playground.week3.regex.ex1;

import playground.week3.regex.RegexValidator;

import java.util.regex.Pattern;

public class Ex1B implements RegexValidator {

    public static final Pattern PATTERN = Pattern.compile("^[0-9]+$");

    @Override
    public boolean isValid(String string) {
        return PATTERN.matcher(string).matches();
    }

    public boolean isEven(String string) {
        return Integer.parseInt(string) % 2 == 0;
    }

    public boolean isOdd(String string) {
        return Integer.parseInt(string) % 2 != 0;
    }
}
