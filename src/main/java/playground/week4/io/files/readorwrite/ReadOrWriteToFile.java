package playground.week4.io.files.readorwrite;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadOrWriteToFile {

    public List<String> readAllLinesUnbuffered() {
        Path file = Paths.get("d:\\test\\myFile.txt");
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public List<String> readAllLinesBuffered() {
        Path file = Paths.get("d:\\test\\myFile22.txt");
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
