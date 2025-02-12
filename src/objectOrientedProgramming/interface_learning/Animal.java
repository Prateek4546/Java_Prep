package objectOrientedProgramming.interface_learning;

public interface Animal {
      int count = 5;
      void hello();
      void sound();
      public static void countNo(){
          System.out.println("I am static method , and here is Count -: "+ count );
      }

     default void sayHello(){
         System.out.println("Hello from interface");
     }
}
