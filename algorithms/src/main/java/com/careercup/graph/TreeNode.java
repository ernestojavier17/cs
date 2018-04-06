package com.careercup.graph;

public class TreeNode {

    public int data;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
    }

    public void addLeftNode(TreeNode left) {
        this.left = left;
    }

    public void addRightNode(TreeNode right) {
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    /**
     * Create a Binary Search Tree. Given a sorted (increasing order) array with unique integer elements, write an algo-
     * rithm to create a binary search tree with minimal height.
     */
    public static TreeNode createMinimalBST(int[] array) {
        int middle = array.length / 2;

        return createMinimalBST(array, 0, array.length -1);
    }

    static TreeNode createMinimalBST(int[] array, int low, int high) {
        if(low > high) {
            return null;
        }
        int middle = (high + low) / 2;
        TreeNode node = new TreeNode(array[middle]);
        node.addLeftNode(createMinimalBST(array, low, middle -1));
        node.addRightNode(createMinimalBST(array, middle + 1, high));

        return node;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // We needed this code for other files, so check out the code in the library
        TreeNode root = TreeNode.createMinimalBST(array);
        System.out.print(root.data);
    }
}
