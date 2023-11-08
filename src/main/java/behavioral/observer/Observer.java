package behavioral.observer;


import java.util.ArrayList;

public interface Observer {
    public void update(String value);
    public String getName();
}

class ObserverChairperson implements Observer {
    private String value;
    private String name;
    private ClassSubject SimpleClassSubject;

    public ObserverChairperson(ClassSubject SimpleClassSubject, String name) {
        this.SimpleClassSubject = SimpleClassSubject;
        this.name = name;
        SimpleClassSubject.registerObserver(this);
    }

    public void update(String value) {
        this.value = value;
        if (value.contains("full")) {
            display();
        }
    }
    public void display() {
        System.out.println("Message received by " + name + " : " + value);
    }
    public String getName() {
        return name;
    }
}

class ObserverStudent implements Observer {
    private String value;
    private String name;
    private ClassSubject SimpleClassSubject;

    public ObserverStudent(ClassSubject SimpleClassSubject, String name) {
        this.SimpleClassSubject = SimpleClassSubject;
        this.name = name;
        SimpleClassSubject.registerObserver(this);
    }

    public void update(String value) {
        this.value = value;
        if (value.contains("open")) {
            display();
        }
    }
    public void display() {
        System.out.println("Message received by " + name + " : " + value);
    }
    public String getName() {
        return name;
    }
}
