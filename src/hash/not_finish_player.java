package hash;

import java.util.Arrays;
import java.util.HashMap;

public class not_finish_player {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(notFinishPlayerSolution02(participant, completion));
    }
    public static String notFinishPlayerSolution(String[] participant, String[] completion) {
        String answer = "";
        if (participant.length == 1 && completion.length == 0){
            return participant[0];
        }
        Arrays.sort(participant);
        Arrays.sort(completion);
        HashMap<Integer, String> participantHashMap = new HashMap<Integer, String>();
        HashMap<Integer, String> completionHashMap = new HashMap<Integer, String>();
        for(int i = 0; i < participant.length; i++){
            participantHashMap.put(i,participant[i]);
            if (i < completion.length){
                completionHashMap.put(i,completion[i]);
            }else {
                completionHashMap.put(i,"null");
            }
        }
        for(int i = 0; i < completionHashMap.size(); i++){
            if (completionHashMap.get(i).equals(participantHashMap.get(i))){
                continue;
            }else {
                answer = participantHashMap.get(i);
                break;
            }
        }
        return answer;
    }
    public static String notFinishPlayerSolution02(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        //중복 키가 없을 경우 1 값이며 중복 키가 있을 경우 1씩 증가
        //즉, 동명이인이 2명일 경우 value 값이 2
        for (String player : participant)
            hm.put(player,hm.getOrDefault(player,0)+1);
        //완주한 사람의 value 값을 -1
        //0일 경우 완주한 사람
        for (String player : completion)
            hm.put(player, hm.get(player)-1);

        //완주하지 못한 사람은 1명이기 때문에 value 값이 0이 아닌 사람
        for (String key : hm.keySet()){
            if (hm.get(key) != 0){
                answer = key;
                break;
            }
        }
        return answer;
    }
}
