package practice;


import java.util.HashMap;

public class Player {
    public String solution(String[] Participant, String[] Completion){
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : Participant)
            map.put(player, map.getOrDefault(player, 0) + 1);
        for (String player : Completion)
            map.put(player, map.get(player) - 1);

        for (String key : map.keySet()){
            if (map.get(key) > 0)
            {
                answer = key;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        Player sol = new Player();
        System.out.println(sol.solution(part, comp));
    }
}
