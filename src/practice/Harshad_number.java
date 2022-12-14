package practice;

// 예를 들어 12는 각 자릿수 숫자의 합이 1+2=3이고,
// 12가 3으로 나누어떨어지므로 12는 10진법에서 하샤드 수다.
// 그러나 16은 1+6=7이고, 16이 7로 나누어떨어지지 않으므로 16은 10진법에서 하샤드 수가 아니다.
public class Harshad_number {
    public boolean harshad(int x){
        int mox = x;
        int sum = 0;
        while (x != 0){
            sum += x % 10;
            x /= 10;
        }
        return  mox % sum == 0 ? true : false;
    }

}
