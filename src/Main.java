import  java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];//5
      for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
      }

    }

    private  static  void sort(int[] arr , int l , int r){
        if(l <r){
            int m = (l - (r - l)/2);

            sort(arr , l , m);
            sort(arr , m+1 ,r);

        }

    }
    private  static void merge(int[] arr , int l , int m , int r){
        int n = m - l +1;
        int len = r - m;
        int[] left = new int[n];
        int[] right = new int[m];
        for(int i=0; i<n; i++){
            left[i] = arr[i];
        }
        for(int i=0; ; i++){
            if(i >= len)break;
            right[i] = arr[m+1 +i];
        }

        int i =0; int j =0;
        int k = 0;

        while(i < n && j < len){
            if(left[i] <= right[j]){
                arr[k] = left[i];
            }
        }

    }


}

//tabel teacher  10 id primay key
//           id , name ;
//subject table
//        id , name , techid ;
//        == >> find the teacher name  tecahing math

// Select * from teacher ad t
//        left join subject as s
//        on t.id == s.teacher.id
//       where s.name = "Math";