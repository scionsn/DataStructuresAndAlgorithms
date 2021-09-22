class Node
{
    String data;
    Node left,right;

    Node(String data)
     {
     this.data = data;
     this.left = null;
     this.right = null;
     }

}
public class DiameterOfBT {
    int res=Integer.MIN_VALUE;

int diameter(Node root){
    helper(root);
    System.out.println(res);
    return res;
}
int helper(Node root) {
if(root==null)
return 0;
int left=helper(root.left);
int right=helper(root.right);
//case when a node itself isnt forming a  diameter itself so it returns its height so as
//to be a part of the diameter for the parent node
int temp=1+Math.max(left,right);
//we compare temp with the case when the node says that i myself will be the part of diameter
//so its left , right and node itself will be counted
//basically we compare these two so as to get the max diameter
int ans=Math.max(temp,1+left+right);

res=Math.max(res,ans);
System.out.println(res);
//we are returning temp so that the current node is a prt of diameter
//but for its parent node.
return temp;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
