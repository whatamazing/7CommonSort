package Sort;

public abstract class AbstractSort {
    /**
     *
     * @param input String with , eg:1,2,3,4
     * @return asc
     */
    abstract String[] sort(String input);

    /**
     * 打印数组o
     * @param o
     */
    static void toString(String[] o) {
        String out = "";
        for (int i = 0; i < o.length - 1; i++) {
            out += o[i]+",";
        }
        out += o[o.length - 1];
        System.out.println(out);
    }

    /**
     * 交换in中i,j,的位置
     * @param in
     * @param i
     * @param j
     */
    static void swap(String[] in, int i, int j) {
        String temp = in[i];
        in[i] = in[j];
        in[j] = temp;
    }
}
