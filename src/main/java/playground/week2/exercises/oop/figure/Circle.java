/*
Utwórz klasę Circle dziedziczącą po klasie Figure
i. dodaj pole radius będące promieniem okręgu
ii. nadpisz metodę countArea() klasy Figure i zaimplementuj ją.
iii. Utwórz konstruktor przyjmujący wszystkie parametry potrzebne do
obliczenia pola.
iv. nadpisz metodę displayArea() tak aby wyświetlała informację:
“Figura: Koło, pole: <obilczone_pole>”
*/

package playground.week2.exercises.oop.figure;

public class Circle extends Figure {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float countArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public void displayArea() {
        System.out.println("Figure: Circle, area: " + countArea());
    }
}
