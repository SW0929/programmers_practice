package hash;

import java.util.*;

public class best_album_java {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        System.out.println(Arrays.toString(bestAlbumSolution(genres, plays)));
    }
    static class Music{
        String genre;
        int play;
        int idx;
        public Music(String genre, int play, int idx){
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }
    public static int[] bestAlbumSolution(String[] genres, int[] plays) {

        //장르 별 총 재생횟수 HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < genres.length; i++){
            hm.put(genres[i], hm.getOrDefault(genres[i], 0) + plays[i]);
        }

        // 장르 선정
        ArrayList<String> arrayList = new ArrayList<>();
        while (hm.size() != 0){
            int max = -1;
            String max_key = "";
            for (String key : hm.keySet()){
                int tmp_cnt = hm.get(key);
                if (tmp_cnt > max){
                    max = tmp_cnt;
                    max_key = key;
                }
            }
            arrayList.add(max_key);
            hm.remove(max_key);
        }
        //장르 내 노래 선정
        ArrayList<Music> result = new ArrayList<>();
        for (String gern : arrayList){
            ArrayList<Music> list = new ArrayList<>();
            for (int i = 0; i < genres.length; i++){
                if (genres[i].equals(gern)){
                    list.add(new Music(gern, plays[i], i));
                }
            }
            Collections.sort(list, (o1, o2) -> o2.play - o1.play); //내림차순 sort
            result.add(list.get(0)); //최소 1개 수록
            if (list.size() >= 2){ //노래 2개 이상인 경우
                result.add(list.get(1));
            }
        }
        //결과
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++){
            answer[i] = result.get(i).idx;
        }
        return answer;
    }
}
