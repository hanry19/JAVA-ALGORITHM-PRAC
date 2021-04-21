package StringSearching;

import java.util.Scanner;

public class Day9 {


/*설명

문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.

입력
첫 줄에 숫자가 썩인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.


출력
첫 줄에 자연수를 출력합니다.*/

//    public String sol(String s) {
//        ;
//
//        // temp = s의 문자열을 뒤집은 것을 String화 한다.xxx
//
//        if(s.equals(temp)) answer = "yes";
//        // 만약 입력받은 문자열과 temp(뒤집어진 문자열)이 같으면 "yes"
//
//
//        return answer;
//    }
//
//
//    public static void main(String[] args) {
//        Day9 t = new Day9();
//        Scanner scan = new Scanner(System.in);
//
//        String input = scan.nextLine();

//        String s = input.toUpperCase().replaceAll("[^0-9]", "")
//        System.out.println(t.sol(input));
//    }
/*

    answer =  answer * 10 + (x - 48)
                 0 * 10 ( 0(아스키:48) - 48) = 0
                 0 * 10 ( 1(아스키:49) - 48) = 1
                 1 * 10 ( 2(아스키:50) - 48) = 2

*/

    public int sol(String str) {
        int answer =0;
        for (char c : str.toCharArray()) {
            if (c > 48 && c < 57) {
                answer = answer * 10 + (c - 48);
            }
        }
            return answer;
    }

    public static void main(String[] args) {
        Day9 t = new Day9();

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        System.out.println(t.sol(input));
    }
}
