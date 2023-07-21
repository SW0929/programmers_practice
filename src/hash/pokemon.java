package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class pokemon {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,2};
        System.out.println(pokemonSolution02(nums));
    }
    public static int pokemonSolution(int[] nums) {
        int answer = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        //<종류 번호, 마리 수>
        /*
        종류 번호를 키로 하여 같은 종류 번호가 나올 경우
        마리 수 1씩 증가하며 초기 값 1
        */
        for (Integer p : nums){
            hm.put(p, hm.getOrDefault(p,0)+1);
        }
        /*
        포켓몬 종류가 N/2 보다 작을 경우
        종류의 개수를 반환
        포켓몬 종류가 N/2 보다 클 경우
        N/2 를 반환
        */
        if (hm.size() < nums.length / 2){
            answer = hm.size();
        }else {
            answer = nums.length / 2;
        }
        return answer;
    }

    public static int pokemonSolution02(int[] nums) {
        return Arrays.stream(nums)
                .boxed() //Integer 타입 Stream으로 변환.
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        //collect()는 Stream의 데이터를 변형 등의 처리를 하고 원하는 자료형으로 변환해 줍니다.
                        //collectingAndThen 은 Collecting을 진행한 후 그 결과로 메서드를 하나 더 호출 할 수 있게 해줍니다.
                        /*
                        Set instance로 변환하고 포켓몬 종류와 N/2를 비교하여
                        작은 값을 반환
                        */
                        pokemons -> Integer.min(pokemons.size(), nums.length/2)));
    }
}
