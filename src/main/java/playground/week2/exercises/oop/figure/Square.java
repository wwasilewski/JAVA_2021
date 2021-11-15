/*
Utwórz klasę Square dziedziczącą po klasie Figure
i. dodaj pole side będące długością boku kwadratu
ii. nadpisz metodę countArea() klasy Figure i zaimplementuj ją.
iii. Utwórz konstruktor przyjmujący wszystkie parametry potrzebne do
obliczenia pola.
iv. nadpisz metodę displayArea() tak aby wyświetlała informację:
“Figura: Kwadrat, pole: <obilczone_pole>”
*/

package playground.week2.exercises.oop.figure;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public float countArea() {
        return side * side;
    }

    @Override
    public void displayArea() {
        System.out.println("Figure: Square, area: " + countArea());
    }
}
