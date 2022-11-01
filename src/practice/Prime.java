package practice;

import java.util.ArrayList;
import java.util.List;

public class Prime {
    // list에 가장 작은 소수(2)를 넣어두고, 반복문을 돌리며 소수로 나누어 떨어지는지 여부를 확인
    public int number(int n){
        int a=0;
        List<Integer>list = new ArrayList<Integer>();
        list.add(2);

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < list.size(); j++) {
                if(i % list.get(j) == 0) break;
                if(list.size() == j+1) list.add(i);
            }
        }
        return list.size();
    }
}
