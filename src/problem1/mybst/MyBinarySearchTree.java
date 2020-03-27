/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    public static StringBuilder preOrderString;
    static int treeLevel = 0;
    public TreeNode root;

    public MyBinarySearchTree() {
        this.root = root;
        preOrderString = new StringBuilder();
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrderString.append(root.getValue() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getValue() + " ");
    }

    public void add(final int treeValue) {
        this.root = addValue(this.root, treeValue);
    }

    public TreeNode addValue(final TreeNode treeRoot, final int addingValue) {
        if (treeRoot == null) {
            return new TreeNode(addingValue);
        }
        if (addingValue < treeRoot.getValue()) {
            treeRoot.setLeft(addValue(treeRoot.getLeft(), addingValue));
        } else if (addingValue == treeRoot.getValue()) {
            return treeRoot;
        } else {
            treeRoot.setRight(addValue(treeRoot.getRight(), addingValue));
        }
        return treeRoot;
    }
}
