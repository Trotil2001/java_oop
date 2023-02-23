package HomeWork3.List;

import java.util.Iterator;

public class List<T> implements Iterable<T> {
    private Node<T> first, last;

    public void add(T data) {
        Node<T> node = new Node<T>(data, null);
        if (first == null)
            first = last = node;
        else {
            last.setNext(node);
            last = node;
        }
    }

    public Node<T> getFirst() {
        return first;
    }


    @Override
    public Iterator<T> iterator() {
        return new ListIterator<T>(this);
    }

    public class ListIterator<T> implements Iterator<T> {
        Node<T> current;

        public ListIterator(List<T> list) {
            current = list.getFirst();
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T data = current.getData();
            current = current.getNext();
            return data;
        }

    }
}