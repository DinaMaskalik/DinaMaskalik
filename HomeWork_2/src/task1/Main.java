package task1;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        int[] array2 = new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5};
        int[] array3 = new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5};
        int[] array4 = new int[]{10};
        int[] array5 = new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1};
        int[] array6 = new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10};

        Array mas = new Array();
        mas.setArray(array1);
        mas.print();
        System.out.println();
//        Arrays.sort(array4);
//        for (int i = 0; i < array4.length; i++) {
//            System.out.print(array4[i]+"  ");
//        }
        System.out.println( mas.searchNumber());
        Array mas1=new Array(array2);
        mas1.print();
        mas1.searchNumber();
        System.out.println();
        System.out.println(mas1.searchNumber());

    }
}
