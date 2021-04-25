package StringSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Day11 {

    public String sol(String str) {
        String solu = "";

        str =str+" ";
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) cnt++;
           else {
                solu += str.charAt(i);
                if(cnt>1) solu += String.valueOf(cnt); // int==> string    have 2 ways for change to string from int
//                    sol += Integer.toString(cnt); // int==> string
                    cnt = 1; // reset to count 1
            }
        }
        return solu;
    }


    public static void main(String[] args) {
        Day11 day11 = new Day11();
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        System.out.println(day11.sol(str));

    }
}
