package practice;

public class Prime {
    // 1. 1부터 N(자기 자신)으로 나누어 나머지가 '0'인 횟수를 체크한다.
    // (이때, N이 증가할 때마다 count가 초기화 되어야 하므로 중첩 for문 외부에 작성)
    // 2. 조건문을 통해 count가 2인 수를 출력하여 소수를 추출한다.
    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++) {
            int count = 0;

            for(int j = 1; j <= i; j++) {
                if(i%j == 0) {
                    count++;
                }
            }

            if(count == 2) {
                System.out.println(i);
            }
    }
}
