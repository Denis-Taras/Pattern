package composite;

import composite.compartments.HammerCompartment;
import composite.compartments.NailCompartment;
import composite.compartments.ScrewdriverCompartment;
import composite.compartments.SpannerCompartment;

public class Main {
    
    public static void main(String[] args) {
        ToolBox toolBox = new ToolBox();
        toolBox.printToolCompartmentAssignment();
        toolBox.printEachInnerToolCompartmentAssignment();

        System.out.println();

        toolBox.addCompartment(new SpannerCompartment());
        toolBox.addCompartment(new ScrewdriverCompartment());
        toolBox.addCompartment(new HammerCompartment());
        toolBox.addCompartment(new NailCompartment());

        toolBox.printEachInnerToolCompartmentAssignment();
        System.out.println();

        toolBox.removeCompartment(toolBox.getToolCompartment(2));

        toolBox.printEachInnerToolCompartmentAssignment();
    }
}
