package StringSearching;

import java.util.Scanner;

public class Day12 {

    public String sol(int num, String str) {
        String ans = "";

        for (int i = 0; i < num; i++) { // 우린 4개의 문자를 반환해야하기에, num-1까지 반복을 한다.
            String tmp = str.substring(0, 7).replace('#','1').replace('*','0');
            // 주어진 암호문의 첫번째 (0) 부터 일곱번째 문자 전까지 tmp에 담는다.
            // 그리고 이렇게출력하면 앞에만 계속 출력하기에, substring을 이용하여 문자열을 잘라낸다.
            //  문자열 추출이 잘 되는걸 확인했으면 replace 를 이용하여 # 은 1로, *은 0 으로 변환해준다.
            // 변환해준 문자는 10준수화시진다 parseInt(temp,2);
            // 인자를 string tmp가 들어가고 2진수로 바꾸는 것이다.
            int number = Integer.parseInt(tmp, 2);

            // 반대로 10진수를 2,8,16 진수로 바꿀 경우 아래와 같이 한다.
            // Integer.toBinaryString();
            // Integer.toOctalString();
            // Integer.toHexString();


            // 형변환없이 number를 넣으면 int값이 들어가기 때문에 문자열로 바꾸서 입력한다.
            ans += (char)number;

            str = str.substring(7); //substring(숫자(0~x)) 하면 숫자 이전의 값들은 잘라낸다.
        }
        return ans;
    }


    public static void main(String[] args) {
        Day12 day12 = new Day12();
        Scanner scan = new Scanner(System.in);

        // 문자열 갯수 입력
        int num = scan.nextInt();

        String str = scan.next();

        System.out.println(day12.sol(num, str));

    }
}
