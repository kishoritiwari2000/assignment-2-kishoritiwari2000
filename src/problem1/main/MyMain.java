/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        //creating binary search tree ::
        tree.insert(5);
        tree.insert(10);
        tree.insert(20);
        tree.insert(4);
        tree.insert(15);
        tree.insert(6);
        tree.insert(25);

        System.out.println("ALL LEFT NODES:-");
        tree.printLeftNode();

        System.out.println("Count Of Nodes not having left node");
        tree.countNotLeft();
    }
}
