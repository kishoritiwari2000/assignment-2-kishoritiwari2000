/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    private Node rear;
    private Node front;
    private int size;

    public MyPriorityQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enQueueMethod(Node addData) {
        if (front == null) {
            rear = addData;
            front = addData;
            size++;
        } else if (addData.getData().getRollNumber() >= this.rear.getData().getRollNumber()) {
            rear.setNext(addData);
            rear = addData;
            size++;
        } else if (addData.getData().getRollNumber() <= this.rear.getData().getRollNumber()) {
            addData.setNext(this.front);
            this.front = addData;
            size++;
        } else {
            Node node = this.front;
            Node nodePrevious = this.front;
            while (node.getNext() != null) {
                if (node.getData().getRollNumber() > addData.getData().getRollNumber()) {
                    break;
                }
                nodePrevious = node;
                node = node.getNext();
            }
            nodePrevious.setNext(addData);
            addData.setNext(node);
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    public void printQueueMethod() {
        Node node = this.front;
        for (int i = 0; i < this.size; i++) {
            if (i != this.size - 1) {
                System.out.print(node.getData().toString() + "--->");
                node = node.getNext();
            } else {
                System.out.println(node.getData().toString());
            }
        }
    }
}

