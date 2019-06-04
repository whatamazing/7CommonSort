package Sort;

/**
 * 归并排序，平均时间复杂度o(nlgn)，稳定，需要额外空间o(n)
 */
public class MergeSort extends AbstractSort {
    @Override
    int[] sort(int[] o) {
        int[] in=new int[o.length];
        System.arraycopy(o,0,in,0,o.length);
        int[] temp = new int[in.length];
        sort(in, 0, in.length - 1, temp);
        return in;
    }

    private void sort(int[] in, int start, int end, int[] temp) {
        if (start < end) {
            int mid = (end + start) / 2;
            sort(in, start, mid, temp);
            sort(in, mid + 1, end, temp);
            merge(in, start, mid, end, temp);
        }
    }

    private void merge(int[] in, int start, int mid, int end, int[] temp) {
        int i = start;//左序列起始指针
        int j = mid + 1;//右序列起始指针
        int t = 0;
        while (i <= mid && j <= end) {
            if (in[i] <= in[j]) {
                temp[t++] = in[i++];
            } else {
                temp[t++] = in[j++];
            }
        }
        while (i <= mid) {
            temp[t++] = in[i++];
        }
        while (j <= end) {
            temp[t++] = in[j++];
        }
        t = 0;
        while (start <= end) {
            in[start++] = temp[t++];
        }
    }
}
