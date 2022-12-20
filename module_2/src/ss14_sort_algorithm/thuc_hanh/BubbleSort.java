package ss14_sort_algorithm.thuc_hanh;

public class BubbleSort {
    static int[] list = {2, 6, -1, 3, -12, 9, 8};

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int value : list) {
            System.out.println(value + " ");
        }
    }
}
