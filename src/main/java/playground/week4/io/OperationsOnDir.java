package playground.week4.io;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

@Slf4j
public class OperationsOnDir {

    // creates only one dir
    public void createDirectory() {
        Path path = Paths.get("D:\\files");

        if (!Files.exists(path)) {
            try {
                Files.createDirectory(path);
                log.info("dir created");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // creates only one dir
    public void createDirectory2() {
        File file = new File("D:\\files2");

        if (!file.exists()) {
            file.mkdir();
            log.info("dir created");
        }
    }

    // can create dir in dir - more flexible option
    public void createDirectories() {
        File file = new File("D:\\files3\\test2\\test3");

        if (!file.exists()) {
            file.mkdirs();
            log.info("dirs created");
        }
    }

    public void deleteDirectory() {
        Path path = Paths.get("D:\\files3\\test2\\test3");

        try {
            Files.walk(path)
                    .sorted(Comparator.reverseOrder())
                    .map(Path::toFile)
                    .forEach(File::delete);
            log.info("dir deleted");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
