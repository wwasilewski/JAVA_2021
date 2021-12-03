package playground.week3.streams.employees;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, 2000d, "Risk Depart", Employee.DayJob.FULL_TIME),
                new Employee(2, 2500d, "Scoring Depart", Employee.DayJob.FULL_TIME),
                new Employee(3, 2600d, "Scoring Depart", Employee.DayJob.FULL_TIME),
                new Employee(4, 2700d, "Credit Depart", Employee.DayJob.FULL_TIME),
                new Employee(5, 2700d, "Credit Depart", Employee.DayJob.PART_TIME),
                new Employee(6, 5000d, "Fun Depart", Employee.DayJob.PART_TIME)
        );

        employees
                .stream()
                .map(Employee::getDivision) // getDivision is a getter
                .forEach(System.out::println);

        employees
                .stream()
                .filter(e -> e.getSalary() > 2600)
                .forEach(e -> System.out.println("id: " + e.getId() + ", wage: " + e.getSalary()));

        List<Employee> filteredBySalaries = employees
                .stream()
                .filter(e -> e.getSalary() > 2600)
                .collect(Collectors.toList());
        System.out.println("Salary > 2600: " + filteredBySalaries);
    }
}
