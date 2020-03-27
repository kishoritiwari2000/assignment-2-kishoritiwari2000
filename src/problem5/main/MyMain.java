/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.ArrayList;

//executable class
public class MyMain {
    public static void main(String[] args) {
        //creating and inputting a list of students using arraylist
        ArrayList<Student> studentsList = new ArrayList<Student>();
        studentsList.add(new Student(1, "Kishori", 1, 0));
        studentsList.add(new Student(2, "Rajni", 1, 0));
        studentsList.add(new Student(3, "Roshni", 2, 2));
        studentsList.add(new Student(4, "Unnati", 1, 1));
        studentsList.add(new Student(5, "Nandinee", 0, 0));
        studentsList.add(new Student(6, "Saumya", 2, 1));
        //making a queue
        MyCircularQueue stuQueue = new MyCircularQueue();
        stuQueue.enQueueMethod(studentsList);
        //to print the queue
        //output should be ---->>  Kishori,Rajni,Saumya
        stuQueue.printQueue();

    }
}
