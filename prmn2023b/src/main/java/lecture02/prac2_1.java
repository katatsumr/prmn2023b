package lecture02;

import java.sql.Struct;
import java.util.Scanner;

public class prac2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("名前を入力してください");
        String name = input.next();
        System.out.println("学籍番号を入力してください");
        int bango = input.nextInt();
        System.out.printf("氏名: %s,学籍番号:b%d",name,bango );
    }
}
