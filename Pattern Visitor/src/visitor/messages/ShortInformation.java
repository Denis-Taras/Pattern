package visitor.messages;

import visitor.messages.abstractions.Element;
import visitor.visitors.abstractions.Visitor;

public class ShortInformation extends Element {

    private String text;

    public ShortInformation(String text) {
        this.text = text;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getText() {
        return text;
    }
}