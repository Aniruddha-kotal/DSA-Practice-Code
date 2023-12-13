package Binarytree;

import java.util.*;

public class BinaryTree {

    public BinaryTree(){

    }
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Insert Elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to insert left of " + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of to the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to insert right of " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of to the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }

    }

    public void display (){
        display(this.root, "");
    }
    private void display(Node node, String indent){
        if (node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right,indent + "\t");
    }
    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node,int level){
        if (node == null){
            return;
        }

        prettyDisplay(node.right, level + 1);

        if(level != 0){
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|----->" + node.value);
        }else {
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level + 1);
    }
    static class Pair{
        int hd;
        Node node;

        public Pair(int hd, Node node){
            this.hd = hd;
            this.node = node;
        }
    }
    public ArrayList<Integer> verticalOrderTraversal(){
        return verticalOrderTraversal(root);
    }


    private ArrayList<Integer> verticalOrderTraversal(Node root)
    {
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();

        q.add(new Pair(0, root));
        while(!q.isEmpty()){
            Pair cur = q.poll();
            if(map.containsKey(cur.hd)){

                map.get(cur.hd).add(cur.node.value);
            }else{
                ArrayList<Integer> temp = new ArrayList<>();

                temp.add(cur.node.value);
                map.put(cur.hd, temp);
            }

            // normal level order traversal
            if(cur.node.left != null){
                q.add(new Pair(cur.hd - 1, cur.node.left));
            }
            if(cur.node.right != null){
                q.add(new Pair(cur.hd + 1, cur.node.right));
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()){
            ans.addAll(entry.getValue());
        }
        return ans;
    }
}
