package generic;

public interface Ilist<T> {
    int size();
    boolean isEmpty();
    boolean add(T t);
    boolean remove();
    T get(int i);
    void get(int i,T t);
}
