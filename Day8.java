class Solution {
    public int closestValue(TreeNode root, double target) {
        int ans = root.val;
        while(root!=null)
        {
            if(Math.abs(root.val - target) < (Math.abs(target - ans)))
            {
                ans = root.val;
            }
            if(root.val < target)
            {
                root = root.right;
            }
            else
            {
                root = root.left;
            }
        }
        return ans;
    }
}
