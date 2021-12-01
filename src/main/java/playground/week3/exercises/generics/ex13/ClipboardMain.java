package playground.week3.exercises.generics.ex13;

public class ClipboardMain {
    public static void main(String[] args) {
        Clipboard<Integer> integerClipboard = new Clipboard<>();
        integerClipboard.insertIntoClipboard(223);
        System.out.println(integerClipboard.getFromClipboard());

        Clipboard<String> stringClipboard = new Clipboard<>();
        stringClipboard.insertIntoClipboard("my test string");
        System.out.println(stringClipboard.getFromClipboard());
    }
}
