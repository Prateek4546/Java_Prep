package objectOrientedProgramming.abstraction;

public abstract  class Parent {

    abstract String career(String careerName);
      static  void  greeting(){
          System.out.println("Hello From parent class");
      }
}

/*
* First rule is if any class contains abstract method then class should also be abstract
* we can not create object of an abstract class
* we can not create abstract static method , we can create static method in abstract class
* we can have constructor in  abstract class
* */
