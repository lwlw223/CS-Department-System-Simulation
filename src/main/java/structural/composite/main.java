package structural.composite;

public class main {
    public static void main(String[] args) {
        ConcentrationComponent ProceduralLanguages = new Concentration("Procedural Languages");
        ConcentrationComponent OOLanguages = new Concentration("Object Oriented Languages");
        ConcentrationComponent FunctionalLanguages = new Concentration("Functional Languages");

        CompositeConcentration ProgrammingLanguages = new CompositeConcentration("Programming Languages");
        ProgrammingLanguages.add(ProceduralLanguages);
        ProgrammingLanguages.add(OOLanguages);
        ProgrammingLanguages.add(FunctionalLanguages);

        System.out.println("\n -- Testing Procedural Languages Concentration by itself --");
        Department CSdepartment1 = new Department(ProceduralLanguages);
        CSdepartment1.printConcentrations();

        System.out.println("\n -- Testing Programming Languages Concentration --");
        Department CSdepartment2 = new Department(ProgrammingLanguages);
        CSdepartment2.printConcentrations();


    }
}
