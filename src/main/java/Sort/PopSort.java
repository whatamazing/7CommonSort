package Sort;

/**
 * 冒泡,平均时间复杂度o(n^2),稳定，辅助空间o(1)
 */
public class PopSort extends AbstractSort {

    @Override
    public int[] sort(int[] in) {
        for (int i = 0; i < in.length; i++) {
            //递增排序，第一次需要把最大的冒到最后，第二次再把次大的冒到倒数第二的位置，以此类推
            boolean isOrder = true;
            for (int j = 1; j < in.length - i; j++) {
                if (in[j - 1] > in[j]) {
                    isOrder = false;
                    swap(in, j - 1, j);
                }
            }
            if (isOrder)
                break;
        }
        return in;
    }
}
