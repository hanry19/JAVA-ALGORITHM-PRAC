package StringSearching;

import java.util.Scanner;

public class Day10 {

/*설명

한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
문자열의 길이는 100을 넘지 않는다.

출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.*/

    public int[] sol(String s, char t) {
        int[] answer = new int[s.length()]; // 입력한 값에 대한 길이의 배열이 생김

        int init = 1000;

        // 왼쪽에서 오른쪽
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==t) {
                init = 0;
                answer[i] = init;
            }else {
                init++;
                answer[i] = init;
            }
        }

        //오른쪽에서 왼쪽
        init = 1000;
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i)==t) {
                init = 0;
            }else {
                init++;
                answer[i] = Math.min(answer[i], init);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Day10 t = new Day10();
        Scanner scan = new Scanner(System.in);

        String input = scan.next();

        char c = scan.next().charAt(0);

        for (int x: t.sol(input,c)) {
            System.out.print(x + " ");
        }
    }
}


