package algorithm.programmers.lv1;

import java.util.ArrayList;

public class 모의고사 {

    public static void main(String[] args) {
        int[] case1 = {5,4,3,2,1};
        int[] case2 = {5, 4, 3, 2, 1, 5, 4, 3, 2, 1};

        practice(case2);

    }

    /**
     * [완전탐색]
     *
     * 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
     *
     * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
     * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
     * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
     *
     * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
     *
     * 제한 조건
     * 시험은 최대 10,000 문제로 구성되어있습니다.
     * 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
     * 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
     * 입출력 예
     * answers	return
     * [1,2,3,4,5]	[1]
     * [1,3,2,4,2]	[1,2,3]
     * 입출력 예 설명
     * 입출력 예 #1
     *
     * 수포자 1은 모든 문제를 맞혔습니다.
     * 수포자 2는 모든 문제를 틀렸습니다.
     * 수포자 3은 모든 문제를 틀렸습니다.
     * 따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.
     *
     * 입출력 예 #2
     *
     * 모든 사람이 2문제씩을 맞췄습니다.
     */
    public static int[] practice(int[] answers) {

        /** 5, 4, 3, 2, 1, 5, 4, 3, 2, 1 */
        int[] answer = {};

        System.out.print("answers is : ");
        for (int i : answers) {
            System.out.print(i + "    ");
        }
        System.out.println("");

        int[] su1Pattern = {1, 2, 3, 4, 5};
        int[] su2Pattern = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] su3Pattern = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] rArray = new int[3];

        for (int i = 0; i < answers.length; i++) {

//            System.out.println("answers[i] value ::  " + answers[i]);
//
//            System.out.println("i % su1Pattern.length ::  " + i % su1Pattern.length);
//            System.out.println("i % su2Pattern.length ::  " + i % su2Pattern.length);
//            System.out.println("i % su3Pattern.length ::  " + i % su3Pattern.length);
//
//            System.out.println("");
//
//            System.out.println("su1Pattern[i % su1Pattern.length] ::  " + su1Pattern[i % su1Pattern.length]);
//            System.out.println("su2Pattern[i % su2Pattern.length] ::  " + su2Pattern[i % su2Pattern.length]);
//            System.out.println("su3Pattern[i % su3Pattern.length] ::  " + su3Pattern[i % su3Pattern.length]);

            rArray[0] = answers[i] == su1Pattern[i % su1Pattern.length] ? ++rArray[0] : rArray[0];
            rArray[1] = answers[i] == su2Pattern[i % su2Pattern.length] ? ++rArray[1] : rArray[1];
            rArray[2] = answers[i] == su3Pattern[i % su3Pattern.length] ? ++rArray[2] : rArray[2];


        }
//        System.out.print("rArray loop output ::  ");
//        for (int i : rArray) {
//            System.out.print(i);
//        }
//        System.out.println("");

        int max = 0;
//        int maxCnt = 0;

        ArrayList<Integer> rList = new ArrayList<>();

        for (int i = 0; i < rArray.length; i++) {
            max = max < rArray[i] ? rArray[i] : max;
        }

        if (rArray[0] == max) rList.add(1);
        if (rArray[1] == max) rList.add(2);
        if (rArray[2] == max) rList.add(3);

        if (rList.size() == 0) return answer;
        else answer = new int[rList.size()];

        for (int i = 0; i < rList.size(); i++) {
            answer[i] = rList.get(i);
        }

        for (int i : answer) {
            System.out.println(i);
        }


        return answer;

//        for (int i = 0; i < rArray.length; i++) {
////            answer[i] = rArray[i] == max ? rArray[i] : 0;
//            if (rArray[i] == max) {
//            }
//        }



//        int j = 0;
//        answer[j] = rArray[0] == max ? 1 : answer[j];
//        answer[j] = rArray[1] == max ? 2 : answer[j];
//        answer[j] = rArray[2] == max ? 3 : answer[j];
    }




    public static int[] solution(int[] answers) {

        int[] answer = {};

        int[] su1Pattern = {1, 2, 3, 4, 5};
        int[] su2Pattern = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] su3Pattern = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] rArray = new int[3];

        for (int i = 0; i < answers.length; i++) {

            rArray[0] = answers[i] == su1Pattern[i % su1Pattern.length] ? ++rArray[0] : rArray[0];
            rArray[1] = answers[i] == su2Pattern[i % su2Pattern.length] ? ++rArray[1] : rArray[1];
            rArray[2] = answers[i] == su3Pattern[i % su3Pattern.length] ? ++rArray[2] : rArray[2];
        }

        int max = 0;

        ArrayList<Integer> rList = new ArrayList<>();

        for (int i = 0; i < rArray.length; i++) {
            max = max < rArray[i] ? rArray[i] : max;
        }

        if (rArray[0] == max) rList.add(1);
        if (rArray[1] == max) rList.add(2);
        if (rArray[2] == max) rList.add(3);

        if (rList.size() == 0) return answer;
        else answer = new int[rList.size()];

        for (int i = 0; i < rList.size(); i++) {
            answer[i] = rList.get(i);
        }

        return answer;
    }

}
