package Sort;

/**
 * 希尔排序，时间复杂度 O(nlgn),不稳定排序
 */
public class ShellSort extends AbstractSort {

    @Override
    String[] sort(String input) {
        String[] arr = input.split(",");
        for (int gap = arr.length / 2; gap > 0; gap /= 2) //步长
            for (int i = 0; i < gap; i++)  //总共分为gap组数据，分别进行直接插入排序
            {
                for (int j = i + gap; j < arr.length; j += gap) //每组数据
                    if (Integer.valueOf(arr[j]) < Integer.valueOf(arr[j - gap])) { //若前面大于后面
                        int temp = Integer.parseInt(arr[j]); //缓存后面的值
                        int k = j - gap;
                        //开始遍历比较每组数据，从第一个开始看，假定前面k个都是有序数组，寻找位置插入temp
                        while (k >= 0 && Integer.valueOf(arr[k]) > Integer.valueOf(temp)) {
                            //直接交换效率低，转而算出最终位置，再交换
                            arr[k + gap] = arr[k];
                            k -= gap;
                        }
                        arr[k + gap] = String.valueOf(temp);
                    }
            }
        return arr;
    }
}
