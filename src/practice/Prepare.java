package practice;

public class Prepare {
    public int[] solution(int[] answer){
        int[] su1 = {1,2,3,4,5};
        int[] su2 = {2,1,2,3,2,4,2,5};
        int[] su3 = {3,3,1,1,2,2,4,4,5,5};

        int[] count = new int[3];

        for (int i=0; i<answer.length; i++){
            if(answer[i] == su1[i%5]) count[0]++;
            if(answer[i] == su2[i%8]) count[1]++;
            if(answer[i] == su3[i%10]) count[2]++;
        }




        return answer;
    }
