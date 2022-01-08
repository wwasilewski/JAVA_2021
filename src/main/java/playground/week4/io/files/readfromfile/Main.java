package playground.week4.io.files.readfromfile;

public class Main {
    public static void main(String[] args) {
        ReadFromFile readOrWriteToFile = new ReadFromFile();
        System.out.println(readOrWriteToFile.readAllLinesUnbuffered());

        System.out.println(readOrWriteToFile.readAllLinesBuffered());
    }
}
