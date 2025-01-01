package dataStructureAndAlgorithm.Arrays.BinarySearch;

public class SqareRoot {

    public static void main(String[] args) {
        int n = 11;
        System.out.println(solve(n));
    }
    private static int solve(int n)
    {
        int lo = 1;
        int hi = n;
        int ans = -1;
        while(lo <= hi){

            int mid = (lo + (hi - lo)/2);

            if(mid <= (int)(n / mid)){
                ans = mid;
                lo = mid + 1;
            }
            else{
                hi = mid - 1;
            }
        }
        return ans;
    }
}
