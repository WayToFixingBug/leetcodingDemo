package WayToFixBug.Stack;

import java.util.Stack;

/**
 * @Description 利用两个栈实现队列(剑指offer.09题)
 * <p>
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * @Date 2020/10/22 9:44 下午
 * @Created by chenzhibin
 */
public class StackQueue {
    /**
     * 进队列栈
     */
    private Stack<Integer> pushStack;
    /**
     * 出队列栈
     */
    private Stack<Integer> deleteStack;

    public StackQueue() {
        this.pushStack = new Stack<>();
        this.deleteStack = new Stack<>();
    }

    /**
     * 入队
     *
     * @param val
     */
    public void appendTail(int val) {
        pushStack.push(val);
    }

    /**
     * 出队
     */
    public int deleteHead() {
        if (deleteStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                deleteStack.push(pushStack.pop());
            }
        }
        if (deleteStack.size() == 0) {
            return -1;
        }
        return deleteStack.pop();
    }

    public static void main(String[] args) {
        StackQueue queue = new StackQueue();
        for (int i = 0; i < 5; i++) {
            queue.appendTail(i);
        }
        System.out.println(queue.deleteHead());
    }
}
