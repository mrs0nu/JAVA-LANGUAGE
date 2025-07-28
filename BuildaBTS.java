import java.util.*;
public class BuildaBTS{
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
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
	public static void main (String []args){
		int value[]={3,65,7,8,43,9,9};
		Node root =null;
		for (int i=0; i<value.length;i++){
			root =insert(root, value[i]);
			
		}
	inorder(root);
		System.out.println();
	}
}