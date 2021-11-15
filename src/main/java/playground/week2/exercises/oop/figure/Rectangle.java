/*
Utwórz klasę Rectangle dziedziczącą po klasie Figure
i. dodaj pole sideA będące długością boku prostokąta.
ii. dodaj pole sideB będące długością boku prostokąta.
iii. nadpisz metodę countArea() klasy Figure i zaimplementuj ją.
iv. Utwórz konstruktor przyjmujący wszystkie parametry potrzebne do
obliczenia pola.
v. nadpisz metodę displayArea() tak aby wyświetlała informację:
“Figura: Prostokąt, pole: <obilczone_pole>”
*/

package playground.week2.exercises.oop.figure;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public float countArea() {
        return sideA * sideB;
    }

    @Override
    public void displayArea() {
        System.out.println("Figure: Rectangle, area: " + countArea());
    }
}
