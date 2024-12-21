package dataStructureAndAlgorithm.Graph;

public class Main {
    public static void main(String[] args) {
        DisjointSetUnion ds = new DisjointSetUnion(7);
        ds.unionBySize(1 , 2);
        ds.unionBySize(2 , 3);
        ds.unionBySize(4 , 5);
        ds.unionBySize(6 , 7);
        ds.unionBySize(5 , 6);

        if(ds.ultimateParent(6) == ds.ultimateParent(1)){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
        ds.unionBySize(3 , 7);

        if(ds.ultimateParent(6) == ds.ultimateParent(1)){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
    }
}
