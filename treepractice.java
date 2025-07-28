import java.util.LinkedList;
import java.util.Queue;
public class treepractice {
   static  class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    static int idx= -1;
    public static Node Buildetree(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode=new Node(nodes[idx]);
       newNode.left=Buildetree(nodes);
       newNode.right=Buildetree(nodes);
       return newNode;
    }
    }
    public static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currnode=q.remove();
            if(currnode==null){
                System.out.println();
                if(q.isEmpty()){
                   break; 
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currnode.data+" ");
            }
          if(currnode.left!=null){
            q.add(currnode.left);
          }  
          if(currnode.right!=null){
           
                q.add(currnode.right);
            }
          }
        }
    }

