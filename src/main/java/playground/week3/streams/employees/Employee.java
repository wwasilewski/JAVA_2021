package playground.week3.streams.employees;

import lombok.Data;

@Data
public class Employee {

    private int id;
    private double salary;
    private String division;
    private DayJob dayJob;

    public Employee(int id, double salary, String division, DayJob dayJob) {
        this.id = id;
        this.salary = salary;
        this.division = division;
        this.dayJob = dayJob;
    }

    public enum DayJob {
        FULL_TIME("Full-time job"),
        PART_TIME("Part-time job");

        String dayJobDescription;

        DayJob(String dayJobDescription) {
            this.dayJobDescription = dayJobDescription;
        }
    }
}
