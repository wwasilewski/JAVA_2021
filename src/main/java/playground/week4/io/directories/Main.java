package playground.week4.io.directories;

public class Main {
    public static void main(String[] args) {
        OperationsOnDir operationsOnDir = new OperationsOnDir();

        operationsOnDir.createDirectory();
        operationsOnDir.createDirectory2();
        operationsOnDir.createDirectories();

        operationsOnDir.deleteDirectory();

        operationsOnDir.getDirectorySize();
        operationsOnDir.countFilesInDir();

        operationsOnDir.copyDirectory();
    }
}
