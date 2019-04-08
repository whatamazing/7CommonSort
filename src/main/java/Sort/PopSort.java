package Sort;

/**
 * 冒泡,o(n^2),稳定
 */
public class PopSort extends AbstractSort {

    @Override
    public String[] sort(String input) {
        String[] in = input.split(",");
        for (int i = 0; i < in.length; i++) {
            //递增排序，第一次需要把最大的冒到最后，第二次再把次大的冒到倒数第二的位置，以此类推
            boolean isOrder = true;
            for (int j = 1; j < in.length - i; j++) {
                if (Integer.valueOf(in[j - 1]) > Integer.valueOf(in[j])) {
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
