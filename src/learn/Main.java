package learn;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    System.out.println("hello world");
	    System.out.print("请输入您的姓名:");
	    String m = input.next();
	    System.out.println("你好！" + m + "同学。");
        input.close();
    }
}
