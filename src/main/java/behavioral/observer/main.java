package behavioral.observer;

public class main {
    public static void main(String[] args) {
        SimpleClassSubject CS665 = new SimpleClassSubject(); // Enrollment limit is 3

        ObserverChairperson chairperson= new ObserverChairperson(CS665, "Chairperson");

        System.out.println("\n --Testing enrollment--");
        CS665.enrollStudent("Alice");
        CS665.enrollStudent("Bob");
        CS665.enrollStudent("Charlie");

        System.out.println("\n --Testing waitlist--");
        CS665.enrollStudent("Dave");
        CS665.enrollStudent("Eve");

        System.out.println("\n --Testing drop--");
        CS665.dropStudent("Charlie");

        System.out.println("\n --Testing another drop--");
        CS665.dropStudent("Dave");
    }
}
