package WayToFixBug.Queue;

/**
 * @Description 用数组实现的队列
 * @Date 2020/10/24 10:18 上午
 * @Created by WayToFixingBug
 */
public class ArrayQueue {
    private String[] items;
    private int n = 0;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int capacity) {
        this.items = new String[capacity];
        this.n = capacity;
    }

    /**
     * 入队
     *
     * @param item
     * @return
     */
    public boolean enqueue(String item) {
        //队列已满
        if (tail == n) {
            //head == 0 表示整个队列都占满了
            if (head == 0) {
                return false;
            }
            for (int i = head; i < tail; ++i) {
                items[i - head] = items[i];
            }
            tail -= head;
            head = 0;
        }
        items[tail] = item;
        ++tail;
        return true;
    }

    /**
     * 出队
     * @return
     */
    public String dequeue() {
        //队列为空
        if (head == tail) {
            return null;
        }
        String ret = items[head];
        ++head;
        return ret;
    }
}
