package Sort;

/**
 * 选择排序，平均时间复杂度 o(n^2),不稳定排序，辅助空间o(1)
 */
public class SelectionOrder extends AbstractSort{
    @Override
    int[] sort(int[] in) {
        for (int i = 0; i < in.length; i++) {
            int min = Integer.MAX_VALUE;
            int index = 0;
            //找出最小的，放在第1位，再从剩下的找出最小的，放在第二位，以此类推
            for (int j = i; j < in.length; j++) {
                if(min <= in[j]){
                    continue;
                }
                min = in[j];
                index = j;
            }
            swap(in, i, index);
        }
        return in;
    }
}
