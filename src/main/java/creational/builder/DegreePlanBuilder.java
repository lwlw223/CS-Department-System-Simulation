package creational.builder;

public interface DegreePlanBuilder {
    int numberOfCoreCourses = 0;
    int numberOfElectiveCourses = 0;
    boolean thesisRequired = false;
    void takeCoreCourses();
    void takeElectiveCourses();
    void completeThesis();
    void graduate();
    DegreePlan getDegreePlan();
}

class BSDegreePlanBuilder implements DegreePlanBuilder {
    private DegreePlan degreePlan;
    int numberOfCoreCourses = 10;
    int numberOfElectiveCourses = 5;
    boolean thesisRequired = true;
    public BSDegreePlanBuilder() {
        this.degreePlan = new DegreePlan();
    }
    public void takeCoreCourses() {
        degreePlan.add("Step 1: Take " + numberOfCoreCourses + " core courses for BS degree");
    }
    public void takeElectiveCourses() {
        degreePlan.add("Step 2: Take " + numberOfElectiveCourses + " elective courses for BS degree");
    }
    public void completeThesis() {
        if (thesisRequired){
            degreePlan.add("Step 3: Complete thesis for BS degree");
        }
    }
    public void graduate(){degreePlan.add("Step 4: Apply for graduation");}
    public DegreePlan getDegreePlan() {
        return this.degreePlan;
    }

}

class MSDegreePlanBuilder implements DegreePlanBuilder{
    private DegreePlan degreePlan;
    int numberOfCoreCourses = 4;
    int numberOfElectiveCourses = 6;
    boolean thesisRequired = true;
    public MSDegreePlanBuilder() {
        this.degreePlan = new DegreePlan();
    }
    public void takeCoreCourses() {
        degreePlan.add("Step 1: Take " + numberOfCoreCourses + " core courses for MS degree");
    }
    public void takeElectiveCourses() {
        degreePlan.add("Step 2: Take " + numberOfElectiveCourses + " elective courses for MS degree");
    }
    public void completeThesis() {
        if (thesisRequired){
            degreePlan.add("Step 3: Complete thesis for MS degree");
        }
    }
    public void graduate(){degreePlan.add("Step 4: Apply for graduation");}
    public DegreePlan getDegreePlan() {
        return this.degreePlan;
    }
}

class CertPlanBuilder implements DegreePlanBuilder{
    private DegreePlan degreePlan;
    int numberOfCoreCourses = 4;
    public CertPlanBuilder() {
        this.degreePlan = new DegreePlan();
    }
    public void takeCoreCourses() {
        degreePlan.add("Step 1: Take core courses for Certification");
    }
    public void takeElectiveCourses() {}
    public void completeThesis() {
        if (thesisRequired){
            degreePlan.add("Step 3: Complete thesis for MS degree");
        }
    }
    public void graduate(){degreePlan.add("Step 2: Apply for graduation");}
    public DegreePlan getDegreePlan() {
        return this.degreePlan;
    }
}