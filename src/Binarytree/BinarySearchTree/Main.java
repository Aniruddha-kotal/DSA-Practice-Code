package Binarytree.BinarySearchTree;

import Binarytree.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        BST tree = new BST();
        int[] arr = {10 ,5, 15 ,4 ,7, 14 ,16};
        tree.populate(arr);
        tree.prettyDisplay();

        System.out.println(tree.kthSmallest(5));



    }
}
