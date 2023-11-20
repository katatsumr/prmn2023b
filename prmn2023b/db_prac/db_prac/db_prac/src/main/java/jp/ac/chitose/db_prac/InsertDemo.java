package jp.ac.chitose.db_prac;

import java.sql.SQLException;
import java.util.Scanner;

public class InsertDemo {
    public static void main(String[] args) {
        System.out.print("中間テストの得点を追加する学生は？：");
        Scanner scan = new Scanner(System.in);
        String gakusekiCode = scan.nextLine();

        System.out.print("その学生の名前は？\n姓：");
        String familyName = scan.nextLine();

        System.out.print("名：");
        String firstName = scan.nextLine();

        System.out.print(gakusekiCode + "の得点は？");
        int point = Integer.valueOf(scan.nextLine());

        try {
            PreExamDAO preExamDAO = new PreExamDAO();
            int n =  preExamDAO.inserPreExam(gakusekiCode, familyName, firstName, point);
            System.out.println(n);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
