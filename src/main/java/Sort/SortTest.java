package Sort;

public class SortTest {
    public static void main(String[] args) {
        String input = "9,6,88,65,7,4,4,4,3,2,1,90,66,55,53,52,32,33,33,31,2";
        //String input = "9,6,7,4,4,3";
        AbstractSort s = new PopSort();
        AbstractSort s2 = new SelectionOrder();
        AbstractSort s3 = new InsertSort();
        AbstractSort s4 = new ShellSort();
        AbstractSort s5 = new QuickSort();
        AbstractSort.toString(s.sort(input));
        AbstractSort.toString(s2.sort(input));
        AbstractSort.toString(s3.sort(input));
        AbstractSort.toString(s4.sort(input));
        AbstractSort.toString(s5.sort(input));
    }
}
