import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class GraphDFSBFS {
    ArrayList<ArrayList<Integer>>graph;
    int v;

    GraphDFSBFS(int nodes)
    {
        v=nodes;
        graph=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<v;i++)
        {
            graph.add(new ArrayList<Integer>());
        }
    }
    void addEdge(int v,int u)
    {
        graph.get(v).add(u);
        graph.get(u).add(v);
    }
    void printGraph() {
        for (int i = 0; i < v; i++) {
            System.out.println("Node" + i);
            for (int x : graph.get(i)) {
                System.out.println("->" + x);
                System.out.println();
            }

        }
    }
        void dfsUtil(int node,boolean visited[])
        {
            visited[node]=true;
            System.out.println(node+"");
            for(int x:graph.get(node))
            {
                if(visited[x]==false)
                {
                    dfsUtil(x,visited);
                }
            }

        }
        void DFS(int start)
        {
            boolean visited[]=new boolean[v];
            System.out.print("DFS  traversal of graph");
            dfsUtil(start,visited);

        }


        void BFS(int start)
        {
            boolean visited[]=new boolean[v];
            LinkedList<Integer> q= new LinkedList<Integer>();
            q.add(start);
            System.out.println("BFS graph traversal");
            visited[start]=true;
            while (q.isEmpty()==false)
            {
                int node = q.poll();
                System.out.print(node+" ");
                for(int x:graph.get(node))
                {
                    if(visited[x]==false)
                    {
                       visited[x]=true;
                        q.add(x);
                    }
                }
            }
        }


    }

 class GraphBFS {
    public static void main(String[] args)
    {
        GraphDFSBFS g=new GraphDFSBFS(5);
        g.addEdge(0,1);
        g.addEdge(3,2);
        g.addEdge(2,4);
        g.addEdge(1,4);
        g.addEdge(3,1);
        g.addEdge(2,0);
        g.printGraph();
        g.DFS(0);
        System.out.println();
        g.BFS(0);

    }

}
