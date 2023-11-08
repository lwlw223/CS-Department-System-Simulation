package creational.builder;

public class Director {
    DegreePlanBuilder builder;
    //Director knows how to use the builder and the sequence of steps.

    public void construct(DegreePlanBuilder builder){
        this.builder = builder;
        builder.takeCoreCourses();
        builder.takeElectiveCourses();
        builder.completeThesis();
        builder.graduate();
    }
}
