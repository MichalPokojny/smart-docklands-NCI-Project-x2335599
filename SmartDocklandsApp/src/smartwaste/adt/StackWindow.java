
package smartwaste.adt;


public interface StackWindow<T> { // Stack inferface
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}
