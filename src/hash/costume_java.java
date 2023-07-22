package hash;

import java.util.Arrays;
import java.util.HashMap;

public class costume_java {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(costumeJavaSolution(clothes));
    }
    /*
    1. 각 종류에 해당하는 의류의 개수를 구한다. (hash map)
    2. 각 종류에 해당하는 의류의 개수에 1을 더한 뒤 각각 곱한다.
    3. 모두 입지 않은 경우인 1을 뺀다
     */
    public static int costumeJavaSolution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < clothes.length; i++){
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0)+1);
        }
        for (int c : hm.values()){
            answer *= c + 1;
        }
        answer -= 1;
        return answer;
    }
}
