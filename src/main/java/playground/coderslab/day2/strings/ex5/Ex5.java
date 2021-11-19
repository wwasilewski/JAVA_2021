package playground.coderslab.day2.strings.ex5;

public class Ex5 {
    public static void main(String[] args) {

        String str = "CodersLab jak dobrze zacząć programować";
        System.out.println(charPos(str, 'd'));
    }

    public static int charPos(String str, char c) {
        return str.indexOf(c);
    }
}
