/*
Przygotuj program obliczający BMI. Przygotuj testy sprawdzające działanie programu
*/

package playground.week3.exercises.unittests.ex24;

public class Ex24 {

    public double calculateBMI(int weight, int height) {
        return weight / (height * height / 10000f);
    }

    public void printResults(int weight, int height) {
        System.out.println("BMI: " + calculateBMI(weight, height));
    }
}
