package playground.week4.io.files;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Slf4j
public class OperationsOnFile {

    public void createFile() {
        Path newFilePath = Paths.get("D:\\test\\testFile.txt");

        try {
            Files.createFile(newFilePath);
            log.info("file created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteFile() {
        Path path = Paths.get("D:\\test\\testFile.txt");

        if (Files.exists(path)) {
            try {
                Files.delete(path);
                log.info("file deleted");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void copyFile() {
        Path source = Paths.get("D:\\test\\testFile.txt");
        Path destination = Paths.get("D:\\test\\testFile2.txt");

        if (Files.exists(source) && !Files.exists(destination)) {
            try {
                Files.copy(source, destination, StandardCopyOption.COPY_ATTRIBUTES);
                log.info("file copied");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // can move, change name and replace file
    public void moveFile() {
        Path source = Paths.get("D:\\test\\testFile.txt");
        Path destination = Paths.get("E:\\testFile3.txt");

        try {
            Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
            log.info("file moved");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
