package Binarytree.BinarySearchTree;

import Binarytree.BinaryTree;
import org.w3c.dom.Node;

import java.util.*;

public class BST {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }
    private Node root;

    public BST() {

    }

//    public int height(Node node){
//        if(node == null){
//            return -1;
//        }
//        return node.height;
//    }

    public boolean isEmpty(){
        return root == null;
    }
    public void populate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            this.insert(arr[i]);
        }
    }

    public void populateSorted(int[] arr){
        populateSorted(arr,0,arr.length);
    }
    private void populateSorted(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int mid = (start + end)/2;

        this.insert(arr[mid]);
        populateSorted(arr,start,mid);
        populateSorted(arr,mid +1,end);
    }

    public void insert(int value){
        root= insert(value,root);
    }
    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value,node.left);
        }
        if(value > node.value) {
            node.right = insert(value,node.right);
        }
        node.height = Math.max(height(node.left),height(node.right)) + 1;

        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(this.root,"Root Node : ");
    }
    private void display(Node node, String details) {
        if(node == null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left, " left child of " + node.value + " : ");
        display(node.right, " right child of " + node.value + " : ");
    }

    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level){
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
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(){
        preOrder(root);
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);

    }
    public ArrayList<Integer> inOrderByStack(){
        return inOrderByStack(root);
    }
    private ArrayList<Integer> inOrderByStack(Node node){
        ArrayList<Integer> ans = new ArrayList<>();

        Stack<Node> st = new Stack<>();

        while(true){
            if(node != null){
                st.push(node);
                node = node.left;
            }
            else {
                if(st.isEmpty()) break;
                node = st.peek();
                st.pop();
                ans.add(node.value);
                node = node.right;
            }
        }
        return ans;
    }

    public void postOrder(){
        preOrder(root);
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }

        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.value + " ");
    }
    public void levelOrder(){
        levelOrder(root);
    }

    private void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else {
                System.out.print(currNode.value + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public int countOfNodes(){
        int count = countOfNodes(root);
        return count;
    }

    private int countOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    public int SumOfNodes(){
        int sum = SumOfNodes(root);
        return sum;
    }
    private int SumOfNodes(Node node){
        if(node == null){
            return 0;
        }

        int leftSum = SumOfNodes(node.left);
        int rightSum = SumOfNodes(node.right);

        return leftSum + rightSum + node.value;
    }

    public int height(){
        int height = height(root);
        return height;
    }

    private int height(Node node){
        if(node == null){
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int myHeight = Math.max(leftHeight,rightHeight) + 1;

        return myHeight;
    }
    public int diameter(){
        int diameter = diameter(root);
        return diameter;
    }

    private int diameter(Node node){
        if(node == null){
            return 0;
        }

        int diam1 = diameter(node.left);
        int diam2 = diameter(node.right);
        int diam3 = height(node.left) + height(node.right) + 1;

        return Math.max(diam3, Math.max(diam1,diam2));
    }

    class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public TreeInfo diameter2(){
        return diameter2(root);
    }

    public TreeInfo diameter2(Node root){
        if(root == null){
             return new TreeInfo(0,0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht , right.ht)  + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(Math.max(diam1,diam2),diam3);

        TreeInfo myinfo = new TreeInfo(myHeight, myDiam);
        return myinfo;
    }
    public boolean search(int key){
        return search(root,key);
    }

    private boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(key > root.value) {
            return search(root.right,key);
        } else if (key < root.value) {
            return search(root.left,key);
        }else{
            return true;
        }
    }
    public Node delete(int val){
        return delete(root, val);
    }

    public Node delete(Node root, int val){
        if(root.value > val){
            root.left = delete(root.left, val);
        }
        else if(root.value < val){
            root.right = delete(root.right,val);
        }
        else { // root.value == val
            //case 1
            if(root.left == null && root.right == null){
                return null;
            }
             // case 2
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //case 3
            Node IS = inOrderSuccessor(root.right);
            root.value = IS.value;
            root.right = delete(root.right, IS.value);

        }
        return root;
    }
    public Node inOrderSuccessor(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }
    public void printInRange(int X,int Y){
        printInRange(root,X,Y);
    }

    private void printInRange(Node root, int X, int Y){
        if(root == null){
            return;
        }
        if(root.value >= X && root.value <= Y){
            printInRange(root.left, X, Y);
            System.out.print(root.value + " ");
            printInRange(root.right, X ,Y);
        }
        else if(root.value >= Y){
            printInRange(root.left,X,Y);
        }
        else {
            printInRange(root.right,X,Y);
        }
    }
    public void printRoot2Leaf(){
        printRoot2Leaf(root,new ArrayList<>());
    }

    private void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.value);
        //leaf nodes
        if(root.left == null && root.right == null){
            printPath(path);
        }else { // non leaf nodes
            printRoot2Leaf(root.left,path);
            printRoot2Leaf(root.right, path);
        }

        path.remove(path.size() - 1);
    }

    private void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println();
    }
    public List<Integer> zigZagTraversal(){
        return zigZagTraversal(root);
    }

    private List<Integer> zigZagTraversal(Node root) {
        List<Integer> ans = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<>();
        if (root == null) return ans;

        q.add(root);
        boolean leftRight = true;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node currNode = q.peek();
                q.poll();
                if (currNode.left != null) q.add(currNode.left);
                if (currNode.right != null) q.add(currNode.right);
                temp.add(currNode.value);
            }
            // if(leftRight == true){

            // }
            if (!leftRight) {
                Collections.reverse(temp);
            }
            for (int i = 0; i < temp.size(); i++) {
                ans.add(temp.get(i));
            }

            leftRight = !leftRight;


        }

        return ans;
    }
    public int kthSmallest(int k){
        return kthSmallest(root,k);
    }

    private int kthSmallest(Node root, int k)
    {

        int p=k;
        k=p;
        Node small=kthsmallest(root,new int[]{k});
        if(small ==null){
            return -1;
        }else{
            return small.value;
        }
    }
    private Node kthsmallest(Node root,int k[])
    {
        if(root==null)
            return null;

        Node left=kthsmallest(root.left,k);
        if(left!=null)
            return left;
        k[0]--;
        if(k[0]==0)
            return root;

        return kthsmallest(root.right,k);
    }

}
