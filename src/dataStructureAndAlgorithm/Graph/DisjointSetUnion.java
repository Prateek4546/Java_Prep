package dataStructureAndAlgorithm.Graph;

import java.util.ArrayList;
import java.util.List;

public class DisjointSetUnion {
    List<Integer> size ;
    List<Integer> parent;

   public DisjointSetUnion(int N){
       this.size = new ArrayList<>();
       this.parent = new ArrayList<>();
       for(int i=0; i<=N; i++){
          size.add(1);
          parent.add(i);
       }

   }
   public int ultimateParent( int val){
        if(parent.get(val) ==val) return val;
        parent.set(val , ultimateParent( parent.get(val)));
        return parent.get(val);
   }

   public void unionBySize(int nodeA, int nodeB){
       int u_ParentA = ultimateParent( nodeA);
       int u_ParentB = ultimateParent( nodeB);

       if(size.get(u_ParentA) > size.get(u_ParentB))
       {
          size.set(u_ParentA , size.get(u_ParentA)+size.get(u_ParentB))   ;
          parent.set(u_ParentB , u_ParentA);
       }
       else{
           size.set(u_ParentB , size.get(u_ParentA)+size.get(u_ParentB))   ;
           parent.set(u_ParentA , u_ParentB);
       }
   }
}
