package lecture02;

import java.util.Objects;
import java.util.Scanner;

public class Gakuseki {
    void name(String number){
        Scanner scan = new Scanner(System.in);
        System.out.println("学籍番号を入力してください");
        String gakuseki = scan.next();
        if(number.equals( gakuseki)){
            System.out.println("complete!!");
        }else{
            System.out.println("error!!");
        }
    }

    void pass(String[][] number){
        Scanner scan = new Scanner(System.in);
        System.out.println("学籍番号を入力してください");
        String gakuseki = scan.next();
        for (String[] strings : number) {
            if (Objects.equals(gakuseki, strings[0])) {
                System.out.println("パスワードを入力してください");
                String password = scan.next();
                if (Objects.equals(password, strings[1])) {
                    System.out.println("ログイン完了");
                    return;
                } else {
                    System.out.println("不正なアクセス");
                    System.exit(0);
                }
            }
        }
        System.out.println("error!!");
        return;
    }
}
