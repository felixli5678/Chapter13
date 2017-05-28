/**
 * Created by felixli on 5/28/17.
 */

import java.util.*;
public class AverageComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return (int) (s1.getAverage() - s2.getAverage());
    }
}
