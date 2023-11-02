package lecture02;

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
}
