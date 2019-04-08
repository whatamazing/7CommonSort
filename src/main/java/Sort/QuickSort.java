package Sort;

/**
 * 快速排序，o(nlgn)，
 */
public class QuickSort extends AbstractSort {
    @Override
    String[] sort(String input) {
        String[] in = input.split(",");
        quickSort(in, 0, in.length-1);
        return in;
    }

    //递归调用
    private void quickSort(String[] in, int left, int right) {
        if (left < right) {
            int index = adjustArray(in, left, right);
            quickSort(in, left, index - 1);
            quickSort(in, index + 1, right);
        }
    }

    //返回基准点排序后所在的位置
    private int adjustArray(String[] in, int left, int right) {
        int x = Integer.valueOf(in[left]);
        while (left < right) {
            while (left < right && Integer.valueOf(in[right]) >= x) {
                right--;
            }
            if (left < right) {
                in[left] = in[right];
                left++;
            }
            while (left < right && Integer.valueOf(in[left]) < x) {
                left++;
            }
            if (left < right) {
                in[right] = in[left];
                right--;
            }
        }
        in[left] = String.valueOf(x);
        return left;
    }
}
