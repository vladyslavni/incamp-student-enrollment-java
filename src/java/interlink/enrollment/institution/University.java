package interlink.enrollment.institution;

import interlink.enrollment.person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private List<Student> students = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public double getAverageGrade() {
        double studentGradesSum = students.stream()
                .mapToInt(student -> student.getKnowledge().getLevel())
                .sum();

        return studentGradesSum / students.size();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
