package dataStructureAndAlgorithm.Recursion;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Premutation {
   static ArrayList<String>  al  = new ArrayList<>();
    public static void main(String[] args) {

          premutation(new StringBuilder("abc") ,0);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
    public  static  void premutation(StringBuilder s , int idx){
         if(idx == s.length()){
             al.add(s.toString());
             System.out.println(s.toString());
         }
        for(int i=idx; i<s.length(); i++){
             swap(s , i , idx);
             premutation(s , idx+1);
             swap(s , i , idx);
        }
    }
    public static  void swap(StringBuilder s , int i , int j){
        char c = s.charAt(i);
        s.setCharAt(i , s.charAt(j));
        s.setCharAt(j , c);
    }
}
