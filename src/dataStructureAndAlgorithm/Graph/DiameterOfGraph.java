package dataStructureAndAlgorithm.Graph;

import java.util.*;
public class DiameterOfGraph {

    public int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {

        Map<Integer , ArrayList<Integer>> adj1 = new HashMap<>();
        Map<Integer , ArrayList<Integer>> adj2 = new HashMap<>();

        int n = edges1.length;
        int m = edges2.length;

        if(n > 0) adjMaker(adj1 , n , edges1);
        if(m > 0)  adjMaker(adj2 , m , edges2);
        //  System.out.println(adj1);
        //  System.out.println(adj2);


        int dia1 = diameter(adj1 );
        int dia2 = diameter(adj2 );


        int res = (int) Math.ceil(dia1 / 2.0) + (int) Math.ceil(dia2 / 2.0) + 1;

        return Math.max(res , Math.max(dia1 , dia2));



    }
    private void adjMaker(Map<Integer , ArrayList<Integer>> adj1 , int n , int[][] edges1){
        for(int i=0; i<n; i++){
            int u = edges1[i][0];
            int v = edges1[i][1];

            if(!adj1.containsKey(u)){
                adj1.put(u , new ArrayList<>());

            }
            adj1.get(u).add(v);
            if(!adj1.containsKey(v)){
                adj1.put(v , new ArrayList<>());
            }
            adj1.get(v).add(u);
        }
    }
    private int diameter(Map<Integer , ArrayList<Integer>> adj){
        int n = adj.size();
        int[] arr =  farthestNode(adj , 0 , n);
        // System.out.println(arr[0] +" "+arr[1]);
        int[] ans = farthestNode(adj , arr[0] , n);
        //  System.out.println(ans[0]+" "+ans[1]);

        return ans[1];
    }
    private int[]  farthestNode(Map<Integer ,  ArrayList<Integer>> adj , int start , int n){

        int[] visted = new int[n];
        int[] ans = {0 , 0};
        if(n <= 0) return ans;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visted[start] = 1;
        int dis = 0;
        int lNode = 0;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0; i<len; i++){
                int node = q.poll();
                lNode = node;
                for(Integer it : adj.getOrDefault(node , new ArrayList<>())){
                    if(visted[it] == 0){
                        visted[it] = 1;
                        q.add(it);
                    }
                }
            }
            if(!q.isEmpty()) dis++;
        }
        ans[1] = dis;
        ans[0] = lNode;

        return ans;
    }
}
