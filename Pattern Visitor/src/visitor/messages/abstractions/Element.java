package visitor.messages.abstractions;

import visitor.visitors.abstractions.Visitor;

public abstract class Element {

    public abstract void accept(Visitor visitor);
}