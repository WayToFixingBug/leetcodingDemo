package WayToFixBug.Queue;

/**
 * @Description 数组实现循环队列
 * @Date 2020/10/24 8:21 下午
 * @Created by chenzhibin
 */
public class CircleQueue {

    private String[] items;
    private int n = 0;
    private int head = 0;
    private int tail = 0;

    public CircleQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    /**
     * 入队
     *
     * @param item
     * @return
     */
    public boolean enQueue(String item) {
        //队满
        if ((tail + 1) % n == head) {
            return false;
        }
        items[tail] = item;
        tail = (tail + 1) % n;
        return true;
    }

    /**
     * 出队
     *
     * @return
     */
    public String deQueue() {
        //队空
        if (head == tail) {
            return null;
        }
        String ret = items[head];
        head = (head + 1) % n;
        return ret;
    }
}
