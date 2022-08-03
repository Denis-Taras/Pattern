package visitor.visitors.abstractions;

import visitor.messages.LongInformation;
import visitor.messages.ShortInformation;

public interface Visitor {

    void visit(LongInformation e);

    void visit(ShortInformation e);
}
