/*
Przygotuj aplikację, która wczytuje i wyświetla zawartość pliku example.txt
*/

package playground.week4.io.exercises.ex1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex1_3 {
    public static void main(String[] args) {
        readAllLinesBuffered();
    }

    public static void readAllLinesBuffered() {
        Path path = Paths.get("D:\\test\\example.txt");

        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
