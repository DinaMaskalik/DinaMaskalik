package task1;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<E> {

    private E[] data;

    public DataContainer(E[] item) {
        this.data = item;
    }

    public void add(E item) {

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return;
            }
        }

        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = item;
    }

//    public static <E> void sort(/*DataContainer<E> item,*/ Comparator<E> comparator) {
//
//        E e;
//        E[] data =(static) this.data.getData();
//
//        for (int i = 0; i < data.length - 1; i++) {
//            for (int j = i + 1; j < data.length; j++) {
//                if (comparator.compare(data[i], data[j]) == -1) {
//                    e = data[j];
//                    data[j] = data[i];
//                    data[i] = e;
//                } else continue;
//            }
//
//        }
//    }

    public static <E> void sort(DataContainer<E> item, Comparator<E> comparator) {

        E e;
        E[] data = item.getData();

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i; j <data.length ; j++) {
                if (comparator.compare(data[i], data[j]) == -1) {
                    e = data[j];
                    data[j] = data[i];
                    data[i] = e;
                } else continue;
            }
        }

    }


    public void delete(int index) {

        if (index > 0 && index < data.length) {
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            data = Arrays.copyOf(data, data.length - 1);
        } else {
            System.out.println("Index is out of array's bounds");
        }
    }

    public void delete(E item) {

        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)) {
                delete(i);
                return;
            }
        }

        System.out.println("Element is not found");

    }

    public E[] getData() {
        return data;
    }
}
