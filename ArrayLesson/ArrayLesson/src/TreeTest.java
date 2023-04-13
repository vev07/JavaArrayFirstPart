import StackTest.SimpleQueue;
import StackTest.SimpleStack;

public class TreeTest {
    public static void main(String[] args) {
        Tree root = new Tree(20,
                new Tree(7,
                        new Tree(4, null, new Tree(6)), new Tree(9)),
                        new Tree(35,
                                new Tree(31, new Tree(28), null),
                                new Tree(40, new Tree(38), new Tree(52))));

//        System.out.println(root.sum());
//        System.out.println(Tree.sumDeep(root));
        System.out.println(Tree.sumWide(root));

    }



    static class Tree {
        int value;
        Tree left;
        Tree right;


        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
        public Tree(int value) {
            this.value = value;
        }
        public int sum() {
            int summ = value;
            if (left != null) {
                summ += left.sum();
            }
            if (right != null) {
                summ += right.sum();
            }
            return  summ;
        }
        public static int sumDeep(Tree root) {
            SimpleStack<Tree> stack = new SimpleStack<Tree>();
            stack.push(root);
            int summ = 0;

            while (!stack.isEmpty()) {
                Tree node = stack.pop();
                System.out.println(node.value);
                summ += node.value;

                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
            }
            return summ;
        }
        public static int sumWide(Tree root) {
            SimpleQueue<Tree> stack = new SimpleQueue<Tree>();
            stack.add(root);
            int summ = 0;

            while (!stack.isEmpty()) {
                Tree node = stack.remove();
                System.out.println(node.value);
                summ += node.value;

                if (node.right != null) {
                    stack.add(node.right);
                }
                if (node.left != null) {
                    stack.add(node.left);
                }
            }
            return summ;
        }
    }
}
