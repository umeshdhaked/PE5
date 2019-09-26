package Classes.PE4;

import java.util.Comparator;
import java.util.List;

public class StudentSorter implements Comparator<Student>{

    @Override
    public int compare(Student student, Student t1) {
        return student.age-t1.age;
    }

}

class sortByName implements Comparator<Student>{


    @Override
    public int compare(Student student, Student t1) {
        return student.name.compareTo(t1.name);
    }
}
