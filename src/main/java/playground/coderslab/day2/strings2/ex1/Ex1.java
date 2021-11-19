package playground.coderslab.day2.strings2.ex1;

public class Ex1 {
    public static void main(String[] args) {

        String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";
        String[] arrayOfStrings = splitWords(str);

        for (String arrayOfString : arrayOfStrings) {
            System.out.println(arrayOfString);
        }
    }

    public static String[] splitWords(String str) {
        return str.split(" ");
    }
}
