package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public interface ClassSubject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(String message);
}

class SimpleClassSubject implements ClassSubject {
    private List<Observer> observers;
    private List<String> students = new ArrayList<String>();
    private List<String> waitlist = new ArrayList<String>();
    private int enrollmentLimit = 3;
    private String value;
    public SimpleClassSubject() {
        observers = new ArrayList<Observer>();
    }
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
    public void setValue(String value) {
        this.value = value;
        notifyObservers(value);
    }

    public void enrollStudent(String student) {
        if (students.size() < enrollmentLimit) {
            students.add(student);
            System.out.println("Student " + student + " enrolled"); // Print scenario to console
            notifyObservers("Class open, " + student + " enrolled");

            // Remove enrolled student from observers
            for (Observer observer : observers) {
                if (observer.getName().equals(student)) {
                    removeObserver(observer);
                    return;
                }
            }

            checkEnrollmentLimit();

        } else {
            waitlist.add(student);
            System.out.println("Student " + student + " added to waitlist");
            if (waitlist.size() == 1) {
                new ObserverStudent(this,student);
            }
        }
    }

    public void dropStudent(String student) {
        students.remove(student);
        System.out.println("Student " + student + " dropped"); // Print scenario to console

        /* If there is a waitlist...
              Step1: Remove nextStudent from waitlist
              Step2: Enroll the next student
              Step3: Upgrade the next next student to observer
              Step4: Check if class is full */

        if (!waitlist.isEmpty()) {
            String nextStudent = waitlist.remove(0);
            enrollStudent(nextStudent);

            if (!waitlist.isEmpty()) {
                String nextNextStudent = waitlist.get(0);
                new ObserverStudent(this,nextNextStudent);
            }
        }
        checkEnrollmentLimit();
    }

    public void checkEnrollmentLimit() {
        if (students.size() == enrollmentLimit) {
            notifyObservers("Class is full");
        }
    }

}
