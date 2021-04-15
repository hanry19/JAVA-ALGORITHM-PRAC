package StringSearching;

import java.util.Scanner;

public class Day7 {

    public String sol(String str) {

        String answer = "YES";

        // length /2 를 했을 때 길이가 짝수인 경우 딱 맞게 떨어지고 홀수의 경우 가운데 숫자는 그냥 그대로 있는다.

        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) return "no";
            // i번째 글자가 총 길이 - i -1 (끝자리) 글자랑 일치하지 않으면 no를 반환
        }

        return answer;
    }

    public static void main(String[] args) {
        Day7 t = new Day7();
        Scanner scan = new Scanner(System.in);

        String input = scan.next();
        input = input.toUpperCase();

        System.out.println(t.sol(input));
    }

//
//    public String sol(String str) {
//        String answer = "NO";
//        String tmp = new StringBuilder(str).reverse().toString();
//
//        if (str.equals(tmp)) return "YES";          // 단순 비교
//        if (str.equalsIgnoreCase(tmp)) return "YES"; // 대소문자 무시
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Day7 t = new Day7();
//        Scanner scan = new Scanner(System.in);
//        String input = scan.next();
//        input = input.toUpperCase();
//
//        System.out.println(t.sol(input));
//    }
}



