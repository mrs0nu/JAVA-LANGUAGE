public class treecount {
  static  class Node{
      Node left ;
      int data;
      Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
            }
        }
   static int idx =-1;
   public static Node Buildtree(int nodes []){
     idx++;
     if(nodes[idx]==-1){
        return null;
     }
     Node newnode=new Node(nodes[idx]);
     newnode.left=Buildtree(nodes);
     newnode.right=Buildtree(nodes);
     return newnode;
   }
   public static void main(String args[]){
    int nodes[]={1,2,3,4,5,};
    treecount tree=new treecount();
   Node  root=tree.Buildtree(nodes);
    System.out.println(root.data);
   }
    }

