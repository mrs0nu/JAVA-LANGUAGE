public class diameter {
    public static class Node {
        Node left;
        int data;
        Node right;
        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
            
        }

    }
    public static int height (Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return lh+rh+1;
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftdia=diameter(root.left);
        int leftheight=height(root.left);
        int rightdia=diameter(root.right);
        int rightheight=height(root.left);
         
        int selfdia=leftdia+rightdia+1;
        return Math.max(selfdia,Math.max(leftdia,rightdia));
    }
    public static void main (String args[]){
        Node root=new Node(10);
        root.left=new Node(64);
        root.right=new Node(99);
        root.left.left=new Node(23);
        root.left.right=new Node(44);
        root.right.left=new Node(67);
        root.right.right=new Node(43);

    } 
}
