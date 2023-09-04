package Test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println();
        int sum = 0;
        int target = 10;
        int[] nums = new int[11];
        int n = nums.length;

//���������� �������
        for (int i = 0; i < nums.length; i++) {
            int a = (int) (Math.random() * 11);
            nums[i] = a;
        }

//����������� �������
        Arrays.sort(nums);
        System.out.println("��������������� ������: ");
        for (int x : nums) {
            System.out.println(x);
        }

//���������� �������
        int[] a = Arrays.copyOfRange(nums, 0, (n + 1) / 2);
        int[] b = Arrays.copyOfRange(nums, (n + 1) / 2, n);
        System.out.println("������ �������� �������:");
        System.out.println(Arrays.toString(a));
        System.out.println("������ �������� �������:");
        System.out.println(Arrays.toString(b));

//����������� ��������� ������� � ����� ����� ���������� ��� ��������
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                sum = a[i] + b[j];
                if (sum == target) {
                    System.out.println("�� ������ ������!!! "+"��������� �����: "+a[i]+ " " + b[j]);
                    break;
                }
            }
        }
    }
}
