/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    private String name;
    private int rollNumber;
    private int backLogCounter;
    private int appearingCount;

    public Student(int rollNumber, String Name) {
        this.rollNumber = rollNumber;
        name = Name;
    }

    public Student(int rollNumber, String Name, int backLogCounter, int appearingCount) {
        this.rollNumber = rollNumber;
        name = Name;
        this.backLogCounter = backLogCounter;
        this.appearingCount = appearingCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getBackLogCounter() {
        return backLogCounter;
    }

    public void setBackLogCounter(int backLogCounter) {
        this.backLogCounter = backLogCounter;
    }

    public int getAppearingCount() {
        return appearingCount;
    }

    public void setAppearingCount(int appearingCount) {
        this.appearingCount = appearingCount;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNumber=" + rollNumber + ", name='" + name + '\'' + '}';
    }

    public String toStrings() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", backLogCounter=" + backLogCounter +
                ", appearingCount=" + appearingCount +
                '}';
    }
}
