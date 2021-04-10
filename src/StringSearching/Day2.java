package StringSearching;

import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine(); //문장을 전달해야하니까 nextLine으로 한다.
        String result = "";

        int m = Integer.MIN_VALUE, pos; // 인트가 출력할 수 잇는 가장 작은 값으로 출력 됨

        while((pos = input.indexOf(' '))!=-1){      //띄워쓰기 위치를 반환 해줌 못하면 -1
            // I am your father. 띄워쓰기 위치
            // index번호로 i = 0 , ' '= 1, a =2 ...
            // 위 처럼 띄워쓰기가 처음 발견되는  1을 반환하게 된다. 그럼 여기서 substring으로 잘라내면 되겟지?

            String tmp = input.substring(0, pos); // 0 부터 시작해서 pos전까지 잘라내는 것
            // temp 가 그럼 i가 됨!

            int len = tmp.length();
            if(len>m){      // 여기서 >=로 하면  뒤에서 같은 단어가 발견되면 뒤에껄 가르키게 된다
                m = len;    //그래서 > 로 해야한다.
                result = tmp;
            }
            input = input.substring(pos + 1);
            // input = "I am your father" 이 계속 반복하게 되면 indexof는 공백을 I와 am 사이의 공백만 찾음
            // 그러니까 pos(첫번째 공백위치)에 +1을 해줘서 계속 진행하게 만든다.
            // 하지만 이 때 your 다음의 공백에서는 더 이상 공백이 없으니까 father을 인식하지 못하고 -1을 반환한다
        }
        // 그렇기에 마지막 남은 fatehr(input)의 길이가 father이전의 제일 긴 문자(m)과 한번 더 비교한다.
        if(input.length()>m) result = input;
        System.out.println("result = " + result);





/*
// 방법 1.

        int m = Integer.MIN_VALUE; // 인트가 출력할 수 잇는 가장 작은 값으로 출력 됨

        // split() 특정 문자로 구분해서 배열로 저장하는것
        String[] s = input.split(" ");

        for(String x : s){
            int len =  x.length(); //각각의 단어길이가 len에 저장된다.
            if(len > m){  // 최대값 구하는 알고리즘
                m=len;
                result = x;
            }
        } System.out.println("result = " + result);
*/


    }
}
