package ajancencylink;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<LinkedList<Node>> alist;
    
    Graph(){
       alist = new ArrayList<>(); 
    } 

    public void addNode(Node node){
        LinkedList<Node> curentList = new LinkedList<>();
        curentList.add(node);
        alist.add(curentList);   
    }

    public void addEdge(int src, int dst){
        alist.get(src).add(alist.get(dst).get(0));
    }
    
    public boolean checkEdge(int src, int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        for (Node node : currentList ){
            if (node == dstNode){
                return true;
            }
        }
        return false;
    }
    
    public void print(){
        for (LinkedList<Node> currentList : alist){
            for (Node node : currentList){
                System.out.print(node.data + " -> ");
            }
            System.out.println("");
        }
    }
}
