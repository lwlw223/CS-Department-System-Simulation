package structural.decorator;

import java.util.ArrayList;

public abstract class FacultyDecorator implements Faculty {
}

class GraduateAdvisor extends FacultyDecorator {
    Faculty faculty;
    int year;

    public GraduateAdvisor(Faculty faculty, int year) {
        this.faculty = faculty;
        this.year = year;
    }

    public String getDescription() {
        return faculty.getDescription() + " -> " + year + " Graduate Advisor";
    }
    public int getNumberOfCourse() {
        return faculty.getNumberOfCourse();
    }
    public ArrayList<String> getCourseList() {
        return faculty.getCourseList();
    }
    public void addCourse(String course) {
        faculty.addCourse(course);
    }
}

class UndergraduateAdvisor extends FacultyDecorator {
    Faculty faculty;
    int year;

    public UndergraduateAdvisor(Faculty faculty, int year) {
        this.faculty = faculty;
        this.year = year;
    }

    public String getDescription() {
        return faculty.getDescription() + " -> " + year + " Undergraduate Advisor";
    }
    public int getNumberOfCourse() {
        return faculty.getNumberOfCourse();
    }

    public ArrayList<String> getCourseList() {
        return faculty.getCourseList();
    }
    public void addCourse(String course) {
        faculty.addCourse(course);
    }
}

class ThesisAdvisor extends FacultyDecorator {
    Faculty faculty;

    public ThesisAdvisor(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getDescription() {
        return faculty.getDescription() + " -> Thesis Advisor";
    }
    public int getNumberOfCourse() {
        return faculty.getNumberOfCourse();
    }
    public ArrayList<String> getCourseList() {
        return faculty.getCourseList();
    }
    public void addCourse(String course) {
        faculty.addCourse(course);
    }
}

class GeneralAdvisor extends FacultyDecorator {
    Faculty faculty;

    public GeneralAdvisor(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getDescription() {
        return faculty.getDescription() + " -> General Advisor";
    }

    public int getNumberOfCourse() {
        return faculty.getNumberOfCourse();
    }
    public ArrayList<String> getCourseList() {
        return faculty.getCourseList();
    }

    public void addCourse(String course) {
        faculty.addCourse(course);
    }

}