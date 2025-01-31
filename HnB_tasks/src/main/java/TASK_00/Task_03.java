package TASK_00;

import java.util.Scanner; //Scanner 클래스 import 해야함.
//컴퓨터가 생각한 값을 맞추면 게임이 끝남.
public class Task_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //사용자의 입력을 받기 위해 Scanner 객체를 생성하는 코드
        int answer = (int)(Math.random()*100)+1; //1부터 100사이 난수 생성
        //System.out.print(answer+ " ");
        int num =0;

        for( ; ; ){
            System.out.print("1~100 사이의 수 입력 : ");
            int str = scan.nextInt();
            num++;
            if(str>answer){
                System.out.print("더 작습니다.");
                continue;
            }
            else if(str<answer){
                System.out.print("더 큽니다.");
                continue;
            }
            else if(str == answer){
                System.out.print("정답입니다. 총 횟수 : "+num+"회");
                break;
            }
        }
    }
}
