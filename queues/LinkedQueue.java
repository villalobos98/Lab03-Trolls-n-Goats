package queues;

import goats.IGoat;
/**
 * @Author Isaias Villalobos
 * Java 9
 * 2/6/18
 * Description: Linkedqueue implementing the interface.
 */
import java.util.LinkedList;
/**
 * @param <T> Generic class that uses the T as a variable to hold the type.
 */
public class LinkedQueue<T> implements IQueue<T> {

    private LinkedList<T> myList;
    /**
     * Constructor
     * @param capacity integer.
     */
    public LinkedQueue(int capacity) {
        this.myList = new LinkedList<T>();
    }

    /**
     * Find the size
     * @return integer size
     */
    public int size() {
        return myList.size();
    }

    /**
     * Check if the list is empty
     * @return true or false depending if the linked list is empty.
     */
    public boolean isEmpty() {
        return myList.isEmpty();
    }

    /**
     * Find the front of the list.
     * @return front of the linked list.
     */
    public T front() {
        return myList.peek();
    }

    /**
     * Add goat to the linkedlist.]
     * @param goat object.
     */
    public void enqueue(T goat) {
        myList.add(goat);
    }

    /**
     * Remove the last element.
     * @return the front.
     */
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        return myList.removeFirst();
    }
}
