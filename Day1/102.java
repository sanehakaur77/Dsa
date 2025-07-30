class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> wrapList=new LinkedList<>();
    Queue<TreeNode> q=new LinkedList<>();
    if(root==null) return wrapList;
    q.offer(root);
    while(!q.isEmpty()){
        int size=q.size();
        List<Integer> subList=new LinkedList<>();
        for(int i=0;i<size;i++){
            TreeNode curr=q.poll();
        if(curr.left!=null) q.offer(curr.left);
        if(curr.right!=null) q.offer(curr.right);
         subList.add(curr.val);
        }
        wrapList.add(subList);

    }
    return wrapList;
    }
}
