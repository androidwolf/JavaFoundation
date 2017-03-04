package SingleLinkedListSorting;

public class SingleLinkedListSorting {

	public void quickSort(ListNode begin, ListNode end) {
		//判断为空，判断是不是只有一个节点
		if (begin == null || end == null || begin == end)
			return;
		//从第一个节点和第一个节点的后面一个几点
		ListNode first = begin;
		ListNode second = begin.next;

		int nMidValue = begin.val;
		//结束条件，second到最后了
		while (second != end.next && second != null) {
			if (second.val < nMidValue) {
				first = first.next;
				//判断一下，避免后面的数比第一个数小，不用换的局面
				if (first != second) {
					int temp = first.val;
					first.val = second.val;
					second.val = temp;
				}
			}
			second = second.next;
		}
		//判断，有些情况是不用换的，提升性能
		if (begin != first) {
			int temp = begin.val;
			begin.val = first.val;
			first.val = temp;
		}
		//前部分递归
		quickSort(begin, first);
		//后部分递归
		quickSort(first.next, end);
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(2);
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(8);
		ListNode l5 = new ListNode(4);
		ListNode l6 = new ListNode(2);
		ListNode l7 = new ListNode(1);

		/*
		 * ListNode p = l1; System.out.println(p.equals(head));
		 * System.out.println(p == head);
		 */

		head.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = null;

		ListNode p = head;
		while (p.next != null) {
			System.out.print(p.val);
			p = p.next;
		}
		System.out.print(p.val);
		System.out.println();

		ListNode begin = head, end = p;
		new SingleLinkedListSorting().quickSort(begin, end);

		p = head;
		while (p != null) {
			System.out.print(p.val);
			p = p.next;
		}
	}

}
