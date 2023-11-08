package creational.builder;

public class main {
    public static void main(String[] args) {

        System.out.println("\n-- Testing BS Degree Plan --");
        printDegreePlan(new BSDegreePlanBuilder());

        System.out.println("\n-- Testing MS Degree Plan --");
        printDegreePlan(new MSDegreePlanBuilder());

        System.out.println("\n-- Testing Certification Plan --");
        printDegreePlan(new CertPlanBuilder());
    }

    public static void printDegreePlan(DegreePlanBuilder degreePlanBuilder){
        Director director = new Director();
        director.construct(degreePlanBuilder);
        DegreePlan degreePlan = degreePlanBuilder.getDegreePlan();
        degreePlan.show();
    }
}
