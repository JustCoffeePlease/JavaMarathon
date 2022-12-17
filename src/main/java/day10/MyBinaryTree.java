package day10;

import com.sun.source.tree.BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyBinaryTree {

    public static void main(String[] args) {

        Node tree = new Node(20);

        tree.addNode(new Node(14));
//        tree.addNode(new Node(23));



        System.out.println(tree.sortNodes());



    }
}

