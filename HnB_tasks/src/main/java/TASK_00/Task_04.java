package TASK_00;

import java.util.Scanner;
import java.util.Arrays;

public class Task_04 {
public static int sum (int [] n){
    int sum =0;
    for(int k=0; k<10; k++){
        sum += n[k];
    }
    return sum;
}
public static int average(int [] n) {
    int average = sum(n)/10;
    return average;
}

public static int max(int [] n) {
    Arrays.sort(n);
    int max = n[9];
    return max;
}

public static int min(int [] n ) {
    Arrays.sort(n);
    int min = n[0];
    return min;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        for (int i = 0; i < 10; i++) {
            n[i] = Integer.parseInt(sc.nextLine());
        }
        int total = sum(n);
        int Avg = average(n);
        int Max = max(n);
        int Min = min(n);

        System.out.println("합계 : " + total);
        System.out.println("평균 : " + Avg);
        System.out.println("최댓값 : " + Max);
        System.out.println("최솟값 : " + Min);
    }
}