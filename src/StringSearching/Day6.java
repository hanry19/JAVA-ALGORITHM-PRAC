package StringSearching;

import java.util.Scanner;

public class Day6 {
/*    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] inputs = input.toCharArray();
        String asnwer = "";

        for (char x : inputs) {
            if (!(asnwer.contains(String.valueOf(x)))) {
                asnwer += String.valueOf(x);
            }
        }
        System.out.println("result = " + asnwer);

    }*/

    public String sol(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));


//                입력값  : ksekkset
//                k 0 0       k = 이 문자열의 위치 = 0, 처음 등장하는 위치도 0
//                s 1 1
//                e 2 2
//                k 3 0       k = 자기 위치는 index번호가 3인데, 처음 발견되는 곳은 0이다
//                k 4 0           ==> 중복 문자임을 증명
//                s 5 1
//                e 6 2
//                t 7 7



            if (str.indexOf(str.charAt(i)) == i) {
                // i 번째 문자의 index와 i가 같을 경우에만  문자 누적!
                result += str.charAt(i);
            }
                    }
        return result;
    }

    public static void main(String[] args) {
        Day6 t = new Day6();
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        System.out.println(t.sol(input));

    }

}



