package Classes.PE4;

public class Student{


    public int id;
    public String name;
    public int age;

    Student(int a , String name, int age){
        this.id = a;
        this.name = name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
