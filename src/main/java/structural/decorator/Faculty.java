package structural.decorator;

import java.util.ArrayList;

interface Faculty {
    String description = "";
    int numberOfCourse = 0;
    ArrayList<String> courseList = null;

    String getDescription();
    int getNumberOfCourse();
    ArrayList<String> getCourseList();

    void addCourse(String course);
}

class Chairperson implements Faculty {
    String description = "Chairperson";
    int numberOfCourse = 1;
    ArrayList<String> courseList = new ArrayList<String>();
    private static Chairperson chairperson; // Make the constructor private to prevent the use of "new"
    static int numberofInstance = 0;
    private Chairperson(){
        numberofInstance++;
        System.out.println("Number of Chairperson instances at this moment = " + numberofInstance);
    }

    public static synchronized Chairperson getInstance(){
        // Lazy Initialization
        if(chairperson == null){
            chairperson = new Chairperson();
            System.out.println("New Chairperson created");
        }
        else{
            System.out.println("Chairperson already exists");
        }
        return chairperson;
    }

    public String getDescription() {
        return description;
    }
    public int getNumberOfCourse() {
        return numberOfCourse;
    }
    public ArrayList<String> getCourseList() {
        return courseList;
    }
    public void addCourse(String course) {
        if (courseList.size() <1){
            courseList.add(course);
            System.out.println(course + " added to course list");
        }
        else
            System.out.println("Course list is full");
    }
}

class FullTimeFaculty implements Faculty {
    String description = "FullTime Faculty";
    int numberOfCourse = 3;
    ArrayList<String> courseList = new ArrayList<String>();

    public String getDescription() {
        return description;
    }
    public int getNumberOfCourse() {
        return numberOfCourse;
    }
    public ArrayList<String> getCourseList() {
        return courseList;
    }
    public void addCourse(String course) {
        if (courseList.size() <3){
            courseList.add(course);
            System.out.println(course + " added to course list");
        }
        else
            System.out.println("Course list is full");
    }
}

class PartTimeFaculty implements Faculty {
    String description = "PartTime Faculty";
    int numberOfCourse = 1;
    ArrayList<String> courseList = new ArrayList<String>();

    public String getDescription() {
        return description;
    }
    public int getNumberOfCourse() {
        return numberOfCourse;
    }
    public ArrayList<String> getCourseList() {
        return courseList;
    }
    public void addCourse(String course) {
        if (courseList.size() <1){
            courseList.add(course);
            System.out.println(course + " added to course list");
        }
        else
            System.out.println("Course list is full");
    }
}