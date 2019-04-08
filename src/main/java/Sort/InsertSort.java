package Sort;

/**
 * 插入排序，时间复杂度：n^2，稳定排序
 */
public class InsertSort extends AbstractSort {
    @Override
    String[] sort(String input) {
        String[] in = input.split(",");
        //默认前i个都是已排好序的
        for (int i = 0; i < in.length-1; i++) {
            for (int j = 0; j <= i; j++) {
                if (Integer.valueOf(in[i + 1]) < Integer.valueOf(in[j])) {
                    //将i+1处的数插入到j
                    insert(in, j, i + 1);
                    //若相等，就放在其后一位
                } else if (in[i + 1].equals(in[j]) && i != j) {
                    insert(in, j + 1, i + 1);
                }
            }
        }
        return in;
    }

    /**
     * 将数组中cur位置的插入到des处，des后面的顺序后移
     * @param in  待排序数组
     * @param des 目标位置
     * @param cur 当前位置
     */
    private void insert(String[] in, int des, int cur) {

        //少执行一半的赋值语句
        String temp = in[cur];
        while (cur - des > 0) {
            in[cur] = in[cur-1];
            cur--;
        }
        in[des] = temp;

//        String temp = in[des];
//        in[des] = in[cur];
//        in[cur] = temp;
//        if (cur - des > 1) {
//            insert(in, des + 1, cur);
//        }
    }
}