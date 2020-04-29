package task1;

import java.io.*;
import java.util.*;

public class MainRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream =new ObjectInputStream(new FileInputStream("Student.txt"));

        List<Student> data = new ArrayList<>();

        /**
         * first variant using with first variant output
         * information with file MainCreation
         */
        data= Arrays.asList((Student[]) inputStream.readObject());

        /**
         * second variant using with second variant output
         * information with file MainCreation
         */
//        while (true) {
//            try {
//                data.add((Student) inputStream.readObject());
//            } catch (EOFException | ClassNotFoundException e) {
//                break;
//            }
//        }


        inputStream.close();

        System.out.println("List:");
        System.out.println(data);

        Collections.sort(data, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("\nSorting List:");
        System.out.println(data);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Student1.txt"));

        /**
         * first variant output information
          */
        Iterator<Student> iterator = data.iterator();
        while (iterator.hasNext()){
            out.writeUTF(iterator.next().toString());
        }

        /**
         * second variant output information
         */
//        for (Student student : data) {
//            out.writeUTF(student.toString());
//        }

        /**
         *  using method writeBytes
         */
//        for (Student student : data) {
//            out.writeBytes(student.toString());
//        }

        /**
         *  using method writeChars
         */
//        for (Student student : data) {
//            out.writeChars(student.toString());
//        }

        out.close();

        /**
         * input information from file Student1.txt
         */
//        List<String> data1 = new ArrayList<>();
//        ObjectInputStream inputStream1 =new ObjectInputStream(new FileInputStream("Student1.txt"));
//
//        while (inputStream1.available()!=0) {
//            data1.add(inputStream1.readUTF());
//        }
//
//        inputStream1.close();
//
//        System.out.print(data1);

    }
}
