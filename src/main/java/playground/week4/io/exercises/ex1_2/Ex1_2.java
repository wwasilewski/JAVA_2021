/*
Przygotuj aplikację, która pobiera od użytkownika ścieżkę do pliku i zapisuje w nim
tekst “<== Hello world ==>”
*/

package playground.week4.io.exercises.ex1_2;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@Slf4j
public class Ex1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("provide path to file: ");
        String pathToFile = sc.nextLine();
        writeToFileWithPathUsingBW(pathToFile);
    }

    public static void writeToFileWithPathUsingBW(String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write("<== Hello world ==>");
            log.info("data written");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
