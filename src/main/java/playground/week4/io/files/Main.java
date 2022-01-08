package playground.week4.io.files;

public class Main {
    public static void main(String[] args) {
        OperationsOnFile operationsOnFiles = new OperationsOnFile();

        operationsOnFiles.createFile();
//        operationsOnFiles.deleteFile();

        operationsOnFiles.copyFile();
        operationsOnFiles.moveFile();
    }
}
