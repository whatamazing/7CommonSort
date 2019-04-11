package Sort;

/**
 * 希尔排序，时间复杂度与步长的选择有关，大概为O(nlgn),不稳定排序，辅助空间o(1)
 * 三重For循环
 *
 */
public class ShellSort extends AbstractSort {

    @Override
    int[] sort(int[] in) {
        for (int gap = in.length / 2; gap > 0; gap /= 2) //步长
            //总共分为gap组数据，分别进行直接插入排序
            for (int i = 0; i < gap; i++) {
                //每组数据
                for (int j = i + gap; j < in.length; j += gap) {
                    if (in[j - gap] <= in[j]) {
                        continue;
                    }

                    //若前面大于后面
                    int temp = in[j]; //缓存后面的值
                    int k = j - gap;
                    // 开始遍历比较这组数据，从第一个开始看，假定前面k个都是有序数组，寻找位置插入temp
                    while (k >= 0 && in[k] > temp) {
                        // 直接交换效率低，转而算出最终位置，再交换
                        // 先把后面那个坑（in[k + gap]），用前面的数（in[k]）来填上
                        // 至于前面这个坑（in[k]）用什么填，先不急，可能用前面的前面的数填，也可能就用temp填
                        in[k + gap] = in[k];
                        //再往前倒一步，接着比较它与temp的大小
                        k -= gap;
                    }
                    in[k + gap] = temp;

                }
            }
        return in;
    }

}
