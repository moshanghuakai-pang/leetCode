/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null)
            return null;
        //TreeLinkNode pNext = new TreeLinkNode(0);
        if(pNode.right != null) {
            TreeLinkNode pRight = pNode.right;
            //pRight = pNode.right;
            while(pRight.left != null) {
                pRight = pRight.left;
            }
            return pRight;
        }
        else if(pNode.next != null) {
            TreeLinkNode pCurrent = pNode;
            TreeLinkNode pParent = pNode.next;
            while(pParent != null && pCurrent == pParent.right) {
                pCurrent = pParent;
                pParent = pParent.next;
            }
            return pParent;
             //TreeLinkNode pNext = pParent;
        }
        // must add this,it means,when acqueire the root node,still not find
        return null;
        //return pNext;
    }
}