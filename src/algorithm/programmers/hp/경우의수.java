package algorithm.programmers.hp;

import java.util.Stack;

class 경우의수 {

    static int[][] arr;
    static boolean[] check;
    static Stack<Integer> st;

    public static void main(String[] args) {
        System.out.println(combination(2, 2));
    }

    public int solution(int N) {
        int answer = 0;



        return answer;
    }

    public static int combination(int i, int j) {
        if (j == 0) {
            return 1;
        } else {
            return  combination(i - 1, j - 1) + combination(i - 1, j);
        }

    }
}
