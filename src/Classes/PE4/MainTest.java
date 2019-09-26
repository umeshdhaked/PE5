package Classes.PE4;

import java.util.*;

public class MainTest {
public void method(){

    List<Student> obj = new ArrayList<>();

    obj.add( new Student(1,"aman1",21));
    obj.add(new Student(2,"aman4",22));
    obj.add(new Student(3,"aman2",23));
    obj.add(new Student(4,"aman5",21));
    obj.add(new Student(5,"aman3",25));

    System.out.println("Original : \n");
    for (int i=0;i<obj.size();i++)
    System.out.println(obj.get(i).getName()+" "+obj.get(i).getAge());

    System.out.println("Sort By Age :\n");

    Collections.sort(obj,new StudentSorter());


    for (int i=0;i<obj.size();i++)
        System.out.println(obj.get(i).getName()+" "+obj.get(i).getAge());
    System.out.println("Sort by name when Ages are equal\n");

    Collections.sort(obj,new StudentSorter());
    for (int i=0;i<obj.size();i++)
        System.out.println(obj.get(i).getName()+" "+obj.get(i).getAge());


}
}
