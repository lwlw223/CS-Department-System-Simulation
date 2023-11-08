package behavioral.chainofresponsibility;

public class main {
    public static void main(String[] args) {
        System.out.println("\n ***Chain of Responsibility Pattern Demo***\n");

        // Forming the chain as IssueRaiser -> FTFacultyHandler -> ChairpersonHandler

        // Object of the chains
        IssueRaiser issueRaiser = new IssueRaiser();
        Handler ftFacultyHandler = new NormalConcentrationHandler();
        Handler chairpersonHandler = new TopConcentrationHandler();

        // Making the chain
        // Starting point: IssueRaiser will raise issues and set the first handler
        issueRaiser.setFirstErrorHandler(ftFacultyHandler);
        // FTFacultyHandler will pass the issue to ChairpersonHandler if it can't handle it
        ftFacultyHandler.nextErrorHandler(chairpersonHandler);

        Message m1 = new Message("Creating new Sub-concentration under 'Programming Languages'", ConcentrationLevel.NORMAL);
        Message m2 = new Message("Creating new Concentration under CS Department", ConcentrationLevel.TOP);

        issueRaiser.raiseMessage(m1);
        issueRaiser.raiseMessage(m2);
    }
}
