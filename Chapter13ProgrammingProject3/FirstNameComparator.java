/**
 * Created by felixli on 5/28/17.
 */
import java.util.*;
public class FirstNameComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2) {
        for (int i = 0; i < s1.getFirstName().length(); i++) {
            if (((int) s1.getFirstName().charAt(i)) != ((int) s2.getFirstName().charAt(i))) {
                return ((int) s1.getFirstName().charAt(i)) - ((int) s2.getFirstName().charAt(i));
            }
        }
        return 0;
    }
}
