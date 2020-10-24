package WayToFixBug.Queue;

/**
 * @Description 基于链表实现的队列
 * @Date 2020/10/24 2:58 下午
 * @Created by chenzhibin
 */
public class LinkQueue {

    private ListNode head = null;
    private ListNode tail = null;


    public void enqueue(int val) {
        if (tail == null) {
            ListNode node = new ListNode(val, null);
            head = node;
            tail = node;
        } else {
            tail.next = new ListNode(val, null);
            tail = tail.next;
        }
    }

    /**
     * 出队
     *
     * @return
     */
    public Integer dequeue() {
        if (head == null) {
            return null;
        }
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return val;
    }

    static class ListNode {

        private ListNode next;
        private int val;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }
    }
}
