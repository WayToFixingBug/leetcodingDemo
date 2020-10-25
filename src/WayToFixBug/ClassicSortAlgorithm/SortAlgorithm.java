package WayToFixBug.ClassicSortAlgorithm;

/**
 * @Description 经典排序算法实现
 * @Date 2020/10/25 5:26 下午
 * @Created by WayToFixingBug
 */
public class SortAlgorithm {

    /**
     * 冒泡排序
     *
     * @param a
     */
    public void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            //提前退出循坏的标志
            boolean flag = false;
            for (int j = 0; j < a.length - i - 1; ++j) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            //没有数据交换，提前退出
            if (!flag) {
                break;
            }
        }
    }
}
