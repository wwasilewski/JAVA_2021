package playground.week3.exercises.lambdastreams.ex2829;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new BankAccount("Tom", 1000));
        accounts.add(new BankAccount("Jeryy", 2000));
        accounts.add(new BankAccount("Ann", 3000));
        accounts.add(new BankAccount("Mary", 4000));
        accounts.add(new BankAccount("Bob", 5000));
        accounts.add(new BankAccount("Andy", 7500));
        accounts.add(new BankAccount("Dana", 10000));

        accounts
                .stream()
                .filter(e -> e.getBalance() > 5000)
                .forEach(System.out::println);

        accounts
                .stream()
                .max(Comparator.comparing(BankAccount::getBalance))
                .ifPresent(e -> System.out.println("highest balance: " + e));
    }
}
