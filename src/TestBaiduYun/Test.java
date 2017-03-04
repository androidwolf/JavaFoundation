package TestBaiduYun;

public class Test {

	public ListNode copyList(ListNode head) {
		if (head == null)
			return head;
		ListNode p = head;
		while (p != null) {
			ListNode temp = new ListNode(p.val);
			temp.next = p.next;
			p.next = temp;
			p = temp.next;
		}
		return head;
	}

	public ListNode cutList(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode p = head;
		ListNode q = head.next;
		ListNode head2 = head.next;
		while (q.next != null) {
			p.next = q.next;
			q.next = q.next.next;
			p = p.next;
			q = q.next;
		}
		return head2;
	}

	public ListNode copyFuzaList(ListNode head) {
		if (head == null)
			return head;
		ListNode copyP = copyList(head);

		while (copyP != null) {
			copyP.next.next2 = copyP.next2;
			copyP = copyP.next.next;
		}

		return cutList(head);
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(5);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(8);
		ListNode l5 = new ListNode(4);
		ListNode l6 = new ListNode(2);
		ListNode l7 = new ListNode(1);

		head.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = null;

		ListNode p = new Test().copyFuzaList(head);
		while (p != null) {
			System.out.print(p.val);
			p = p.next;
		}
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode next2;

	ListNode(int x) {
		val = x;
	}
}
