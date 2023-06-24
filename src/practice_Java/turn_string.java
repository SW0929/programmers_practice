package practice_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class turn_string {
    public static void main(String[] args) throws IOException {
        //1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        String[] a = string.split("");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        //2
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        for (char c : b.toCharArray()){
            System.out.println(c);
        }
    }
}
