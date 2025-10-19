package Java_Collections;
import java.util.LinkedList;
import java.util.Queue;

class CostumerServiceQueue {
    public static void main(String[] args) {

        // Creating a queue to represent customers waiting for service
        Queue<String> customerQueue = new LinkedList<>();


        // Customers arrived and joined the queue
        // The offer() method is used to add items to the back of the queue (enqueue)
        customerQueue.offer("Costumer 1");
        customerQueue.offer("Costumer 2");
        customerQueue.offer("Costumer 3");

        // Displaying the current queue
        System.out.println("Current customer queue: " + customerQueue);

        // Serving the first customer in the queue
        // The poll() method is used to access/delete the first item on the queue (dequeue).

        // To represent that, a variable named "servedCustomer" will be created to store the current customer being "pooled" (served)
        String servedCustomer = customerQueue.poll();

        // The following code will remove ( .pool() ) and diplay the status of the queue.
        System.out.println("Serving custumer: " + servedCustomer);

        System.out.println("Current customer queue: " + customerQueue);

        servedCustomer = customerQueue.poll();

        System.out.println("Serving customer : " + servedCustomer);

        System.out.println("Current customer queue : " + customerQueue);

        servedCustomer = customerQueue.poll();

        System.out.println("Final customer : " + servedCustomer);


    }
}
