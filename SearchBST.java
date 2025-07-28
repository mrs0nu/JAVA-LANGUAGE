public class SearchBST{
	public  static class Node {
		int data;
		Node left ,right;
		Node (int data){
			this.data=data;
			this.left=null;
			this.right=null;
			
		}
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
	public static boolean BST(Node root,int key){
		if(root==null){
			return false;
		}
		if(root.data==key){
			return true;
		}
		if(root.data>key){
		return	BST(root.left,key);
		}
		else{
		return	BST(root.right,key);
			
		}
		
	}
public static void main (String []args){
	int value[]={3,65,7,8,43,9,9},key=10;
		Node root =null;
		for (int i=0; i<value.length;i++){
			root =insert(root, value[i]);
			
		}
	
		System.out.println();
		System.out.print(BST(root,key));
	
}
}