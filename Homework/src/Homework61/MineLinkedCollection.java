package Homework61;

import java.util.*;

public class MineLinkedCollection<E> {
    private LinkedList<E> elements;

    public MineLinkedCollection() {
        this.elements =new LinkedList<>();

    }

    public int size() {
        return elements.size();
    }


    public void add(E item) {
            elements.add(item);
    }

    public void remove(int index) {
            elements.remove(index);
    }



    public void remove(E item) {
            elements.remove(item);
    }

    public E get(int index) {
            return elements.get(index);
    }

    public void clear() {
            elements.clear();
    }

}
