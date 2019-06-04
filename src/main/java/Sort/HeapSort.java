package Sort;

/**
 * 堆排序，时间复杂度 o(nlgn)，不稳定排序，额外空间o(1)
 *
 * 堆排序算法里，是以数组表示的堆，其数据结构中的每个节点的索引值存在这样的特点：
 * 对于节点i，其父节点索引为 (i-1)/2,其左子节点为 i*2+1,右子节点为i*2+2
 *
 */
public class HeapSort extends AbstractSort {

    @Override
    int[] sort(int[] o) {

        int[] in=new int[o.length];
        System.arraycopy(o,0,in,0,o.length);

        /*
         *  第一步：将数组堆化
         *  beginIndex = 第一个非叶子节点。
         *  从第一个非叶子节点开始即可。无需从最后一个叶子节点开始。
         *  叶子节点可以看作已符合堆要求的节点，根节点就是它自己且自己以下值为最大。
         */
        int lastLeafIndex = in.length - 1;
        int beginIndex = (lastLeafIndex - 1) / 2;
        for (int i = beginIndex; i >= 0; i--){
            maxHeapify(in, i, lastLeafIndex);
        }
        /*
         * 第二步：对堆化数据排序
         * 每次都是移出最顶层的根节点A[0]，与最尾部节点位置调换，同时遍历长度 - 1。
         * 然后从新整理被换到根节点的末尾元素，使其符合堆的特性。
         * 直至未排序的堆长度为 0。
         */
        for (int i = lastLeafIndex; i > 0; i--) {
            swap(in, 0, i);
            //此时只有顶部的数是不符合大顶堆的，从顶部开始向下堆化
            maxHeapify(in, 0, i - 1);
        }
        return in;
    }

    /**
     * 调整索引为 index 处的数据，使其符合堆的特性。
     *
     * @param arr
     * @param parentNodeIndex 需要堆化处理的数据的索引
     * @param lastLeafIndex   未排序的堆（数组）的长度
     */
    private void maxHeapify(int[] arr, int parentNodeIndex, int lastLeafIndex) {
        int li = (parentNodeIndex * 2) + 1, // 左子节点索引
            ri = li + 1,                     // 右子节点索引
            cMax = li;                       // 子节点值最大索引，默认左子节点。

        if (li > lastLeafIndex)
            return;      // 左子节点索引超出计算范围，直接返回。

        if (ri <= lastLeafIndex && arr[ri] > arr[li]){
            // 先判断左右子节点，哪个较大。
            cMax = ri;
        }

        // 如果子节点大于父节点，则调换
        if (arr[cMax] > arr[parentNodeIndex]) {
            swap(arr, cMax, parentNodeIndex);
            // 调换完后cMax处存的是之前的父节点，继续查看父节点与其现在子节点否符合堆的特性。
            maxHeapify(arr, cMax, lastLeafIndex);
        }
    }
}
