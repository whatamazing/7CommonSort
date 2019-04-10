package Sort;

/**
 * 快速排序，平均时间复杂度o(nlgn)，不稳定排序，辅助空间o(nlgn)
 */
public class QuickSort extends AbstractSort {
    @Override
    int[] sort(int[] in) {
        quickSort(in, 0, in.length-1);
        return in;
    }

    //递归调用
    private void quickSort(int[] in, int left, int right) {
        if (left < right) {
            int index = adjustArray(in, left, right);
            quickSort(in, left, index - 1);
            quickSort(in, index + 1, right);
        }
    }

    //返回基准点排序后所在的位置
    private int adjustArray(int[] in, int left, int right) {
        //默认选择第一个为基准点
        int x = in[left];
        while (left < right) {
            while (left < right && in[right] >= x) {
                right--;
            }
            if (left < right) {
                in[left] = in[right];
                left++;
            }
            while (left < right && in[left] <= x) {
                left++;
            }
            if (left < right) {
                in[right] = in[left];
                right--;
            }
        }
        in[left] = x;
        return left;
    }
}
