package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node {

        private Node root;
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

    public int getRoot() {
        return root.value;
    }

    public void setRoot(Node node) {

            if (this.root == null) {
                this.root = node;
                this.left = null;
                this.right = null;
            }
            else {
                System.out.println("Корневой узел уже создан");
            }
        }

        // Метод, добавляющий новый узел
        public void addNode(Node node) {

            if (root == null) {
                setRoot(node);
            }

            Node currentNode = root;

            while (true) {

                Node step = stepNode(node, currentNode);

                if (step == currentNode.right) {
                    currentNode = currentNode.right;
                } else if (step == currentNode.left){
                    currentNode = currentNode.left;
                } else if (step == node) {
                    if ((isNewNodeMoreOrSameThanCurrentNode(node, currentNode) == true) &&
                            (isCurrentNodeHasRightHeir(currentNode) == false)) {
                        currentNode.right = node;
                        break;
                    } else if ((isNewNodeMoreOrSameThanCurrentNode(node, currentNode) == false) &&
                            (isCurrentNodeHasLeftHeir(currentNode) == false)) {
                        currentNode.left = node;
                        break;
                    }
                }
            }

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

        public String sortNodes() {

            Integer[] arrayOfData = {root.value};
            String stringOfData;

            if (left != null) {
                append(arrayOfData, left.value);
            }
            if (right != null) {
                append(arrayOfData, right.value);
            }
            Arrays.sort(arrayOfData);
            stringOfData = Arrays.toString(arrayOfData);

            return stringOfData;
        }

        // Метод, сравнивающий новый узел и текущий
        private boolean isNewNodeMoreOrSameThanCurrentNode(Node newNode, Node currentNode){

            boolean answer = newNode.value >= currentNode.value;

            return answer;
        }

        // Метод, проверяющий наличие правого наследника
        private boolean isCurrentNodeHasRightHeir(Node currentNode) {

            boolean answer = currentNode.right != null;

            return answer;
        }

        // Метод, проверяющий левого наследника
        private boolean isCurrentNodeHasLeftHeir(Node currentNode) {

            boolean answer = currentNode.left != null;

            return answer;
        }

        // Вспомогательный метод, возвращающий текущий узел во время проверки
        private Node stepNode(Node newNode, Node currentNode) {

            if (isNewNodeMoreOrSameThanCurrentNode(newNode, currentNode) == true){
                if (isCurrentNodeHasRightHeir(currentNode) == true) {
                    return currentNode.right;
                } else {
                    return newNode;
                }
            } else {
                if (isCurrentNodeHasLeftHeir(currentNode) == true) {
                    return currentNode.left;
                } else {
                    return newNode;
                }
            }
        }

        // Вспомогательный метод, добавляющий в массив дополнительный элемент
        private static Integer[] append(Integer[] arr, int element){

            List<Integer> list = new ArrayList<>(Arrays.asList(arr));
            list.add(element);

            return list.toArray(new Integer[0]);
        }
}
