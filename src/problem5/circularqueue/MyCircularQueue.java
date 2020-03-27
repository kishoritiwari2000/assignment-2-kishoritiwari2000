/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

import java.util.ArrayList;

//to implement circular queue
public class MyCircularQueue {
    private Node front;
    private int size;

    public MyCircularQueue() {
        front = null;
        size = 0;
    }

    public void enQueueMethod(ArrayList<Student> addData) {
        for (Student s : addData) {
            if (s.getBackLogCounter() - s.getAppearingCount() == 0) {
            } else if (s.getBackLogCounter() - s.getAppearingCount() > 0) {
                //enqueing
                Node node = new Node(s);
                if (this.front == null) {
                    front = node;
                    node.setNext(node);
                    size++;
                } else {
                    node.setNext(this.front);
                    Node p = this.front;
                    while (p.getNext() != this.front) {
                        p = p.getNext();
                    }
                    p.setNext(node);
                    front = node;
                    size++;
                }
            } else {
                System.out.println("Invalid Student data.....");
                System.out.println("Please Enter a valid one");
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void printQueue() {
        Node node = this.front;
        for (int i = 0; i < this.size; i++) {
            if (i != this.size - 1) {
                System.out.print(node.getData().toStrings() + "-->");
                node = node.getNext();
            } else {
                System.out.println(node.getData().toStrings());
            }

        }
    }
}