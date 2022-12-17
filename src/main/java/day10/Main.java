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

        binaryTree.addNode(14, root);
        binaryTree.addNode(11, root);
        binaryTree.addNode(5, root);
        binaryTree.addNode(8, root);
        binaryTree.addNode(16, root);
        binaryTree.addNode(15, root);
        binaryTree.addNode(18, root);
        binaryTree.addNode(23, root);
        binaryTree.addNode(22, root);
        binaryTree.addNode(27, root);
        binaryTree.addNode(24, root);
        binaryTree.addNode(150, root);

        System.out.println("--------------------------------------------------");
        binaryTree.sortNodes();















    }
}

