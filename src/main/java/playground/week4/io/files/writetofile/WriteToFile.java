package playground.week4.io.files.writetofile;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Slf4j
public class WriteToFile {

    public void writeToFileUsingBufferedReader() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\test\\using_BR.txt"))) {
            bw.write("hello world");
            bw.write(System.lineSeparator());
            bw.write("hi world");
            log.info("data using BR written");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFileUsingPrintWriter() {
        try (PrintWriter pw = new PrintWriter(new FileWriter("D:\\test\\using_PW.txt"))) {
            pw.println("test string");
            pw.println("test string2");
            pw.println("test string3");
            log.info("data using PW written");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFileUsingNIO() {
        Path path = Paths.get("D:\\test\\using_NIO.txt");
        String str = "this is my test string";
        byte[] strToBytes = str.getBytes();

        try {
            Files.write(path, strToBytes);
            log.info("data using NIO written");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
