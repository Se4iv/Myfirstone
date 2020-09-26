package Homework61;


public class MineCollection<E> {
    private E[] elements;
    private E[] arr;
    private int size;

    public MineCollection(){
        this.size = 0;

    }

    public int size() {
        return size = elements.length;
    }


    public void add(E item) {
        if (size() == 0) {
            elements = (E[]) new Object[1];
            elements[0] = item;
        } else {
            arr = (E[]) new Object[size()];
            for (int i = 0; i < arr.length; i++)
                arr[i] = elements[i];
            elements = (E[]) new Object[size() + 1];
            elements[elements.length - 1] = item;
            for (int i = 0; i < elements.length - 1; i++)
                elements[i] = arr[i];
        }


    }

    public void remove(int index) {
        if (index > size()) {
            System.out.println(" Вышли за рамки массива!");
        } else {
            arr = (E[]) new Object[size()];
            for (int i = 0, j = 0; i < arr.length - 1; i++, j++) {
                if (j != index) {
                    arr[i] = elements[j];
                } else {
                    i--;
                }
            }
            elements = (E[]) new Object[size() - 1];
            for (int k = 0; k < elements.length; k++) {
                elements[k] = arr[k];
            }
        }

    }

    public void remove(E item) {
        int index = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == item) {
                index = i;
            }
        }
        arr = (E[]) new Object[size()];
        for (int i = 0, j = 0; i < arr.length - 1; i++, j++) {
            if (j != index) {
                arr[i] = elements[j];
            } else {
                i--;
            }
        }
        elements = (E[]) new Object[size() - 1];
        for (int k = 0; k < elements.length; k++) {
            elements[k] = arr[k];
        }
    }

       public E get(int index){
          return elements[index];
      }
    public void clear() {
    elements = (E[]) new Object[1];
    }
}
