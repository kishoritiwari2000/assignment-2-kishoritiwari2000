/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree tree = new MyBinarySearchTree();
        //taking some input values to make a tree.
        int i = 7;
        while (i > 0) {
            tree.add(sc.nextInt());
            i--;
        }
        /*it will make a tree in a pattern having i number of nodes like::
                         4
                       /   \
                      2     6
                    /  \   /  \
                   1    3 5    7
         */
        tree.preOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
        /*
        at input.....
        7 5 4 3 2 6 1
        we get output....
        1 2 3 4 6 5 7
        Hence, this shows that a is correct statement and b is wrong.
         */
    }
}