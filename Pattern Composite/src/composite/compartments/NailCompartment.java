package composite.compartments;

import composite.abstraction.iToolCompartment;
import composite.tools.Tools;

public class NailCompartment implements iToolCompartment {

    Tools tool = Tools.NAILS;

    @Override
    public void printToolCompartmentAssignment() {
        System.out.println("This compartment is for :" + tool);
    }
}
