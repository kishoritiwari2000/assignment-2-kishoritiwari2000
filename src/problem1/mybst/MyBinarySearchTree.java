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
    public TreeNode root;
    int count;

    public MyBinarySearchTree() {
        root = null;
        count = 0;
    }

    public void insert(int data) {
        TreeNode nd = new TreeNode();
        nd.setData(data);
        if (root == null) {
            root = nd;
        } else {
            TreeNode current = root;
            while (true) {
                if (data > current.getData()) {
                    if (current.getRight() == null) {
                        current.setRight(nd);
                        break;
                    } else {
                        current = current.getRight();
                    }
                } else {
                    if (current.getLeft() == null) {
                        current.setLeft(nd);
                        break;
                    } else {
                        current = current.getLeft();
                    }
                }
            }
        }
    }

    private void LeftNode(TreeNode root) {
        if (root == null) {
            return;
        } else {
            if (root.getLeft() != null) {
                System.out.println(root.getLeft().getData());
            } else {
                count++;
                LeftNode(root.getLeft());
                LeftNode(root.getRight());
            }
        }

    }

    public void printLeftNode() {
        LeftNode(root);
    }

    public void countNotLeft() {
        System.out.println(count);
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.getData() + "\t");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    private void postOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getData() + "\t");
        }
    }

    public void preVSpost() {
        postOrder(root);
        System.out.println();
        preOrder(root);
    }

    public TreeNode getroot() {
        return root;
    }
}
