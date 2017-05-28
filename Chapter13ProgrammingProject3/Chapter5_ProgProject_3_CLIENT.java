/**
 * Created by felixli on 5/25/17.
 * Pg 868 Chapter 13 Programming Project #3
 * Write a program that processes a data file of students’ course grade data. The data arrive in random order; each line
 * stores information about a student’s last name, first name, student ID number, grade as a percentage, and letter
 * grade. For example, here are a few lines of data:
 * Smith Kelly 438975 98.6 A
 * Johnson Gus 210498 72.4 C
 * Reges Stu 098736 88.2 B
 * Smith Marty 346282 84.1 B
 * Reges Abe 298575 78.3 C
 * Your program should be able to sort the data by any of the columns. Use Comparators to achieve the sort orderings.
 * Make the data sortable by last name, student ID, and grade percentage in ascending and descending order. For example,
 * here are the lines of student data sorted a few different ways:
 * Student data, by last name:
 * Johnson Gus 210498 72.4 C
 * Reges Stu 098736 88.2 B
 * Reges Abe 298575 78.3 C
 * Smith Kelly 438975 98.6 A
 * Smith Marty 346282 84.1 B
 * Student data, by student ID:
 * Reges Stu 098736 88.2 B
 * Johnson Gus 210498 72.4 C
 * Reges Abe 298575 78.3 C
 * Smith Marty 346282 84.1 B
 * Smith Kelly 438975 98.6 A
 */

import java.util.*;
public class Chapter5_ProgProject_3_CLIENT {

        public static void main(String[] args) {
            Student students[] = {
                    new Student("Smith","Kelly","438975",98.6,'A'),
                    new Student("Johnson","Gus","210498",72.4,'C'),
                    new Student("Reges","Stu","098736",88.2,'B'),
                    new Student("Smith","Marty","346282",84.1,'B'),
                    new Student("Reges","Abe","298575",78.3, 'C')
            };

            System.out.println("Programming Project Chapter 5 #3:");
            System.out.println("================================= \n");

            // students list as is
            System.out.print(" students list (original): ");
            System.out.print("[");
            for (int i = 0; i < students.length - 1; i++)
                System.out.print(students[i] + ", ");
            System.out.println(students[students.length - 1]+"]");
            System.out.println();

            // students list by lastName
            Arrays.sort(students, new LastNameComparator());
            System.out.print(" students list (LastNameComparator): ");
            System.out.print("[");
            for (int i = 0; i < students.length - 1; i++)
                System.out.print(students[i] + ", ");
            System.out.println(students[students.length - 1]+"]");
            System.out.println();

            // students list by firstName
            Arrays.sort(students, new FirstNameComparator());
            System.out.print(" students list (FirstNameComparator): ");
            System.out.print("[");
            for (int i = 0; i < students.length - 1; i++)
                System.out.print(students[i] + ", ");
            System.out.println(students[students.length - 1]+"]");
            System.out.println();

            // students list by idNum
            Arrays.sort(students, new IdNumComparator());
            System.out.print(" students list (IdNumComparator): ");
            System.out.print("[");
            for (int i = 0; i < students.length - 1; i++)
                System.out.print(students[i] + ", ");
            System.out.println(students[students.length - 1]+"]");
            System.out.println();

            // students list by average
            Arrays.sort(students, new AverageComparator());
            System.out.print(" students list (AverageComparator): ");
            System.out.print("[");
            for (int i = 0; i < students.length - 1; i++)
                System.out.print(students[i] + ", ");
            System.out.println(students[students.length - 1]+"]");
            System.out.println();

            // students list by letterGrade
            Arrays.sort(students, new LetterGradeComparator());
            System.out.print(" students list (LetterGradeComparator): ");
            System.out.print("[");
            for (int i = 0; i < students.length - 1; i++)
                System.out.print(students[i] + ", ");
            System.out.println(students[students.length - 1]+"]");
            System.out.println();
        } // main
}  // Chapter5_ProgProject_3