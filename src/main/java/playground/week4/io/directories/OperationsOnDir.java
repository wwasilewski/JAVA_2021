package playground.week4.io.directories;

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

    // can create dir and subdirs - more flexible option
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

    public void getDirectorySize() {
        File file = new File("D:");

        long totalSpace = file.getTotalSpace();
        long usableSpace = file.getUsableSpace();
        long freeSpace = file.getFreeSpace();

        log.info("total space in MB: " + totalSpace / 1024 / 1024);
        log.info("usable space in MB: " + usableSpace / 1024 / 1024);
        log.info("free space in MB: " + freeSpace / 1024 / 1024);
    }

    // counting dirs as files
    public void countFilesInDir() {
        File file = new File("D:\\test");

        if (file.isDirectory()) {
            if (file.list().length > 0) {
                System.out.println("files in dir: " + file.list().length);
            } else {
                System.out.println("directory is empty");
            }
        } else {
            System.out.println("not a directory");
        }
    }

    // copies only one dir
    public void copyDirectory() {
        Path originalDir = Paths.get("D:\\test");
        Path newDir = Paths.get("E:\\test");

        try {
            Files.copy(originalDir, newDir);
            log.info("dir created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
