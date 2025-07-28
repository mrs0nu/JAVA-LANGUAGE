 
	
	
		
		
public  class BalancedBST{
	class Node{
		int data;
		Node left,right;
		Node (int data){
			this.data=data;
			this.left=this.right=null;
		}
	}
	public  Node createBST(int arr[],int st,int end ){
			if(st>end ){
				return null;
			}
			int mid=(st+end)/2;
			Node root =new Node (arr[mid]);
			root.left=createBST(arr,st,mid-1);
			root.right=createBST(arr,mid+1,end);
			return root;
		}

	public  void preorder(Node root){
		if(root==null){
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void main(String args[]){
		BalancedBST t=new BalancedBST();
		int arr[]={3,4,5,6,8,90,98,100};
		Node root =t.createBST(arr ,0,arr.length-1);
		t.preorder(root);
	}
}
