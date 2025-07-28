import java.util.*;
public class tree {
    static class Node {
        int data;
        Node left;
        Node right;
    Node (int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    }
    static int idx=-1;
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
    public static void preoder(Node root){
        if(root==null ){
            return;
        }
        System.out.print(root.data+" ");
        preoder(root.left);
        preoder(root.right);
    }
    public static void inoder(Node root){
        if(root==null){
            return;
        }
        inoder(root.left);
        System.out.print(root.data+" ");
        inoder(root.right);
    }public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }public static void leveloder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
            
            if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }
         }
          else  {
                System.out.print(currNode.data+" ");
            }
            if(currNode.left!=null){
                q.add(currNode.left);
            }
            if(currNode.right!=null){
                q.add(currNode.right);
            }
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        
        return Math.max(lh,rh)+1;
    }
    public static void main (String agrs[]){
         int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6};
     tree bintree=new tree();
   // Node root=tree.Buildetree(node);
   // System.out.println(root.data);
    Node root =new Node(1);
     root.left =new Node(2);
     root.right =new Node(3);
     root.left.left =new Node(4);
     root.left.right =new Node(5);
     root.right.left =new Node(6);
     root.right.right =new Node(6);
    System.out.print(height(root));
    }
}
