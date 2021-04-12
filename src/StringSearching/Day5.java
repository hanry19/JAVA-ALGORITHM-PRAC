package StringSearching;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Day5 day5 = new Day5();
        String in = scan.next();

        char[] aa = in.toCharArray();

            int start = 0, done = aa.length - 1;

            while (start < done) {
                if (!Character.isAlphabetic(aa[start])) start++;
                else if(!Character.isAlphabetic(aa[done])) done--;
                else {
                    char temp = aa[start];
                    aa[start] = aa[done];
                    aa[done] = temp;
                    start++;
                    done--;
                }
            }

        String temp = String.valueOf(aa);
        System.out.println(temp);
    }
}

/*

         lt                        rt
         a  #  b  !  G  E  *  T  @  S
         toCharArray로 문자배열로 만든다.
         lt and rt가 가르키는게 특수문자인지 영어인지 확인 해야함. 만약 둘다가 알파벳이면 뒤집어야 하는 것.
         이 로직이 패턴이니까 while로 반복 하다가 lt가 특수문자냐? 라고 물어봐서 증가 시켜버렷
             if( start == 특수문자){
                 start ++;
             } else if (done == 특수문자) {
                 done--;
             }else {
                 둘다 특수 문자가 아니면 알파벳!
                     그러니까 뒤집기 구현
             }


*/



