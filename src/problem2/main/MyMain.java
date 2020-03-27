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
    }
}