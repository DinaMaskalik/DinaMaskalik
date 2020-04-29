package task1;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private String password;

    public Student(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
