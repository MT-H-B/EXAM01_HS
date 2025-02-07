package TASK_00;

import java.util.Arrays;
import java.util.Scanner;

public class Task_05 {
    public static void reverseArray(int[] Array){
        int min=0,  max = Array.length-1;
        while (min<max){
            int temp = Array[min];
            Array[min]=Array[max];
            Array[max]=temp;
            min++;
            max--;
        }
    }

    public static void main(String[] args) {
        System.out.println("reverse number : ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int Array[] = new int[number];
        for (int i = 0; i < number; i++) {
            Array[i] = in.nextInt();
        }
        reverseArray(Array);
        System.out.println(Arrays.toString(Array));
    }
}
