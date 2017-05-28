/**
 * Created by felixli on 5/28/17.
 */

import java.util.*;
public class LetterGradeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return ((int) s1.getLetterGrade()) - ((int) s2.getLetterGrade());
    }
}
