package Graph;

import java.util.*;

public class Graph {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d,int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

//            graph[0].add(new Edge(0,1));
//            graph[0].add(new Edge(0,2));
//
//            graph[1].add(new Edge(1,0));
//            graph[1].add(new Edge(1,3));
//
//            graph[2].add(new Edge(2,0));
//            graph[2].add(new Edge(2,4));
//
//
//            graph[3].add(new Edge(3,1));
//            graph[3].add(new Edge(3,4));
//            graph[3].add(new Edge(3,5));
//
//            graph[4].add(new Edge(4,2));
//            graph[4].add(new Edge(4,3));
//            graph[4].add(new Edge(4,5));
//
//            graph[5].add(new Edge(5,3));
//            graph[5].add(new Edge(5,4));
//            graph[5].add(new Edge(5,6));
//
//            graph[6].add(new Edge(6,5));

//            // for directed graph ->
//            graph[0].add(new Edge(0,2));
//            graph[1].add(new Edge(1,0));
//            graph[2].add(new Edge(2,3));
//            graph[3].add(new Edge(3,0));

//            //for dijkstra's algorithm
//            graph[0].add(new Edge(0,1,2));
//            graph[0].add(new Edge(0,2,4));
//
//            graph[1].add(new Edge(1,3,7));
//            graph[1].add(new Edge(1,2,1));
//
//            graph[2].add(new Edge(2,4,3));
//
//            graph[3].add(new Edge(3,5,1));
//
//            graph[4].add(new Edge(4,3,2));
//            graph[4].add(new Edge(4,5,5));

        //Bellman Ford Algorithm
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));

    }

    public static void bfs(ArrayList<Edge> graph[],int V){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] =  new boolean[V];
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.println(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
        System.out.print(curr+" ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false){
                dfs(graph, e.dest, vis);
            }
        }
    }
    public static void printAllPath(ArrayList<Edge> graph[],boolean vis[],int curr, String path,int target){
        if(curr == target){
            System.out.println(path);
            return;
        }

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                vis[curr] = true;
                printAllPath(graph,vis,e.dest,path + e.dest,target);
                vis[curr] = false;
            }
        }
    }
    public static boolean isCycleUndirected(ArrayList<Edge> graph[],boolean vis[],int curr, int parent){
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(vis[e.dest] && e.dest != parent){
                return true;
            }else if(!vis[e.dest]){
                if(isCycleUndirected(graph, vis, e.dest, curr)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleDirected(ArrayList<Edge> graph[],boolean vis[],int curr, boolean rec[]){
        vis[curr] = true;
        rec[curr] = true;

        for (int i = 0; i <graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(rec[e.dest] == true){
                return true;
            } else if (!vis[e.dest]) {
                if(isCycleDirected(graph, vis, e.dest, rec))
                    return true;
            }
        }
        rec[curr] = false;
        return false;
    }

    public static void topologicalSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> stack){
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topologicalSortUtil(graph, e.dest, vis, stack);
            }
        }

        stack.push(curr);
    }
    public static void topologicalSort(ArrayList<Edge> graph[],int V){
        boolean vis[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!vis[i]){
                topologicalSortUtil(graph,i,vis,stack);
            }
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop() + " ");
        }
    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;

        public Pair(int n,int d){
            this.node = n;
            this.dist = d;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist; // ascending
        }
    }

    public static void dijikstra(ArrayList<Edge> graph[], int src,int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) {
            if (i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean[] vis = new boolean[V];

        pq.add(new Pair(0,0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove(); // shortest
            if(!vis[curr.node]){
                vis[curr.node] = true;

                for (int i = 0; i< graph[curr.node].size();i++){
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if(dist[u] + e.wt < dist[v]){
                        dist[v] = dist[u] + e.wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }

        for (int i = 0; i < V; i++) {
            System.out.print(dist[i]+ " ");
        }
        System.out.println();
    }

    public static void BellmanFord(ArrayList<Edge> graph[],int src,int V){
        int dist[] = new int[V];
        for (int i = 0; i < V; i++) {
            if((i != src)){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        for (int k = 0; k < V - 1; k++) { // O(V)
            // O(E)
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < graph[i].size(); j++) {
                    Edge e = graph[i].get(j);
                    int u = e.src;
                    int v = e.dest;

                    if(dist[u] != Integer.MAX_VALUE && dist[u]+e.wt < dist[v]){
                        dist[v] = dist[u] + e.wt;
                    }
                }
            }
        }

        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        int V = 7; // vertices
        int V = 5;

            /*
                 1-----3
                /      | \
               0       |  5----6
                \      | /
                 2-----4
             */

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        // bellmanFrod algorithm

        BellmanFord(graph,0,V);

//        // Dijkstra's algorithm
//
        dijikstra(graph,0,V);
//
        //top Sort
//
//        topologicalSort(graph,V);

//        boolean vis[] = new boolean[V];
//        boolean rec[] = new boolean[V];
//        for (int i = 0; i < V; i++) {
//            if(!vis[i]){
//                boolean isCycle = isCycleDirected(graph,vis,0,rec);
//                if(isCycle){
//                    System.out.println(true);
//                    break;
//                }
//            }
//        }


        System.out.println(isCycleDirected(graph,new boolean[V],0,new boolean[V]));

//        System.out.println(isCycleUndirected(graph,new boolean[V],0,-1));


//        int src = 0, tar = 5;
//        printAllPath(graph,new boolean[V],src,"0",tar);
//        bfs(graph,V);
//        boolean vis[] = new boolean[V];

//        dfs(graph, 0, vis);


        // for  broken graph
//        for (int i = 0; i < V; i++) {
//            if(vis[i] == false){
//                dfs(graph, i, vis);
//            }
//        }
//        Print 2's neighbours ....
//        for (int i = 0; i < graph[2].size(); i++) {
//            Edge e = graph[2].get(i);
//            System.out.println(e.dest + ", " + e.wt);
//        }
    }
}
