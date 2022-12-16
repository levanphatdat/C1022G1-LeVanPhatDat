package ss10_DSA_stack_queue.bai_tap.WordOfString;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

class WordOfString {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scanner.nextLine().toLowerCase();
        String[] arr = str.split(" ");
        for (String index : arr) {
            if (treeMap.containsKey(index)) {
                int count =treeMap.get(index);
                count++;
                treeMap.put(index, count);
            } else {
                treeMap.put(index, 1);
            }
        }
        System.out.println("The number of occurrences of each word in a string is: ");
        System.out.println(treeMap);
    }
}
