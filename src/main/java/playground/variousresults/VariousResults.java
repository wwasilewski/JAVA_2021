/*
Napisz program, który wypisze wyniki poniższych działań
1. 2 + 3
2. 2 - 4
3. 5 / 2
4. 5.0 / 2.0
5. 100L – 10
6. 2f – 3
7. 5f / 2
8. 5d / 2
9. ’a’ + 2
10. ”ab” + ”c”
11. 9 % 4
12. ’a’ + 3 + ”b”
Określ jakiego typu jest wynik.
*/

package playground.variousresults;

public class VariousResults {
    public static void main(String[] args) {

        System.out.println("2+3= " + (2 + 3));
        System.out.println("2-4= " + (2 - 4));
        System.out.println("5/2= " + (5 / 2));
        System.out.println("5.0/2.0= " + (5f / 2f));
        System.out.println("100L - 10= " + (100L - 10));
        System.out.println("2f - 3= " + (2f - 3));
        System.out.println("5f / 2= " + (5f / 2));
        System.out.println("5d / 2= " + (5d / 2));
        System.out.println("'a' + 2= " + ('a' + 2));
        System.out.println("\"ab\" + \"c\"= " + ("ab" + "c"));
        System.out.println("9 % 4= " + (9 % 4));
        System.out.println("\'a\' + 3 + \"b\"= " + ('a' + 3 + "b"));
    }
}
