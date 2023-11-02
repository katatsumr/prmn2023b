package lecture02;

public class Login {
    String name;
    int num;
    Login(String user_name,int number){
        this.name = user_name;
        this.num = number;
    }

    void message(String name_n,int num_n){
        if(name.equals(name_n)){
            if(num == num_n){
                System.out.println("ログイン成功");
                return;
            }else {
                System.out.println("ログイン失敗");
                return;
            }
        }else {
            System.out.println("error!");
            return;
        }
    }
}
