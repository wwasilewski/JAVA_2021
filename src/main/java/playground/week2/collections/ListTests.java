package playground.week2.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListTests {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Jerry");
        names.add("Mary");
        names.add("Bery");
        System.out.println(names);

        List<String> names2 = new ArrayList<>(Arrays.asList("Ann", "Jack"));
        names.addAll(names2);
        System.out.println(names);

        System.out.println(names.contains("Jerry"));
        System.out.println(names.isEmpty());
        System.out.println(names.size());
        System.out.println(names.indexOf("Bery"));
        System.out.println(names.get(2));

        names.remove("Ann");
        System.out.println(names);

        names.set(0, "Bono");
        System.out.println(names);

        names.sort(Comparator.naturalOrder());
        System.out.println(names);

        names.sort(Comparator.reverseOrder());
        System.out.println(names);
    }
}
