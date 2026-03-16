package smartwaste.adt;

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        rear.setNext(newNode);
        rear = newNode;
        size++;
    }

    public T peek() { return isEmpty() ? null : front.getData(); }
    public boolean isEmpty() { return size == 0; }
    public int size() { return size; }
}
