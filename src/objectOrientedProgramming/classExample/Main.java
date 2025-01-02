package objectOrientedProgramming.classExample;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rohan" , 15);
//        System.out.println(s1.getName() + " "+);
         s1.setRollNo(12);
        System.out.println(s1.getName() + " "+ s1.getRollNo());
    }


}
