package playground.week4.io.files.readorwrite;

public class Main {
    public static void main(String[] args) {
        ReadOrWriteToFile readOrWriteToFile = new ReadOrWriteToFile();
        System.out.println(readOrWriteToFile.readAllLinesUnbuffered());

        System.out.println(readOrWriteToFile.readAllLinesBuffered());
    }
}
