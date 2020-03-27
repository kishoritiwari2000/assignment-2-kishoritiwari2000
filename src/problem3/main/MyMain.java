/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue();

        //now adding students to the queue using insert method
        myPriorityQueue.insert(29, "Kishori");
        myPriorityQueue.insert(51, "Roshni");
        myPriorityQueue.insert(46, "Rajni");
        myPriorityQueue.insert(40, "Nandinee");

        myPriorityQueue.display();
        // this will print the students details in an ascending order of their roll numbers
    }
}
