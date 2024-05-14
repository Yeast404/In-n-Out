/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqueue;

/**
*
* @author myriambayen
*/
public class TestHarness {
    public static void main(String[] args) {
        AQueue<Integer> queue = new AQueue<Integer>(5);
        
        System.out.println("Front value:" + queue.frontValue() + "\n");
        System.out.println("Value just dequeued:" + queue.dequeue() + "\n");
        
        System.out.println("Front Index:" + queue.frontIndex());
        System.out.println("Rear Index:" + queue.rearIndex());
        System.out.println("Size:" + queue.length()+ "\n");
        
        System.out.println("Enqueueing: 1");
        queue.enqueue(1);
        System.out.println("Front Index:" + queue.frontIndex());
        System.out.println("Rear Index:" + queue.rearIndex());
        System.out.println("Size:" + queue.length()+ "\n");
        
        
        System.out.println("Enqueueing: 2");
        queue.enqueue(2);
        System.out.println("Front Index:" + queue.frontIndex());
        System.out.println("Rear Index:" + queue.rearIndex());
        System.out.println("Size:" + queue.length()+ "\n");
        
        
        System.out.println("Enqueueing: 3");
        queue.enqueue(3);
        System.out.println("Front Index:" + queue.frontIndex());
        System.out.println("Rear Index:" + queue.rearIndex());
        System.out.println("Size:" + queue.length()+ "\n");
        
        
        System.out.println("Enqueueing: 4");
        queue.enqueue(4);
        System.out.println("Front Index:" + queue.frontIndex());
        System.out.println("Rear Index:" + queue.rearIndex());
        System.out.println("Size:" + queue.length()+ "\n");
        
        
        System.out.println("Enqueueing: 5");
        queue.enqueue(5);
        System.out.println("Front Index:" + queue.frontIndex());
        System.out.println("Rear Index:" + queue.rearIndex());
        System.out.println("Size:" + queue.length()+ "\n");
        
        
        System.out.println("Enqueueing: 6");
        queue.enqueue(6);
        System.out.println("Front Index:" + queue.frontIndex());
        System.out.println("Rear Index:" + queue.rearIndex());
        System.out.println("Size:" + queue.length()+ "\n");
        
        
        
        
        
        
        System.out.println("Front value:" + queue.frontValue());
        System.out.println("Value just dequeued:" + queue.dequeue());
        System.out.println("Front value:" + queue.frontValue()+ "\n");
        
        System.out.println("Front value:" + queue.frontValue());
        System.out.println("Value just dequeued:" + queue.dequeue());
        System.out.println("Front value:" + queue.frontValue()+ "\n");
        
        
        System.out.println("Front value:" + queue.frontValue());
        System.out.println("Value just dequeued:" + queue.dequeue());
        System.out.println("Front value:" + queue.frontValue()+ "\n");
        
        
        System.out.println("Front value:" + queue.frontValue());
        System.out.println("Value just dequeued:" + queue.dequeue());
        System.out.println("Front value:" + queue.frontValue()+ "\n");
        
        
        System.out.println("Front value:" + queue.frontValue());
        System.out.println("Value just dequeued:" + queue.dequeue());
        System.out.println("Front value:" + queue.frontValue()+ "\n");
        
        
        System.out.println("Front value:" + queue.frontValue());
        System.out.println("Value just dequeued:" + queue.dequeue());
        
    }
}
