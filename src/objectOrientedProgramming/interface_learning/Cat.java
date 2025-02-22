package objectOrientedProgramming.interface_learning;

public class Cat implements  Anima , Animal{

     final int a = 10;
      int aa =20;
    @Override
    public void greeting() {

    }

    @Override
    public void leg() {

    }

    @Override
    public void hello() {

    }

    @Override
    public void sound() {

    }

    @Override
    public void sayHello() {
        Animal.super.sayHello();
    }
}
