 public class Del{
	public static class Node{
		 int data;
		 Node left ,right;
		 Node (int data){
			this.data=data;
			
		 }
		 
		 
	 }
	 public static void printPath(ArrayList<Integer> path){
		for(int i=0;i<path.size();i++){
			System.out.println(path.get(i)+"->");
		}
		System.out.println("Null ");
	 }
	 public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
		 if(root==null){
				return;
		 }
		 path.add(root.data);
		 if(root.left ==null && root.right ==null){
			 printPath(path);
		 }
		 printRoot2Leaf(root.left,path);
		 printRoot2Leaf(root.right,path);
		 path.remove(path.size()-1);
	 }
	 public static Node delete(Node root, int val){
		 if(root.data<val){
			 root.right=delete(root.right,val);
		 }
	 else if (root.data>val){
		 root.left =delete(root.left,val);
	 }
		 else{
			 if(root.left==null && root.right ==null){
				 return null;
			 }
		 if(root.left==null){
			return root.right;
			 
		 }
		 else if(root.right==null){
			 return root.left;
		 }
		 Node IS =findInorderSuccessor(root.right);
		 root.data =IS.data;
		 root.right=delete(root.right,IS.data);
		 }
		 return root; 
	 }
	 public static Node findInorderSuccessor(Node root ){
		 while (root.left !=null){
			 root =root.left;
		 }
		 return root;
	 }
	 public  static void printInRange(Node root,int k1,int k2){
			 if(root==null){
				 return ;
			 }
			 if(root.data>=k1 && root.data<=k2){
				 printInRange(root.left,k1,k2);
						System.out.println(root.data+" ");
						printInRange(root.right,k1,k2);
				 }
				 else if(root.data<k1){
					 printInRange(root.left,k1,k2);
					 
				 }
				 else {
					 printInRange(root.right,k1,k2);
				 }
			 }
			 public static boolean isValidBST(Node root ,Node min,Node max){
				 if(root==null){
					 return ;
				 }
				 if (min !=null && root.data<=min.data){
					 return false ;
				 }
				 else if(max !=null && root.data>=max.data){
					 return;
				 }
				 return isValidBST(root.left,min,root)&&isValidBST(root.right,root,max);
			 }
	 
	 public static void inorder(Node root){
		if(root==null){
			
				return ;
		}
		
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
	
	}
	public static Node insert (Node root ,int val){
		if(root ==null){
			root =new Node(val);
			return root;
			
		}
		if (root.data>val){
			root.left=insert(root.left,val);
		}
		else{
			root.right=insert(root.right,val);
		}
		return root;
	}
	 public static void main (String[]args){
		 Node root=null;
		 int values []={1,1,1};
		 for(int i =0;i<values.length;i++){
			 root =insert(root,values[i]);
		 }
	 
	 System.out.println(isValidBST(root,null,null));
	 
	 }
	 ff
 }