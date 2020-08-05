package interlink.enrollment.institution.interlink;

import interlink.enrollment.institution.University;
import interlink.enrollment.person.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Internship {

    private String name;
    private List<Student> interns = new ArrayList<>();

    public Internship(String name) {
        this.name = name;
    }

    public void addIntern(University university) {
        university.getStudents()
                .stream()
                .filter(student -> student.getKnowledge().getLevel() >= university.getAverageGrade())
                .forEach(student -> interns.add(student));
    }

    public String getInterns() {
        return interns.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", \n"));
    }
}
