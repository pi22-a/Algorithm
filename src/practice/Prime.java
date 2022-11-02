package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Prime {
    public int solution(int n) {
        int anwser = 0;
        boolean[] arr = new boolean[n + 1];

        for (int i = 2; i * i <= n; i++) {
            if (!arr[i]) {
                for (int j = i + i; j <= n; j += i) arr[j] = true;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!arr[i]) anwser++;
        }
        return anwser;
    }
}
