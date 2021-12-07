package algorithm.programmers.lv1;

import java.util.Arrays;

public class K번째수 {
    public static void main(String[] args) {
        solution(new int[]{1,2,3,45,6,7}, new int[][]{{1,2,3},{4,5,6}});
    }
    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = {};
        answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] newArr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(newArr);
            answer[i] = newArr[commands[i][2] - 1];

        }
        return answer;

    }

    public int[] repeat(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
