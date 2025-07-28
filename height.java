public class height {
    static class Node{
        int data;
        Node left ,right;
        public Node (int data){
            this.data=data;
            this.left=null;
            this.left=null;
        }
    }
    public static  int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static void main (String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
         root.right.left.left=new Node(6);
        root.right.left.right=new Node(7);
        System.out.println(height(root));
    }
    public  static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftcount=count (root.left);
        int rightcount=count(root.right);
        return leftcount+rightcount+1;
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sum(root.left);
        int rightsum=sum(root.right);
        return leftsum+rightsum+root.data;
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftdia=diameter(root.left);
        int leftHI= height(root.left);
        int rightdia=diameter(root.right);
        int rightHI=height(root.right);
        int selfdia=leftHI+rightHI+1;
        return Math.max(selfdia,Math.max(leftdia,rightdia));
    }
}
