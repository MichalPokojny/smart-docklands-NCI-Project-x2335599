package smartwaste.adt;

public interface ListWindow<T> {
    void add(T item);
    boolean remove(int index);
    T get(int index);
    int size();
    boolean isEmpty();
}
