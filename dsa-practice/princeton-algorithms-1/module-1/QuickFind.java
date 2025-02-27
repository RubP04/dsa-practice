public class QuickFind {
    int[] id; // Stores identifiers for the connected components

    // Constructor that initializes each id to its own index, creating N components
    public QuickFind(int n){
        id = new int[n];
        for(int i = 0; i < n; i++){
            id[i] = i;
        }
    }

    // Simple check to determine if two compnents are connected
    public boolean find(int p, int q){
        return id[p] == id[q];
    }

    // Connects two components by changing all instances of p_id into q_id in the id array signaling connectivity
    public void union(int p, int q){
        int p_id = id[p];
        int q_id = id[q];

        if(find(p, q)) return; // Optimization to prevent traversing entire array if the two components are already connected

        for(int i = 0; i < id.length; i++){
            if(id[i] == p_id){
                id[i] = q_id;
            }
        }
    }
}