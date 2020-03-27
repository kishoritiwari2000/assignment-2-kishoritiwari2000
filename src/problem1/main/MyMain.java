/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree tree = new MyBinarySearchTree();
        //creating binary search tree ::
        int i = 7;
        System.out.println("Enter values");
        //taking values as input for tree
        while (i > 0) {
            tree.add(sc.nextInt());
            i--;
        }
        /*tree will look alike::
                         4
                       /   \
                      2     6
                    /  \   /  \
                   1    3 5    7
         */

    }
}
