import java.util.*;
public class  BST{
static class Node {
	int data;
	Node left,right;
	Node (int data){
		this.data=data;
		this.left=right=null;
	}
	public static void inorder(	Node root){
		if(root==null){
			return;
		}
		inorder(root.left);
		System.out.println(root.data+" ");
		inorder(root.right);
	}
	public static void getInorder(Node root,ArrayList<Integer>inorder){
		if(root==null){
			return;
		}
		getInorder(root.left,inorder);
		inorder.add(root.data);
		getInorder(root.right,inorder);
	}
	public static void createBST(Node root,int st,int end){
		if(st>end){
			return;
		}
		int mid =(st+end)/2;
		 root= new Node (inorder.get(mid));
		root.left=createBST(inorder,st,mid-1);
		root.right=createBST(inorder,mid+1,end);
		return root;
	}
	public static Node balancedBST(Node root){
		ArrayList<Integer>inorder = new ArrayList<>();
		getInorder(root,inorder);
		root = createBST(inorder,0,inorder.size()-1);
		return root;
	}
	public static void main (string []args){
	Node root =new  Node (8);
	root.left =new Node (6);
	root.left.left=new Node(5);
	root.left.left.left=new Node (3);
	root.right=new Node (10);
	root.right.right =new Node(11);
	root.right.right.right=new Node(12);
	root =balancedBST(root);
	inorder(root);
	
	
}	
}}