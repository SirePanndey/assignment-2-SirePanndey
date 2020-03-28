/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

public class TreeNode {
private int data;
private TreeNode Left;
private TreeNode Right;

    public TreeNode getLeft() {
        return Left;
    }

    public void setLeft(TreeNode left) {
        Left = left;
    }

    public TreeNode getRight() {
        return Right;
    }

    public void setRight(TreeNode right) {
        Right = right;
    }

    public TreeNode (int data)
    {
        this.data = data;
        Left = null;
        Right = null;
    }
    public int getData()
    {
    return data;
    }
    public void setData(int data)
    {
    this.data=data;
    }
}
