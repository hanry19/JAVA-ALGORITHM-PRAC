package StringSearching;

import java.util.Scanner;

public class Day2Prac {
    Scanner scan = new Scanner(System.in);

    public void q1() {
            /*
            설명
                한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가
                입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
                대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.

            입력
                첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
                문자열은 영어 알파벳으로만 구성되어 있습니다.

            출력
                첫 줄에 해당 문자의 개수를 출력한다.*/

       String input = scan.next();
        char find = scan.next().charAt(0);

        input = input.toUpperCase();
        find = Character.toUpperCase(find);

        int count = 0;
        for (char x : input.toCharArray()) {
            if(x ==find) ++count;

        }
        System.out.println("count = " + count);


    }

    public void q2() {
    /*2. 대소문자 변환
    설명

     대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

    입력
    첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
    문자열은 영어 알파벳으로만 구성되어 있습니다.

    출력
    첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.*/

        String input = scan.next();
//        String[] inputs = input.split("");
        String result = "";
        for (char x: input.toCharArray()) {
            if (Character.isUpperCase(x) == true) {
                result += Character.toLowerCase(x);
            } else {
                result += Character.toUpperCase(x);
            }

        }
        System.out.println("result = " + result);



    }

    public void q3() {
        /*3. 문장 속 단어
            설명

            한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
            문장속의 각 단어는 공백으로 구분됩니다.

            입력
            첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.

            출력
            첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한다 */

        String input = scan.nextLine();

        int min = Integer.MIN_VALUE;

        String[] inputs = input.split(" ");

        String temp ="";

        for (String x : inputs) {
            if (x.length() > min) {
                min = x.length();
                temp = x;
            }
        }
        System.out.println("temp = " + temp);


    }



    public static void main(String[] args) {
        Day2Prac a = new Day2Prac();
//        a.q1();
//        a.q2();
        a.q3();



    }

}
