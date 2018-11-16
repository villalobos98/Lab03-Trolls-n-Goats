package queues;
/**
 * @Author Isaias Villalobos
 * Java 9
 * 2/6/18
 * Description: Array queue using interface.
 */

public class ArrayQueue<T> implements IQueue<T> {
    private int F, B;
    private T[] t;
    private int size = 0;

    /**
     * Constructor
     * @param capacity integer
     */
    public ArrayQueue(int capacity) {
        this.t = (T[]) new Object[capacity];
    }

    @Override
    /**
     * size of the array
     */
    public int size() {
        return size;
    }

    /**
     * @return true if the size is 0 false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * @return front of the array.
     */
    @Override
    public T front() {
        return t[F];
    }

    /**
     * @param goat object
     * Add to the back of the queue.
     */
    @Override
    public void enqueue(T goat) {
        if (F == B && size > 0)
            return;
        t[B] = goat;
        B = (B + 1) % t.length;
        size += 1;
    }

    /**
     * Remove from the front of the queue.
     * @return front
     */
    @Override
    public T dequeue() {

        if (this.isEmpty())
            return null;

        T front = t[F];
        F = (F + 1) % t.length;
        size -= 1;
        return front;
    }
}
