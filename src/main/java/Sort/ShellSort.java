package Sort;

/**
 * 希尔排序，时间复杂度与步长的选择有关，大概为O(nlgn),不稳定排序，辅助空间o(1)
 */
public class ShellSort extends AbstractSort {

    @Override
    int[] sort(int[] in) {
        for (int gap = in.length / 2; gap > 0; gap /= 2) //步长
            for (int i = 0; i < gap; i++)  //总共分为gap组数据，分别进行直接插入排序
            {
                for (int j = i + gap; j < in.length; j += gap) //每组数据
                    if (in[j] < in[j - gap]) { //若前面大于后面
                        int temp = in[j]; //缓存后面的值
                        int k = j - gap;
                        //开始遍历比较每组数据，从第一个开始看，假定前面k个都是有序数组，寻找位置插入temp
                        while (k >= 0 && in[k] > temp) {
                            //直接交换效率低，转而算出最终位置，再交换
                            in[k + gap] = in[k];
                            k -= gap;
                        }
                        in[k + gap] = temp;
                    }
            }
        return in;
    }
}
