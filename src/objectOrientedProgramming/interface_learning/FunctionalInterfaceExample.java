package objectOrientedProgramming.interface_learning;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Cal cal = (int a , int b) -> System.out.println("Toatal sum is == >> "+a+b);

        cal.sum(2 , 5);
    }
}
