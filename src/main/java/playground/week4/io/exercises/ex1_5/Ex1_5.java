/*
Przygotuj aplikację, która pobiera od użytkownika ścieżkę dowolnego pliku tekstowego,
wczytuje i wyświetla na konsoli jego zawartość. W celu realizacji zadania wykorzystaj
metodę newBufferedReader klasy Files.
*/

package playground.week4.io.exercises.ex1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ex1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("provide path to file: ");
        String pathToFile = sc.nextLine();
        readAllLinesBuffered(pathToFile);
    }

    public static void readAllLinesBuffered(String path) {
        Path pathToFile = Paths.get(path);

        try (BufferedReader br = Files.newBufferedReader(pathToFile)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
