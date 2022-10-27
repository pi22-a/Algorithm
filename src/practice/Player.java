package practice;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Player {
    public String solution(String[] Participant, String[] Completion){
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : Participant)
            map.put(player, map.getOrDefault(player, 0) + 1);
        for (String player : Completion)
            map.put(player, map.get(player) - 1);

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
    }
    public static void main(String[] args){
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
    }
}
