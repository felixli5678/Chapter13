/**
 * Created by felixli on 5/27/17.
 */

import java.util.*;

public class LastNameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        for (int i = 0; i < s1.getLastName().length(); i++) {
            if (((int) s1.getLastName().charAt(i)) != ((int) s2.getLastName().charAt(i))) {
                return ((int) s1.getLastName().charAt(i)) - ((int) s2.getLastName().charAt(i));
            }
        }
        return 0;
    }
}
