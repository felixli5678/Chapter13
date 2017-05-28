/**
 * Created by felixli on 5/28/17.
 */

import java.util.*;
public class IdNumComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2) {
            for (int i = 0; i < s1.getIdNum().length(); i++) {
                if (((int) s1.getIdNum().charAt(i)) != ((int) s2.getIdNum().charAt(i))) {
                    return ((int) s1.getIdNum().charAt(i)) - ((int) s2.getIdNum().charAt(i));
                }
            }
            return 0;
    }
}
