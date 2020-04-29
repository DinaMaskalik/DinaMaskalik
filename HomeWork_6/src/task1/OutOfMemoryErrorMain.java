package task1;

public class OutOfMemoryErrorMain {
    public static void main(String[] args) {
        int i = 0;

        try {
            String[] str = new String[800000000];
            while (true) {
                str[i] = "Hello!! Hello!!";
                i++;
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory error");
        }
    }

}