package com.careercup.graph;


public class Traversals {

    /**
     * Prints the node current value.
     */
    static void visit(TreeNode node) {
        if(node != null) {
            System.out.println(node.data);
        }
    }

    /**
     * In-order traversal means to "visit" the left branch, then the current node, and finally, the right branch.
     */
    public static void inOrderTraversal(TreeNode node) {
        if(node != null) {
            inOrderTraversal(node.left);
            visit(node);
            inOrderTraversal(node.right);
        }
    }

    /**
     * Pre-order traversal visits the current node before its child nodes (hence the name 'pre-order')
     */
    public static void preOrderTraversal(TreeNode node) {
        if(node != null) {
            visit(node);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    /**
     * Post-order traversal visits the current node after its child nodes (hence the name 'post-order')
     */
    public static void postOrderTraversal(TreeNode node) {
        if(node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            visit(node);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        TreeNode tree = TreeNode.createMinimalBST(array);
        //Traversals.inOrderTraversal(tree);
        //Traversals.preOrderTraversal(tree);
        Traversals.postOrderTraversal(tree);
    }
}
