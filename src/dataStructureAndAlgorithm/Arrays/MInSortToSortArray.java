package dataStructureAndAlgorithm.Arrays;

import java.util.*;
public class MInSortToSortArray {
    private static int count(ArrayList<Integer> al){
        int len = al.size();
        //System.out.println(al);
        ArrayList<int[]> pair = new ArrayList<>();
        for(int i=0; i<len; i++){
            pair.add(new int[]{al.get(i) , i});

        }
        pair.sort(
                (a , b) ->{
                    if(a[0] == b[0])return a[1] - b[1];
                    else return a[0] - b[0];
                }
        );

        boolean[] visted = new boolean[len];
        Arrays.fill(visted , false);
        int ans = 0;
        for(int i=0; i<len; i++)
        {
            if(visted[i] == true || pair.get(i)[1] == i)
            {
                continue;
            }
            int j = i;
            int cycle = 0;
            while(visted[j] != true)
            {
                visted[j] = true;
                j = pair.get(j)[1];
                cycle++;
            }
            if(cycle > 1) ans += (cycle - 1);
        }
        return ans;
    }
}
