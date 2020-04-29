package task1;

public class StackOverflowMain {
    public static void main(String[] args) {
        try{
            sum();
        } catch(StackOverflowError e){
            System.out.println("Stack overflow");
        }
    }

    public static void sum(){
        double a=23d;
        double d=56d;
        double s=3d;
        sum();
        return;
    }
}
