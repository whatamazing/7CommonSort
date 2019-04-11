package Sort;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] input = new int[]{9,9,77,66,6,88,65,7,4,4,4,3,2,1,90,66,2,33,33,31,2};
        AbstractSort s1 = new PopSort();
        AbstractSort s2 = new SelectionOrder();
        AbstractSort s3 = new InsertSort();
        AbstractSort s4 = new ShellSort();
        AbstractSort s5 = new QuickSort();
        AbstractSort s6 = new MergeSort();
        AbstractSort s7 = new HeapSort();

        System.out.println("初 始 数 组:" + Arrays.toString(input));
        System.out.println("pop    sort:" + Arrays.toString(s1.sort(input)));
        System.out.println("select sort:" + Arrays.toString(s2.sort(input)));
        System.out.println("insert sort:" + Arrays.toString(s3.sort(input)));
        System.out.println("shell  sort:" + Arrays.toString(s4.sort(input)));
        System.out.println("quick  sort:" + Arrays.toString(s5.sort(input)));
        System.out.println("merge  sort:" + Arrays.toString(s6.sort(input)));
        System.out.println("heap   sort:" + Arrays.toString(s7.sort(input)));
    }
}
