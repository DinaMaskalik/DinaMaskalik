package task1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainCreation {
    public static void main(String[] args) throws IOException {

        Student[] students =new Student[10];

        for (int i = 0; i < students.length; i++) {
            students[i]=new Student(getName(), getStudentPassword());
        }

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Student.txt"));

        /**
         *  first variant output
         */
//        for (int i = 0; i <students.length ; i++) {
//            out.writeObject(students[i]);
//            System.out.println(students[i]);
//        }

        /**
        * second variant
        */
        out.writeObject(students);

        out.close();
    }

    public static String getName() {

        String letters = "QWERTYUIOPASDFGHJKLZXCVBNM";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            builder.append(letters.charAt((int) (Math.random() * 25)));
        }

        return builder.toString();
    }

    public static String getStudentPassword() {
        String letters = "0123456789";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            builder.append(letters.charAt((int) (Math.random() * 9)));
        }

        return builder.toString();
    }

}
