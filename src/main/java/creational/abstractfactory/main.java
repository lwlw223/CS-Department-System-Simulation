package creational.abstractfactory;

public class main {
    public static void main(String[] args) {
        ProgramFactory myProgramFactory;
        Program myProgram;
        System.out.println("***Abstract Factory Pattern Demo***\n");

        System.out.println("** BS Programs **");
        myProgramFactory = new BSProgramFactory();
        myProgramFactory.createCSProgram().getDescription();
        myProgramFactory.createCISProgram().getDescription();

        System.out.println("\n******************");
        System.out.println("** MS Programs **");
        myProgramFactory = new MSProgramFactory();
        myProgramFactory.createCSProgram().getDescription();
        myProgramFactory.createCISProgram().getDescription();
        myProgramFactory.createDAProgram().getDescription();

        System.out.println("\n******************");
        System.out.println("** Certificate Programs **");
        myProgramFactory = new CertProgramFactory();
        myProgramFactory.createCertSecurityProgram().getDescription();
        myProgramFactory.createCertWebTechProgram().getDescription();
        myProgramFactory.createCertAnalyticsProgram().getDescription();

    }


}
