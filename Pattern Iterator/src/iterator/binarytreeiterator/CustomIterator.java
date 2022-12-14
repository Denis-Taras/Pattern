package iterator.binarytreeiterator;

import java.util.Iterator;

class CustomIterator<T> implements Iterator<T> {

    private Node<T> current, root;
    private boolean start;

    public CustomIterator(Node<T> root) {
        this.root = current = root;
        while (current.left != null) {
            current = current.left;
        }
    }

    private boolean hasRightmostParent(Node<T> node) {
        if (node.parent == null) {
            return false;
        } else {
            return (node == node.parent.left) || hasRightmostParent(node.parent);
        }
    }

    @Override
    public boolean hasNext() {
        return current.left != null || current.right != null || hasRightmostParent(current);
    }

    @Override
    public T next() {
        if (!start) {
            start = true;
            return current.value;
        }

        if (current.right != null) {
            current = current.right;
            while (current.left != null) {
                current = current.left;
            }
        } else {
            Node<T> parent = current.parent;
            while (parent != null && current == parent.right) {
                current = parent;
                parent = parent.parent;
            }
            current = parent;
        }
        return current.value;
    }
}