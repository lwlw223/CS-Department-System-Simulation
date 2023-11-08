package structural.decorator;

public class main {
    public static void main(String[] args) {
        System.out.println("\n-- Testing Chairperson --");
        Faculty faculty1 = new GeneralAdvisor(Chairperson.getInstance());
        test(faculty1);

        System.out.println("\n-- Testing Full Time Faculty --");
        Faculty faculty2 = new FullTimeFaculty();
        faculty2 = new ThesisAdvisor(faculty2);
        faculty2 = new GeneralAdvisor(faculty2);
        test(faculty2);

        System.out.println("\n-- Testing Full Time Faculty as Grad Advisor --");
        Faculty faculty3 = new FullTimeFaculty();
        faculty3 = new ThesisAdvisor(faculty3);
        faculty3 = new GeneralAdvisor(faculty3);
        faculty3 = new GraduateAdvisor(faculty3,2023);
        test(faculty3);

        System.out.println("\n-- Testing Full Time Faculty as Undergrad Advisor --");
        Faculty faculty4 = new FullTimeFaculty();
        faculty4 = new ThesisAdvisor(faculty4);
        faculty4 = new GeneralAdvisor(faculty4);
        faculty4 = new UndergraduateAdvisor(faculty4,2023);
        test(faculty4);

        System.out.println("\n-- Testing Part Time Faculty --");
        Faculty faculty5 = new PartTimeFaculty();
        faculty5 = new GeneralAdvisor(faculty5);
        test(faculty5);

    }

    public static void test(Faculty faculty){
        System.out.println(faculty.getDescription());
        System.out.println("NUmber of Course: " + faculty.getNumberOfCourse());
        faculty.addCourse("CS665");
        faculty.addCourse("CS666");
        faculty.addCourse("CS667");
        System.out.println("Course List: " + faculty.getCourseList());
    }
}
