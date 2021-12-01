package playground.week3.exercises.generics.ex14;

public class Teacher extends BasePerson {

    private String school;
    private String degree;

    public Teacher(String name, String surname, String school, String degree) {
        super(name, surname);
        this.school = school;
        this.degree = degree;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
