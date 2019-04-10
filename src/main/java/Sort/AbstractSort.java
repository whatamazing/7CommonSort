package Sort;

public abstract class AbstractSort {
    /**
     *
     * @param input String with , eg:1,2,3,4
     * @return asc
     */
    abstract int[] sort(int[] input);

    /**
     * 交换in中i,j,的位置
     * @param in
     * @param i
     * @param j
     */
    static void swap(int[] in, int i, int j) {
        int temp = in[i];
        in[i] = in[j];
        in[j] = temp;
    }
}
