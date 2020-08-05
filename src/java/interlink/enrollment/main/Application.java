package interlink.enrollment.main;

import interlink.enrollment.institution.University;
import interlink.enrollment.institution.interlink.Internship;
import interlink.enrollment.person.Student;
import interlink.enrollment.person.consciousness.Knowledge;

public class Application {

    public static void main(String[] args) {

        University university = new University("CH.U.I.");
        university.addStudent(new Student("Martin", new Knowledge(1)));
        university.addStudent(new Student("Bob", new Knowledge(4)));
        university.addStudent(new Student("Robert", new Knowledge(5)));

        Internship internship = new Internship("Interlink");
        internship.addIntern(university);

        System.out.println("List of internship's students:");
        System.out.println(internship.getInterns());
    }
}
