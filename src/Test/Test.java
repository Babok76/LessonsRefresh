package Test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println();
        int sum = 0;
        int target = 10;
        int[] nums = new int[11];
        int n = nums.length;

//заполнение массива
        for (int i = 0; i < nums.length; i++) {
            int a = (int) (Math.random() * 11);
            nums[i] = a;
        }

//сотртировка массива
        Arrays.sort(nums);
        System.out.println("ќтсортированный массив: ");
        for (int x : nums) {
            System.out.println(x);
        }

//разделение массива
        int[] a = Arrays.copyOfRange(nums, 0, (n + 1) / 2);
        int[] b = Arrays.copyOfRange(nums, (n + 1) / 2, n);
        System.out.println("перва€ половины массива:");
        System.out.println(Arrays.toString(a));
        System.out.println("втора€ половина массива:");
        System.out.println(Arrays.toString(b));

//сравнивание элементов массива и выбор какие складывать дл€ резьтата
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                sum = a[i] + b[j];
                if (sum == target) {
                    System.out.println("¬ы вывели таргет!!! "+"¬ыбранные числа: "+a[i]+ " " + b[j]);
                    break;
                }
            }
        }
    }
}
