/*
Przygotuj aplikację, która pobiera od użytkownika ścieżkę dowolnego pliku tekstowego,
wczytuje i wyświetla na konsoli jego zawartość. W celu realizacji zadania wykorzystaj
metodę readAllLines klasy Files.
*/

package playground.week4.io.exercises.ex1_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Ex1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("provide path to file: ");
        String path = sc.nextLine();
        readAllLinesUnbuffered(path);
    }

    public static void readAllLinesUnbuffered(String path) {
        Path pathToFile = Paths.get(path);

        try {
            List<String> lines = Files.readAllLines(pathToFile);
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
