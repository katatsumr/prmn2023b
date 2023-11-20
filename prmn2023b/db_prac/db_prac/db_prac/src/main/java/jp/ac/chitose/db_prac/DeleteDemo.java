package jp.ac.chitose.db_prac;

import javax.sound.midi.Soundbank;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDemo {
    public static void main(String[] args) {
        System.out.print("中間テストで点数を削除する学生コードは？：");
        Scanner scan = new Scanner(System.in);
        String gakusekiCode = scan.nextLine();

        try {
            PreExamDAO dao = new PreExamDAO();
            int n = dao.deletPreExam(gakusekiCode);
            System.out.println();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
