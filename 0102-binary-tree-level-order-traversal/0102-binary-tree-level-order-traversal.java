/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> singlelevel = new ArrayList<>();
    
    
        Queue<TreeNode> queue = new LinkedList<>();
        
        
        
        if(root != null)
        {            
            queue.add(root);
            while(!queue.isEmpty())
            {
                singlelevel = new ArrayList<Integer>();
                int num = queue.size();
                
                for(int i=0;i<num;i++)
                {
                    TreeNode temp = queue.poll();
                    if(temp != null)
                    {
                        singlelevel.add(temp.val);
                        if(temp.left != null)
                        {
                            queue.add(temp.left);
                        }
                        if(temp.right != null)
                        {
                            queue.add(temp.right);
                        }                  
                    }
                    
                }
                result.add(singlelevel);
            }           
        }
        
        return result;        
    }
}