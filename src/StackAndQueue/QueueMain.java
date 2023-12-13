package StackAndQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);

        queue.insert(34);
        queue.insert(5);
        queue.insert(18);
        queue.insert(6);
        queue.insert(46);

        queue.display();

        queue.remove();

        queue.display();
    }
}
