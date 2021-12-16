package algorithm.programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class 체육복 {
    public static void main(String[] args) {

//        practice(5, new int[]{2, 4}, new int[]{1, 3, 5});
//        practice(5, new int[]{2, 4}, new int[]{3});
//        practice(3, new int[]{3}, new int[]{1});
//        practice(5, new int[]{2, 4}, new int[]{5, 3});
//        practice(3, new int[]{1, 2}, new int[]{2, 3});
        practice(5, new int[]{2, 3, 4}, new int[]{1, 2, 3});
//        Random ran = new Random();
//        for (int i = 0; i < 5; i++) {
//            System.out.println(ran.nextInt(8));
//        }
    }

    /**
     *[탐욕법]
     *
     * 점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나
     * 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을
     * 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
     *
     * 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 체육수업을 들을 수 있는 학생의
     * 최댓값을 return 하도록 solution 함수를 작성해주세요.
     *
     * 제한사항
     * 전체 학생의 수는 2명 이상 30명 이하입니다.
     * 체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
     * 여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
     * 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
     * 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
     * 입출력 예
     * n	lost	reserve	return
     * 5	[2, 4]	[1, 3, 5]	5
     * 5	[2, 4]	[3]	4
     * 3	[3]	[1]	2
     * 입출력 예 설명
     * 예제 #1
     * 1번 학생이 2번 학생에게 체육복을 빌려주고, 3번 학생이나 5번 학생이 4번 학생에게 체육복을 빌려주면 학생 5명이 체육수업을 들을 수 있습니다.
     *
     * 예제 #2
     * 3번 학생이 2번 학생이나 4번 학생에게 체육복을 빌려주면 학생 4명이 체육수업을 들을 수 있습니다.
     */
    public static int practice(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);


        // 전체 학생 Loop
        for (int i = 1; i <= n; i++) {
            // 분실 학생 Loop
            for (int j = 0; j < lost.length; j++) {
                // 분실 학생일 경우
                if (i == lost[j]) {
                    // 여분 학생 Loop
                    for (int k = 0; k < reserve.length; k++) {
                        // 분실 학생의 앞뒤로 여분 학생이 있는 경우
                        if (lost[j] - 1 == reserve[k] || lost[j] + 1 == reserve[k]) {
                            // 여분 학생 빌리기 완료 처리
                            reserve[k] = 0;
                            answer++;
                            break;
                        }
                    }
                }
            }

        }


        System.out.println("answer   ::  " + answer);
        return answer;

//        int answer = n - lost.length;
//
//        Arrays.sort(lost);
//        Arrays.sort(reserve);
//
//        ArrayList<Integer> losts = new ArrayList<>();
//
//        for (int i : lost) {
//            boolean chk = true;
//            for (int j : reserve) {
//                if (i == j) {
//                    chk = false;
//                }
//            }
//            if (chk) losts.add(i);
//        }
//
//        // 전체 학생 Loop
//        for (int i = 1; i <= n; i++) {
//            // 분실 학생 Loop
//            for (int j = 0; j < losts.size(); j++) {
//                // 분실 학생일 경우
//                if (i == losts.get(j)) {
//                    // 여분 학생 Loop
//                    for (int k = 0; k < reserve.length; k++) {
//                        // 분실 학생의 앞뒤로 여분 학생이 있는 경우
//                        if (losts.get(j) - 1 == reserve[k] || losts.get(j) + 1 == reserve[k]) {
//                            // 여분 학생 빌리기 완료 처리
//                            reserve[k] = -1;
//                            answer++;
//                            break;
//                        }
//                    }
//                }
//            }
//
//        }
//
//
//        System.out.println("answer   ::  " + answer);
//        return answer;
    }
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int getCnt = 0;

        // 전체 학생 Loop
        for (int i = 1; i <= n; i++) {
            // 분실 학생 Loop
            for (int j = 0; j < lost.length; j++) {
                // 분실 학생일 경우
                if (i == lost[j]) {
                    // 빌리기 가능 여부 변수 선언
                    // 여분 학생 Loop
                    for (int k = 0; k < reserve.length; k++) {
                        // 분실 학생의 앞뒤로 여분 학생이 있는 경우 && 여분, 분실 학생이 같지 않을 경우
//                        if ((lost[j] - 1 == reserve[k] || lost[j] + 1 == reserve[k]) && lost[j] != reserve[k]) {
                        if ((lost[j] - 1 == reserve[k] || lost[j] + 1 == reserve[k]) && lost[j] != reserve[k]) {
                            // 여분 학생 빌리기 완료 처리
                            reserve[k] = 0;
                            getCnt++;
                            break;
                        }
                    }

                }
            }

        }

        answer = n - lost.length + getCnt;
        return answer;
    }

}
