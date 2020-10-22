package WayToFixBug.Stack;

/**
 * @Description 基于数组的顺序栈
 * @Date 2020/10/22 8:05 下午
 * @Created by WayToFixingBug
 */
public class ArrayStack {
    /**
     * 数组
     */
    private String[] targets;
    /**
     * 栈的元素个数
     */
    private int count;
    /**
     * 栈的大小
     */
    private int size;

    public ArrayStack(int size) {
        this.targets = new String[size];
        this.count = 0;
        this.size = size;
    }

    /**
     * 入栈
     *
     * @param target
     * @return
     */
    public boolean push(String target) {
        //数组空间不够，入栈失败
        if (count == size) {
            return false;
        }
        targets[count] = target;
        ++count;
        return true;
    }

    /**
     * 出栈
     *
     * @return
     */
    public String pop() {
        if (count == 0) {
            return null;
        }
        String target = targets[count - 1];
        --count;
        return target;
    }
}
