package gfg_potds;

import java.util.ArrayList;
class Pair{
    int node;
    int weight;

    Pair(int node,int weight){
        this.node = node;
        this.weight = node;
    }
}

public class potd_1 {
    public static void main(String[] args) {
        // unweighted garphs:...............
        

        // for (int i = 0; i < V; i++) {
        //     adj.add(new ArrayList<>());
        // }

        // adj.get(0).add(1);
        // adj.get(1).add(0);
        // adj.get(2).add(0);
        // adj.get(0).add(2);
        // adj.get(1).add(3);
        // adj.get(3).add(1);
        // adj.get(1).add(2);
        // adj.get(2).add(1);

        // for (int i = 0; i < V; i++) {
        //     System.out.print(i + " -> ");

        //     for (int neighbour : adj.get(i)) {
        //         System.out.print(neighbour + " ");
        //     }

        //     System.out.println();
        // }


        // for weighted graphs::::

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        int V = 4;

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(new Pair(1, 4));
        adj.get(1).add(new Pair(0,4));
        adj.get(0).add(new Pair(2,2));
        adj.get(2).add(new Pair(0,2));

        for(int i = 0; i < V; i++) {
            System.out.print(i + " -> ");

            for(Pair p: adj.get(i)) {
                System.out.print("("+ p.node +" , " +  p.weight + ")");
            }
            System.out.println();
        }

    }
}
