package playground.week3.exercises.generics.ex14;

public class Main {
    public static void main(String[] args) {
        Clipboard<Employee> employee = new Clipboard<>();
        employee.insertIntoClipboard(new Employee("Tom", "Barry", "IBM"));
        System.out.println(employee.getFromClipboard());

        Clipboard<Teacher> teacher = new Clipboard<>();
        teacher.insertIntoClipboard(new Teacher("Mary", "Andos", "MIT", "pro"));
        System.out.println(teacher.getFromClipboard());
    }
}
