package structural.composite;

import java.util.ArrayList;

public abstract class ConcentrationComponent {
    public void add(ConcentrationComponent concentrationComp) {
        throw new UnsupportedOperationException();
    }
    public void remove(ConcentrationComponent concentrationComp) {
        throw new UnsupportedOperationException();
    }
    public ConcentrationComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
    public void format() {
        throw new UnsupportedOperationException();
    }
}

class Concentration extends ConcentrationComponent{
    public String description;
    public Concentration (String description){
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void format(){
        System.out.println("Concentration: " + getDescription());
    }
}

class CompositeConcentration extends ConcentrationComponent{
    ArrayList<ConcentrationComponent> concentrationComps = new ArrayList<ConcentrationComponent>();
    String description;
    public CompositeConcentration(String description){
        this.description = description;
    }
    public void add(ConcentrationComponent concentrationComp) {
        concentrationComps.add(concentrationComp);
    }

    public void remove(ConcentrationComponent concentrationComp) {
        concentrationComps.remove(concentrationComp);
    }
    public ConcentrationComponent getChild(int i) {
        return (ConcentrationComponent)concentrationComps.get(i);
    }

    public String getDescription() {
        return description;
    }

    public void format(){
        System.out.println("** Combo Concentration of " + getDescription());
        for (ConcentrationComponent concentrationComp : concentrationComps) {
            concentrationComp.format();
        }
    }
}

