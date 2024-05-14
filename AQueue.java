/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aqueue;


/**
 *
 * @author myriambayen
 * @param <E>
 */



public class AQueue<E> implements Queue<E>{
    /** Variables defined here**/
    private static final int DEFAULT_SIZE = 10;
    private int maxSize; // Maximum size of queue 
    private int front; // Index of front element of the queue
    private int rear; // Index of rear element of the queue
    private E[] listArray; // Array holding queue elements
    private int listSize; //Size of the listArray Queue
    // Constructors WHAT DO I PUT FOR JAVADOC CONSTRUCTOR
    AQueue() {
        this(DEFAULT_SIZE);
    }
    @SuppressWarnings("unchecked") // For generic array
    /**@param size to set values for all variables in the queue**/
    AQueue(int size) {
        maxSize = size; //Size inputed by user when creating queue
        listSize = 0; //Current list size 
        rear = 0; front = 1; //rear just has one less than the front at the beginning 
        listArray = (E[])new Object[maxSize]; // Create listArray
    }
    @Override
    /** Queue is being cleared, meaning all elements inside are being deleted**/
    public void clear() {
        rear = 0; front = 1; listSize = 0;
    }
    @Override
    /**@param it is inputed and enqueued, nothing is returned in this method**/
    public void enqueue(E it) { 
        if(listSize == maxSize){
            System.out.println("Queue is full, cannot enqueue"); //Checking if size is equal to max size and then telling user they cann't enqueue because queue is full**/
        }
        else{
            rear = (rear+1) % maxSize; // Circular increment        }
            listArray[rear] = it;
            listSize += 1;
        }
    }
    @Override
    /**@return the value being dequeued / taken out of the queue and returned (as it)**/
    public E dequeue() { 
        E it = null;
        if (listSize == 0){
            System.out.println("Queue is empty, cannot dequeue"); //If the size of the queue is 0, let the user know they cannot remove element as queue is empty**/
        }
        else{
            it = listArray[front];
            front = (front+1) % maxSize; // Circular increment
            listSize -= 1;
        }
        return it;
    }
    @Override
    /**@return frontValue which is the front value / first value in the queue (the next element to be dequeued)**/
    public E frontValue() { 
        E frontValue = null;
        if (listSize == 0){
            System.out.println("Queue is empty, does not have front value"); //If the size of the queue is 0, let the user know thre is no front value to find as queue is empty**/
        }
        else{
            frontValue = listArray[front];
        }
        return frontValue;
    }
    @Override
    /**@return length of the queue**/
    public int length(){ // Return length
        return listSize;
    }
    /**@return index of the front element * NOT VALUE **/
    public int frontIndex(){
        return front;
    }
    /**@return index of the rear element * NOT VALUE**/
    public int rearIndex(){
        return rear;
    }
}


