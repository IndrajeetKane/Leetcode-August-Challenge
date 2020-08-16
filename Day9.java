class Solution {
    int count = 0;
    HashMap<Integer,Integer> map = new HashMap();
    public void preorder(TreeNode node,int currSum, int target) {
        if(node == null)
            return;

        currSum += node.val;

        if(currSum == target)
            count++;

        count += map.getOrDefault(currSum - target,0);

        map.put(currSum, map.getOrDefault(currSum,0) + 1);

        preorder(node.left,currSum,target);
        preorder(node.right,currSum,target);

        map.put(currSum, map.get(currSum) - 1);
    }
    public int pathSum(TreeNode root, int sum) {
        preorder(root, 0, sum);
        return count;
    }
}
