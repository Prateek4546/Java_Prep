package desigenPattern.singleTon;

public class TVSet {
    private static  TVSet obj ;
    private TVSet(){

    }
    static TVSet getTVSet(){
       if(obj == null){
            obj = new TVSet();
       }
        return obj;
    }
}
