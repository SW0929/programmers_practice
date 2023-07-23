package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class best_album_java {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        System.out.println(Arrays.toString(bestAlbumSolution(genres, plays)));
    }
    public static int[] bestAlbumSolution(String[] genres, int[] plays) {
        int[] answer = {};
        //장르 별 총 재생시간 HashMap
        HashMap<String, Integer> hm = new HashMap<>();
        //고유번호, 장르
        HashMap<Integer, String> hmGenres = new HashMap<>();
        //고유번호, 재생 시간
        HashMap<Integer, Integer> hmPlays = new HashMap<>();
        //장르 종류
        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < genres.length; i++){
            hm.put(genres[i], hm.getOrDefault(genres[i], 0) + plays[i]);
            hmGenres.put(i, genres[i]);
            hmPlays.put(i, plays[i]);
            hs.add(genres[i]);
        }

        System.out.println(hm);
        System.out.println(hmGenres);
        System.out.println(hmPlays);
        System.out.println(hs);

        return answer;
    }
}
