package Binarytree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.populate(scanner);
        binaryTree.prettyDisplay();
        ArrayList<Integer> ans = new ArrayList<>();
        ans = binaryTree.verticalOrderTraversal();

        System.out.println(ans);


    }
}
