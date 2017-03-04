package bfsdfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFSDFS {

	// ����������ݹ����
	public void inOrder(TreeNode T) {
		if (T != null) {
			inOrder(T.left);
			visit(T);
			inOrder(T.right);
		}
	}

	// ����������ǵݹ����
	public void inOrder2(TreeNode T) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode p = T;
		while (p != null || !stack.isEmpty()) {
			if (p != null) {
				stack.push(p);
				p = p.left;
			} else {
				p = stack.pop();
				visit(p);
				p = p.right;
			}
		}
	}

	// ��α���
	public void levelOrder(TreeNode T) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(T);
		TreeNode p = null;
		while (!queue.isEmpty()) {
			p = queue.poll();
			visit(p);
			if (p.left != null)
				queue.add(p);
			if (p.right != null)
				queue.add(p);
		}
	}

	private void visit(TreeNode t) {
		System.out.println(t.val);
	}

}
