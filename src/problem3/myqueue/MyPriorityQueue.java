/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    Node head;

    public MyPriorityQueue() {
        head = null;
    }

    public void insert(int rollNumber, String name) {
        Node node = new Node();
        node.setName(name);
        node.setRollNumber(rollNumber);
        Node temp = head;
        if (head == null) {
            head = node;
        } else {
            if (head.getRollNumber() > rollNumber) {
                node.setNext(head);
                head = temp;
            } else {
                while (temp.getNext() != null && temp.getNext().getRollNumber() < rollNumber) {
                    temp = temp.getNext();
                }
                node.setNext(temp.getNext());
                temp.setNext(node);
            }
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getRollNumber() + "\t" + temp.getName());
            temp = temp.getNext();
        }
    }

}

