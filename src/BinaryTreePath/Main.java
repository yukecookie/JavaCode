package BinaryTreePath;

import java.util.ArrayList;


//输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
//路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

}


public class Main {

	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> path = new ArrayList<Integer>();

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target){
		if(root == null){
			return res;
		}
		path.add(root.val);
		target = target - root.val;
		if(target == 0 && root.left == null && root.right == null){
			res.add(new ArrayList<Integer>(path));
		}
		FindPath(root.left,target);
		FindPath(root.right,target);
		path.remove(path.size() - 1);
		return res;
	}
	
}
