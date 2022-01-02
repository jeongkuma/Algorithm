package algorithm.programmers.namu;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along
 * the longest path from the root node down to the farthest leaf node.
 * Note: A leaf is a node with no children.
 */
public class route {

    static int answer;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(solution(root));
    }

    public static int solution(TreeNode root) {
//        dfs(root, 1);

        bfs(root);


        return answer;
    }

    public static void dfs(TreeNode root, int level) {
        answer = Math.max(answer, level);
        if(root.right != null){
            dfs(root.right, level + 1);
        }
        if(root.left != null){
            dfs(root.left, level + 1);
        }
    }

    public static void bfs(TreeNode root) {

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);

        if (root.right != null) {
            bfs(root


                    .right);
        }

        if (root.left != null) {
            bfs(root.left);
        }

        answer = que.size();

        System.out.println(answer);


    }

}

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }

}
