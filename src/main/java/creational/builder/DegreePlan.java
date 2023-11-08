package creational.builder;

import java.util.LinkedList;

public class DegreePlan {
    private LinkedList<String> steps;
    public DegreePlan(){
        steps = new LinkedList<String>();
    }
    public void add(String step){
        //Adding parts
        steps.addLast(step);
    }
    public void show(){
        System.out.println("\nDegree plan as below :");
        for (String step: steps){
            System.out.println(step);
        }
    }

}
