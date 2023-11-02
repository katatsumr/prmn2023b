package lecture02;

import java.util.Scanner;

public class Keisan {
    int goukei(int[] num){
        int sum = 0;
        num = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i < 5;i++){
            System.out.printf("数字 %d つ目",i+1);
            num[i] = scan.nextInt();
            sum += num[i];
            System.out.println(" ");
        }
        System.out.println(sum);
        return sum;
    }

    void hantei(int sum){
        if(sum>=100){
            System.out.println("great!");
        } else if (sum>=50) {
            System.out.println("big");
        }else {
            System.out.println("small");
        }

    }
}
