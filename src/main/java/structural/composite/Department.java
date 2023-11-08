package structural.composite;

public class Department {
    ConcentrationComponent allConcentrations;
    public Department(ConcentrationComponent allConcentrations) {
        this.allConcentrations = allConcentrations;
    }
    public void printConcentrations() {
        allConcentrations.format();
    }
}
