package day10;

import com.sun.source.tree.BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Node binaryTree = new Node();
        Node root = new Node(20);

        binaryTree.setRoot(root);
        binaryTree.addValueInArray(0, 20);

        binaryTree.addNode(14, root);
        binaryTree.addValueInArray(1, 14);

        binaryTree.addNode(11, root);
        binaryTree.addValueInArray(2, 11);

        binaryTree.addNode(5, root);
        binaryTree.addValueInArray(3, 11);

        binaryTree.addNode(8, root);
        binaryTree.addValueInArray(4,8);

        binaryTree.addNode(16, root);
        binaryTree.addValueInArray(5,16);

        binaryTree.addNode(15, root);
        binaryTree.addValueInArray(6,15);

        binaryTree.addNode(18, root);
        binaryTree.addValueInArray(7,18);

        binaryTree.addNode(23, root);
        binaryTree.addValueInArray(8,23);

        binaryTree.addNode(22, root);
        binaryTree.addValueInArray(9,22);

        binaryTree.addNode(27, root);
        binaryTree.addValueInArray(10,27);

        binaryTree.addNode(24, root);
        binaryTree.addValueInArray(11,24);

        binaryTree.addNode(150, root);
        binaryTree.addValueInArray(12,150);

        binaryTree.sortNodes();















    }
}

