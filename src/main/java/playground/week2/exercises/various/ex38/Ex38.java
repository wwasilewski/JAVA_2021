/*
Napisz program obliczający pole powierzchni koła. Promień koła użytkownik
wprowadza z klawiatury. Program powinien zasygnalizować błędne dane (liczbę
ujemną lub zero) i ponownie zapytac o długośc promienia. Wykorzystaj metodę
Parse klasy float. Oczywiście nie zapomnij o przechwyceniu ewentualnych wyjątków.
*/

package playground.week2.exercises.various.ex38;

public class Ex38 {

    private float radius;

    public Ex38(float radius) {
        this.radius = radius;
    }

    public float countArea() {
        return (float) (Math.PI * radius * radius);
    }

    public void printResult() {
        System.out.println(countArea());
    }
}
