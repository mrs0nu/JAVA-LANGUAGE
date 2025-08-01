public class heightoftree {
    static class Node{
        Node left ;
        int data ;
        Node right;
    
    Node (int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    
    }public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh= height(root.left);
        int rh= height (root.right);
        return Math.max(lh,rh)+1;
    }public static int count (Node root){
        if(root==null){
            return 0;
        }
        int leftcount =count(root.left);
        int rightcount=count(root.right);
        return leftcount + rightcount +1;
    }
    public static int  sum(Node root){
        if(root==null){
            return 0;

        }
        int leftsum=sum(root.left);
        int rightsum=sum(root.right);
        return leftsum+rightsum+root.data; 
    }
    public static void main(String args[]){
        Node root=new Node(3);
        root.left=new Node(4);
        root.right=new Node(5);
        root.left.right=new Node(6);
        root.left.left=new Node(7);
        root.right.left=new Node(8);
        root.right.right=new Node(9); 
    System.out.println(height(root));
    }
}
