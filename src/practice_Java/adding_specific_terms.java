package practice_Java;

import java.util.stream.IntStream;

public class adding_specific_terms {
    public static void main(String[] args) {
        boolean[] booleans = {true,false,false,true,true};
        System.out.println(addingSpecificTermsSolution(3,4,booleans));
    }
    public static int addingSpecificTermsSolution(int a, int d, boolean[] included) {
        int answer = 0;
        int add = a;
        for (int i = 0; i < included.length; i++){

            if (included[i]){

                answer += add;
            }
            add += d;
        }
        return answer;
    }
    public int addingSpecificTermsSolution02(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length).map(idx -> included[idx] ? a+(idx*d) : 0).sum();
    }
}
