package task1;

import java.util.Arrays;

public class Array {
    int[] array;

    public void setArray(int[] array) {
        this.array = array;
    }

    public Array() {
    }

    public Array(int[] array) {
        this.array = array;
    }

    public int searchNumber() {
        int n = 0;
        int result = 0;
        Arrays.sort(array);
        if (array.length == 1) {
            return array[0];
        }
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1 && n == 0) {
                return array[array.length - 1];
            }
            n++;
            if (array[i] != array[i + 1]) {
                if (n % 2 == 1) {
                    result = array[i];
                    break;
                }
                n = 0;
                continue;
            }
            continue;
        }
        return result;
    }


    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
