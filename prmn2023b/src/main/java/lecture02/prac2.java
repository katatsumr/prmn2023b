package lecture02;

public class prac2 {
    public static void main(String[] args) {
        int[] num = new int[5];
        int sum ;
        Keisan keisan = new Keisan();
        sum = keisan.goukei(num);
        keisan.hantei(sum);
    }
}
