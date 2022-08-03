package composite.compartments;

import composite.abstraction.iToolCompartment;
import composite.tools.Tools;

public class ScrewdriverCompartment implements iToolCompartment {

    Tools tool = Tools.SCREWDRIVER;

    @Override
    public void printToolCompartmentAssignment() {
        System.out.println("This compartment is for :" + tool);
    }
}
