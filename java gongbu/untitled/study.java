import java.sql.SQLOutput;

public class study {
    public static void main(String[] args) {
        System.out.println("문자열");
        System.out.println('문');
        System.out.println("안녕 나는 \"자바\"야.");
        System.out.println("치킨은 살 안쪄요.\n살은 내가쪄요.");
        //주석처리하는법
        /*
        긴문장 주석
         */
        int number;
        number = 3;
        System.out.println(number);
        int ratio = 15;

        System.out.println(100*ratio / 100.0);
        System.out.println(300*ratio/100.0);
        System.out.println(1000*ratio/100.0);
        System.out.println(10000*ratio/100.0);
        int []names = {10, 20, 30};
        System.out.println(names[0]);
        System.out.println(2+3); //덧셈
        System.out.println(5-3); //뺄셈
        System.out.println(4*5); //곱셈
        System.out.println(6%3); //나머지
        System.out.println(10/2); //나누기

    }
}