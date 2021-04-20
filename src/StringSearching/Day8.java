package StringSearching;

import java.util.Scanner;

public class Day8 {

    public String sol(String s) {
        String answer = "no";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
                                    //대문자 A~Z가 아니면, 아닌것들은 "" 빈문자로 만들어라

        System.out.println("s = " + s);  // 대문자만 출력되는걸 확인할 수 있다.

        String temp= new StringBuilder(s).reverse().toString();
        // temp = s의 문자열을 뒤집은 것을 String화 한다.xxx

        if(s.equals(temp)) answer = "yes";
        // 만약 입력받은 문자열과 temp(뒤집어진 문자열)이 같으면 "yes"


        return answer;
    }


    public static void main(String[] args) {
        Day8 t = new Day8();
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        input = input.toUpperCase();

        System.out.println(t.sol(input));
    }

}
