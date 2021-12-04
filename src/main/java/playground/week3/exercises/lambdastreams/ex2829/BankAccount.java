/*
Przygotuj klasę BankAccount posiadającą pola name and balance. Utwórz 7 instancji
klasy BankAccount ze stanem konta odpowiednio 1000,2000,3000,4000, 5000,7500 i
10000 złotych. Dodaj je do listy generycznej. Korzystając ze strumieni znajdź
wszystkie konta które mają zgromadzonych środków więcej niż 5000zł.
*/

package playground.week3.exercises.lambdastreams.ex2829;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BankAccount {

    private String name;
    private int balance;
}
