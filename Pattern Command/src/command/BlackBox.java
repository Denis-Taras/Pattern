package command;

import java.util.ArrayDeque;

public class BlackBox {
    private ArrayDeque<Command> history = new ArrayDeque<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }

    public void printStack() {
        if(!this.isEmpty()) {
            System.out.println(history.size());
            history.stream().forEach(h -> System.out.println(h.getClass().getSimpleName()));
        } else {
            System.out.println("History of actions is empty");
        }
    }
}
