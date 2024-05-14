/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqueue;


/** Queue ADT */
public interface Queue<E> {
    /** Reinitialize the queue. The user is responsible for
    reclaiming the storage used by the queue elements. */
    public void clear();
    /** Place an element at the rear of the queue.
    @param the element being enqueued. */
    public void enqueue(E it);
    /** Remove and return element at the front of the queue.
    @return The element at the front of the queue. */
    public E dequeue();
    /** @return The front element. */
    public E frontValue();
    /** @return The number of elements in the queue. */
    public int length();
}