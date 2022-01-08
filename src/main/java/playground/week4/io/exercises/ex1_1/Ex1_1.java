/*
Przygotuj aplikację, która zapisuje do pliku example.txt tekst “Hello world”.
*/

package playground.week4.io.exercises.ex1_1;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Slf4j
public class Ex1_1 {
    public static void main(String[] args) {
        writeToFileUsingBW();
    }

    public static void writeToFileUsingBW() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\test\\example.txt"))) {
            bw.write("Hello world");
            log.info("writing \"Hello world\" into example.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
