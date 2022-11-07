package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 배열을 순회하며 divisor로 나누어 떨어지는 값을 list에 저장.
// list가 빈 경우(divisor로 나누어 떨어지는 element가 하나도 없는 경우) -1을 추가.
// 값을 오름차순으로 정렬 후 answer배열에 담아 return.
public class Divisor {
    public int[] solution(int[]arr, int divisor){
        List<Integer> list = new ArrayList<>();

        for (int n : arr) {
            if (n % divisor == 0) {
                list.add(n);
            }
        }

        if(list.isEmpty()) {
            list.add(-1);
        }

        Collections.sort(list);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;

    }

}
