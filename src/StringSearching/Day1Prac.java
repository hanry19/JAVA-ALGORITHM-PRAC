package StringSearching;

import java.util.Locale;
import java.util.Scanner;

public class Day1Prac {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.next();
        char find = scan.next().charAt(0);

        int count = 0;
        input = input.toUpperCase();
        find = Character.toUpperCase(find);

//
//        for (int i = 0; i < input.length(); i++) {
//            if(input.charAt(i)==find) ++count;
//        }
//        System.out.println("count = " + count);

        for (char x: input.toCharArray()) {
            if(x == find) ++count;

        }
        System.out.println("count = " + count);

    }


}
