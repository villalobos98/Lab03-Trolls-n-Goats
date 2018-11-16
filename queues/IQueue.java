package queues;
/**
 * @Author Isaias Villalobos
 * Java 9
 * 2/6/18
 * Description: Interface for the Queue.
 */

import goats.IGoat;

public interface IQueue <T> {

    public int size();

    public boolean isEmpty();

    public T front();

    public void enqueue(T goat);

    public T dequeue();

}
