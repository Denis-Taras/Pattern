package composite.compartments;

import composite.abstraction.iToolCompartment;
import composite.tools.Tools;

public class SpannerCompartment implements iToolCompartment {

    Tools tool = Tools.SPANNER;

    @Override
    public void printToolCompartmentAssignment() {
        System.out.println("This compartment is for :" + tool);
    }
}
