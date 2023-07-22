package hash;

import java.util.Arrays;
import java.util.HashMap;

public class phone_number_list {
    public static void main(String args[]){
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(phoneNumberListSolution(phone_book));
    }
    public static boolean phoneNumberListSolution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length-1; i++){
            if (phone_book[i+1].startsWith(phone_book[i])){
                answer = false;
                break;
            }
        }
        return answer;
    }
}
