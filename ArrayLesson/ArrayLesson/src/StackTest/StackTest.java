package StackTest;

public class StackTest {
    public static void main(String[] args) {
        testQueue();
        //testStack();
    }
    private static void testQueue() {
        SimpleQueue<Integer> queue = new SimpleQueue<Integer>();
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            queue.add(i);
        }
        System.out.println("\n");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
    private static void testStack() {
        SimpleStack<Integer> queue = new SimpleStack<Integer>();
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            queue.push(i);
        }
        System.out.println("\n");
        while (!queue.isEmpty()) {
            System.out.println(queue.pop());
        }
    }
}
