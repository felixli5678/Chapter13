/**
 * Created by felixli on 5/26/17.
 */
public class Student {
    private String lastName;
    private String firstName;
    private String idNum;
    private double average;
    private char letterGrade;

    public Student() {

    }

    public Student(String lastName, String firstName, String idNum, double average, char letterGrade) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.idNum = idNum;
        this.average = average;
        this.letterGrade = letterGrade;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getIdNum() {
        return idNum;
    }

    public double getAverage() {
        return average;
    }

    public char getLetterGrade() {
        return letterGrade;
    }

    public String toString() {
        System.out.println();
        return lastName+ ", " + firstName + ", " + idNum + ", " + average + ", " + letterGrade;
    }
}

// "Johnson","Gus","210498",72.4,'C'