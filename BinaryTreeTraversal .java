class BinaryTreeTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> level = new ArrayList<>();

            while (n-- > 0) {
                TreeNode t = q.poll();
                level.add(t.val);

                if (t.left != null) q.add(t.left);
                if (t.right != null) q.add(t.right);
            }
            ans.add(level);
        }
        return ans;
    }
}