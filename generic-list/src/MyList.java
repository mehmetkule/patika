import java.util.Arrays;

public class MyList <T>{
    public static final int DEFAULT_SIZE = 10;
    private Object[] list;
    private int size;
    private int capacity;

    public MyList() {
        this.list = new Object[DEFAULT_SIZE];
        this.capacity = DEFAULT_SIZE;
        this.size = 0;
    }

    public MyList(int capacity) {
        this.capacity = capacity;
    }

    public void add(T element) {
        if (size == capacity) {
            capacity = capacity * 2;
            Object[] newList = new Object[capacity];
            for (int i = 0; i < size; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }
        list[size] = element;
        size++;
    }

    public int size(){
        return size;
    }
    public int getCapacity(){
        return capacity;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (int) list[index];
    }
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            list[i] = list[i+1];
        }
        size--;
    }

    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        list[index] = element;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T element) {
        for (int i = size - 1; i >= 0; i--) {
            if (list[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public T[] toArray() {
        T[] array = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            array[i] = (T) list[i];
        }
        return array;
    }

    public void clear() {
       list = new Object[0];
    }

    public MyList<T> subList(int start,int finish){
        MyList<T> newList = new MyList<>();
        for (int i = start; i < finish; i++) {
            newList.add((T) list[i]);
        }
        return newList;
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

   public String toString() {
        return Arrays.toString(list);
    }
}
