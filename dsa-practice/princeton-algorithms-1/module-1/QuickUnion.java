public class QuickUnion {
    int[] id;

    // Constructor that initializes id array to i
    public QuickUnion(int n){
        id = new int[n];

        for(int i = 0; i < n; i++) id[i] = i;
    }

    // Finds the root of the tree by moving up a level until id[i] = i indicating a root node
    private int root(int i){
        while(id[i] != i) i = id[i];
        return i;
    }

    // Check whether two componenets are connected by comparing their roots
    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    // Connect two components by changing the id of the root of p to the root of q
    public void union(int p, int q){
        int p_root = root(p);
        int q_root = root(q);
        id[p_root] = q_root;
    }
}
