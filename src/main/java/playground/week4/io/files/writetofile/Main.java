package playground.week4.io.files.writetofile;

public class Main {
    public static void main(String[] args) {
        WriteToFile writeToFile = new WriteToFile();
        writeToFile.writeToFileUsingBufferedReader();

        writeToFile.writeToFileUsingPrintWriter();

        writeToFile.writeToFileUsingNIO();
    }
}
