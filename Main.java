import java.util.Scanner;

public class Main {
    public static int MaxSubSumOfSequence(int[] list) {
        if (list == null || list.length == 0) {
            throw new IllegalArgumentException("error");
        }
        int max = Integer.MIN_VALUE;
        int currentMax = 0;
        for (int i : list) {
            if (currentMax <= 0) {
                currentMax = i;
            } else {
                currentMax += i;
            }

            if (max < currentMax) {
                max = currentMax;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int size = 15;
        int[] List = new int[size];
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数组数字数");
        int len = sc.nextInt();
        System.out.println("请输入"+len+"个数字");
        for(int i=0;i<len;i++) {
            List[i] = sc.nextInt();
        }
        int max=MaxSubSumOfSequence(List);
        System.out.println(max);
    }
}
