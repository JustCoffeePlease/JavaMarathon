package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node {

    Node root;
    int value; // Значение, которое находится внутри узла
    Node left; // Левый потомок
    Node right; // Правый потомок

    // Пустой конструктор узла
    public Node() {
    }

    // Конструктор узла, имеющего значения и потомков
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

    // Метод добавления корневого узла
    public void setRoot(Node root) {
        this.root = root;
    }

    // Метод, добавляющий новый узел
    public void addNode(int value, Node root) {

        if (this.root.equals(root)) {
            Node stepNode = this.root;
            while (true) {
                // Случай 1: У исследуемого узла значение больше чем вводимое
                //           и нет потомков слева
                if (stepNode.value - value > 0 && stepNode.left == null) {
                    stepNode.left = new Node(value);
                    System.out.println(stepNode.left.value);
                    break;
                }
                // Случай 2: У исследуемого узла значение или равно чем вводимое
                //           и нет потомков справа
                else if (stepNode.value - value <= 0 && stepNode.right == null) {
                    stepNode.right = new Node(value);
                    System.out.println(stepNode.right.value);
                    break;
                }
                // Случай 3: У исследуемого узла значение больше чем вводимое
                //           и есть потомки слева
                else if (stepNode.value - value > 0 && stepNode.left != null) {
                    stepNode = stepNode.left;
                    System.out.println(stepNode.value);
//                    break;
                }
                // Случай 3: У исследуемого узла значение меньше или равно чем вводимое
                //           и есть потомки справа
                else if (stepNode.value - value <= 0 && stepNode.right != null) {
                    stepNode = stepNode.right;
                    System.out.println(stepNode.value);
//                    break;
                }
            }
        } else {
            System.out.println("Что-то не так");
        }

    }

    // Метод, сортирующий данные древа и возвращающий StringBuilder данных
    public void sortNodes() {

        StringBuilder dataList = new StringBuilder(Integer.toString(root.value));

        System.out.println(dataList.toString());
    }

    // Вспомогательный метод, добавляющий в массив дополнительный элемент
    private static Integer[] append(Integer[] arr, int element) {

        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);

        return list.toArray(new Integer[0]);
    }
}
