/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(5);
        tree.insert(11);
        tree.insert(15);
        tree.insert(92);
        tree.insert(27);
        tree.insert(39);
        tree.insert(35);
        tree.preVSpost();
    }
}
