package desigenPattern.singleTon;

public class Driver {

    public static void main(String[] args) {
        TVSet member1 =  TVSet.getTVSet();
        TVSet member2 =  TVSet.getTVSet();
        System.out.println(member1);
        System.out.println(member2);

    }
}
