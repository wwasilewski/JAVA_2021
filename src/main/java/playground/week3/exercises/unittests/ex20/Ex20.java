/*
Przygotuj aplikację pobierającą od użytkownika imię i sprawdzającą ile samogłosek i
ile spółgłosek jest podanym imieniu. Przygotuj klasę z 2 metodami sprawdzającymi
ilość samogłosek i ilość spółgłosek. Przygotuj testy jednostkowe weryfikujące
działanie dwóch metod.
*/

package playground.week3.exercises.unittests.ex20;

public class Ex20 {

    public int countVowels(String name) {
        int vowels = 0;

        for (int i = 0; i < name.length(); i++) {
            char c = name.toLowerCase().charAt(i);
            if (c == 'a' || c == 'ą' || c == 'e' || c == 'ę' || c == 'i' || c == 'o'
                    || c == 'ó' || c == 'u' || c == 'y') {
                vowels++;
            }
        }
        return vowels;
    }

    public int countConsonants(String name) {
        int consonants = 0;

        for (int i = 0; i < name.length(); i++) {
            char c = name.toLowerCase().charAt(i);
            if (c == 'q' || c == 'w' || c == 'r' || c == 't' || c == 'p' || c == 's' || c == 'd'
                    || c == 'f' || c == 'g' || c == 'h' || c == 'j' || c == 'k' || c == 'l'
                    || c == 'z' || c == 'x' || c == 'c' || c == 'v' || c == 'b' || c == 'n'
                    || c == 'm' || c == 'ł' || c == 'ć' || c == 'ż' || c == 'ź' || c == 'ń'
                    || c == 'ś') {
                consonants++;
            }
        }
        return consonants;
    }

    public void printResults(String name) {
        System.out.println("vowels: " + countVowels(name));
        System.out.println("consonants: " + countConsonants(name));
    }
}
