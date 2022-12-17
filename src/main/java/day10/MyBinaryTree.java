package day10;

import com.sun.source.tree.BinaryTree;

public class MyBinaryTree {

    public static void main(String[] args) {
        Node root = new Node(20,
                new Node(14,
                        new Node(11,
                                new Node(5,
                                        null,
                                        new Node(8)),
                                null),
                        new Node(16)),
                new Node(23,
                        new Node(22),
                        new Node(27,
                                new Node(24),
                                new Node(150))));

        System.out.println("Сумма узлов в дереве: " + root.nodeSum());
    }

    static class Node {

        int value; // Значение, которое находится внутри узла
        Node left; // Левый потомок
        Node right; // Правый потомок

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        // Конструктор узла, не имеющего потомков
        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        // Метод суммирующий значение узла и его потомков
        public int nodeSum() {

            int sum = value;

            if(left != null) {
                sum += left.nodeSum();
            }

            if(right != null) {
                sum += right.nodeSum();
            }

            return sum;
        }
    }
}

